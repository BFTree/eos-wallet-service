package it.etoken.component.eosblock.service.task;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;
import com.squareup.okhttp.Response;

import it.etoken.base.common.exception.MLCommonException;
import it.etoken.base.common.exception.MLException;
import it.etoken.base.model.eosblock.entity.Delegatebw;
import it.etoken.component.eosblock.eosrpc.EosResult;
import it.etoken.component.eosblock.eosrpc.GetUndelegatebw;
import it.etoken.component.eosblock.service.DelegatebwService;

@Component
public class UndelegateTask {

	@Autowired
	DelegatebwService delegatebwService;
	
	@Value("${eos.server.api}")
	String EOS_SERVER_API;

    //@Scheduled(cron = "0 */1 * * * ?")
	public void getLargeRank() {
		try {
			List<Delegatebw> list=delegatebwService.findByCreateDate();
			if(list.size()>0) {
				for (Delegatebw delegatebw : list) {
					 JSONObject jsonObject = new JSONObject();
					 jsonObject.put("username", delegatebw.getAccountName());
					  EosResult resp = new GetUndelegatebw().run(EOS_SERVER_API, jsonObject.toString()); // http://localhost:7001/resource/delegate,需要在本地启动eos-server-api服务
				      if(resp.isSuccess()) {
				    	  delegatebw.setStatus(1L);//0是抵押，1是赎回
	     			      delegatebw.setModifydate(new Date());
					      delegatebwService.update(delegatebw); 
				      }else {
				    	  throw new MLException(MLCommonException.system_err);
				      }
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new MLException(MLCommonException.system_err);
		}

	}
}
