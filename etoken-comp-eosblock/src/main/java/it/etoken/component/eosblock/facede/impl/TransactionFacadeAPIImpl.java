package it.etoken.component.eosblock.facede.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSONObject;
import com.mongodb.BasicDBObject;

import it.etoken.base.common.exception.MLException;
import it.etoken.base.common.result.MLResultList;
import it.etoken.component.eosblock.service.TransactionsService;
import it.etoken.componet.eosblock.facade.TransactionsFacadeAPI;

@Service(version = "1.0.0")
public class TransactionFacadeAPIImpl implements TransactionsFacadeAPI{
	private final static Logger logger = LoggerFactory.getLogger(TransactionFacadeAPIImpl.class);
	@Autowired
	TransactionsService transactionsService;
	
	@Override
	public MLResultList<JSONObject> findByAccountAndActor(int page, int pageSize, String account, String actor,String code) {
		try {
			List<JSONObject> result= transactionsService.findByAccountAndActor(page, pageSize,account,actor,code);
			return new MLResultList<JSONObject>(result);
		} catch (MLException e) {
			logger.error(e.toString());
			return new MLResultList<JSONObject>(e);
		}
	}

	
	@Override
	public MLResultList<JSONObject> findByAccountAndActorNew(String last_id, int pageSize, String account, String actor,String code) {
		try {
			List<JSONObject> result= transactionsService.findByAccountAndActorNew(last_id, pageSize,account,actor,code);
			return new MLResultList<JSONObject>(result);
		} catch (MLException e) {
			logger.error(e.toString());
			return new MLResultList<JSONObject>(e);
		}
	}

	@Override
	public MLResultList<BasicDBObject> findAccountCoins(String account, String actor) {
		try {
			List<BasicDBObject> result= transactionsService.findAccountCoins(account,actor);
			return new MLResultList<BasicDBObject>(result);
		} catch (MLException e) {
			logger.error(e.toString());
			return new MLResultList<BasicDBObject>(e);
		}
	}


	@Override
	public MLResultList<JSONObject> getEosTransactionRecord(int start, int count, String account, String sort,
			String token, String contract) {
		try {
			List<JSONObject> result= transactionsService.getEosTransactionRecord(start, count,account,sort,token,contract);
			return new MLResultList<JSONObject>(result);
		} catch (MLException e) {
			logger.error(e.toString());
			return new MLResultList<JSONObject>(e);
		}
	}
}
