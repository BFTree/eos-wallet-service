package it.etoken.component.api.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;

import it.etoken.base.common.result.MLResult;
import it.etoken.base.common.result.MLResultList;
import it.etoken.base.common.result.MLResultObject;
import it.etoken.base.model.user.entity.EostRecord;
import it.etoken.base.model.user.entity.User;
import it.etoken.base.model.user.entity.UserExt;
import it.etoken.base.model.user.entity.UserPointRecord;
import it.etoken.base.model.user.vo.InviteInfo;
import it.etoken.base.model.user.vo.LoginUser;
import it.etoken.base.model.user.vo.UserPointVO;
import it.etoken.component.api.eosrpc.CreateAccount;
import it.etoken.component.api.eosrpc.EosResult;
import it.etoken.component.api.eosrpc.GetAccountInfo;
import it.etoken.component.api.exception.MLApiException;
import it.etoken.component.api.utils.EosNodeUtils;
import it.etoken.componet.user.facade.EostRecordFacadeAPI;
import it.etoken.componet.user.facade.UserFacadeAPI;
import it.etoken.componet.user.point.UserPointType;

@Controller
@RequestMapping(value = "/user")
public class UserController extends BaseController {

	private final static Logger logger = LoggerFactory.getLogger(BaseController.class);

	@Reference(version = "1.0.0", timeout = 10000,retries=0)
	UserFacadeAPI userFacadeAPI;
	
	@Reference(version = "1.0.0", timeout = 30000, retries=0)
	UserFacadeAPI userFacadeAPI2;
	
	@Reference(version = "1.0.0", timeout = 30000, retries=0)
	EostRecordFacadeAPI eostRecordFacadeAPI;
	
	@Autowired
	EosNodeUtils eosNodeUtils;
	
//	@Value("${nodeos.path.chain}")
//	String URL_CHAIN;
//	
//	@Value("${nodeos.path.chain.backup}")
//	String URL_CHAIN_BACKUP;
//	
	@Value("${eos.server.api}")
	String EOS_SERVER_API;
	
	@Value("${receive.point}")
	String receive_point;

	@ResponseBody
	@RequestMapping(value = "/info/{id}")
	public Object login(@PathVariable Long id, HttpServletRequest request) {
		logger.info("/info request map : " + id);
		try {

			String uid = request.getHeader("uid");
			if (uid == null) {
				return this.error(MLApiException.PARAM_ERROR, null);
			}
			MLResultObject<LoginUser> result = userFacadeAPI.loginUserInfo(Long.parseLong(uid));
			if (result.isSuccess()) {
				return this.success(result.getResult());
			} else {
				return this.error(result.getErrorCode(), result.getErrorHint(), null);
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			return this.error(MLApiException.SYS_ERROR, null);
		}
	}

	@ResponseBody
	@RequestMapping(value = "/invite/{id}")
	public Object inviteInfo(@PathVariable Long id, HttpServletRequest request) {
		logger.info("/invite request map : " + id);
		try {
			String uid = request.getHeader("uid");
			if (uid == null) {
				return this.error(MLApiException.PARAM_ERROR, null);
			}
			MLResultObject<InviteInfo> result = userFacadeAPI.inviteInfo(Long.parseLong(uid));
			if (result.isSuccess()) {
				return this.success(result.getResult());
			} else {
				return this.error(result.getErrorCode(), result.getErrorHint(), null);
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			return this.error(MLApiException.SYS_ERROR, null);
		}
	}

	@ResponseBody
	@RequestMapping(value = "/getBindCode/{id}")
	public Object getBindCode(@PathVariable Long id, HttpServletRequest request) {
		logger.info("/getBindCode request map : " + id);
		try {
			String uid = request.getHeader("uid");
			if (uid == null) {
				return this.error(MLApiException.PARAM_ERROR, null);
			}
			MLResultObject<String> result = userFacadeAPI.getBindCode(Long.parseLong(uid));
			if (result.isSuccess()) {
				return this.success(result.getResult());
			} else {
				return this.error(result.getErrorCode(), result.getErrorHint(), null);
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			return this.error(MLApiException.SYS_ERROR, null);
		}
	}

	@ResponseBody
	@RequestMapping(value = "/bindCode")
	public Object getBindCode(@RequestBody Map<String, String> req, HttpServletRequest request) {
		logger.info("/getBindCode request map : " + req);
		try {
			String uid = request.getHeader("uid");
			;
			String code = req.get("code");
			if (StringUtils.isEmpty(uid) || StringUtils.isEmpty(code)) {
				return this.error(MLApiException.PARAM_ERROR, null);
			}
			MLResult result = userFacadeAPI.bindCode(Long.parseLong(uid), code);
			if (result.isSuccess()) {
				return this.success(null);
			} else {
				return this.error(result.getErrorCode(), result.getErrorHint(), null);
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			return this.error(MLApiException.SYS_ERROR, null);
		}
	}

	@ResponseBody
	@RequestMapping(value = "/point/fetch")
	public Object fetchPoint(@RequestBody Map<String, String> requestMap, HttpServletRequest request) {
		logger.info("/fetchPoint request map : " + requestMap);
		try {
			String uid = request.getHeader("uid");
			MLResultObject<UserPointVO> result = userFacadeAPI.getPoint(uid);
			if (result.isSuccess()) {
				return this.success(result.getResult());
			} else {
				return this.error(result.getErrorCode(), result.getErrorHint(), null);
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			return this.error(MLApiException.SYS_ERROR, null);
		}
	}

	@ResponseBody
	@RequestMapping(value = "/signin")
	public Object signin(@RequestBody Map<String, String> requestMap, HttpServletRequest request) {
		logger.info("/signin request map : " + requestMap);
		try {
			String uid = request.getHeader("uid");
			MLResultObject<UserPointRecord> result = userFacadeAPI.updatePoint(UserPointType.SIGN_IN, uid);
			if (result.isSuccess()) {
				return this.success(result.getResult());
			} else {
				return this.error(result.getErrorCode(), result.getErrorHint(), null);
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			return this.error(MLApiException.SYS_ERROR, null);
		}
	}
	@ResponseBody
	@RequestMapping(value = "/isSigned")
	public Object isLogin(@RequestBody Map<String, String> requestMap, HttpServletRequest request) {
		try {
			String uid = request.getHeader("uid");
			MLResultObject<Boolean> result = userFacadeAPI.isSigned(uid);
			if(result.isSuccess()) {
				return this.success(result.getResult());
			}
			return this.error(MLApiException.SYS_ERROR, null);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			return this.error(MLApiException.SYS_ERROR, null);
		}
	}

	@ResponseBody
	@RequestMapping(value = "/createEosAccount")
	public Object createEosAccount(@org.springframework.web.bind.annotation.RequestBody Map<String, String> requestMap,
			HttpServletRequest request) {
		logger.error("/createEosAccount request map : " + requestMap);

		String uid = request.getHeader("uid") ;//request.getHeader("uid");
		if (uid == null) {
			return this.error(MLApiException.PARAM_ERROR, null);
		}

		JSONObject jsonObject = new JSONObject();
		try {
			String name = requestMap.get("username");
			if (StringUtils.isEmpty(name) || name.length() != 12) {
				return this.error(MLApiException.ACCOUNT_NAME_ERR, "账户名称必须为12位");
			}
			jsonObject.put("username", requestMap.get("username"));
			jsonObject.put("owner", requestMap.get("owner"));
			jsonObject.put("active", requestMap.get("active"));
		} catch (JSONException e2) {
			e2.printStackTrace();
			return this.error(MLApiException.PARAM_ERROR, null);
		}

		EosResult resp = null;
		try {
			JSONObject getAccountJsonObject = new JSONObject();
			getAccountJsonObject.put("account_name", requestMap.get("username"));
			EosResult getAccountResp = new GetAccountInfo().run(eosNodeUtils.getNodeUrls().get("url_chain"), eosNodeUtils.getNodeUrls().get("url_chain_backup"),
					getAccountJsonObject.toString());
			if (getAccountResp.isSuccess()) {
				JSONObject jo = JSONObject.parseObject(getAccountResp.getData());
				String account_name = jo.getString("account_name");
				if(null!=account_name && account_name.equalsIgnoreCase(requestMap.get("username"))) {
					JSONArray permissions = jo.getJSONArray("permissions");
					String ownerPublicKey = "";
					String activePublicKey = "";
					for(int i=0;i<permissions.size();i++) {
						JSONObject permission = permissions.getJSONObject(i);
						String key = permission.getJSONObject("required_auth").getJSONArray("keys").getJSONObject(0).getString("key");
						String perm_name = permission.getString("perm_name");
						
						if(perm_name.equalsIgnoreCase("owner")) {
							ownerPublicKey = key;
						}else if(perm_name.equalsIgnoreCase("active")) {
							activePublicKey = key;
						}
					}
					if(activePublicKey.equalsIgnoreCase(requestMap.get("active"))) {
						return this.success(true);
					}
				}
				// 已经存在，不能创建账号
				return this.error(MLApiException.ACCOUNT_NAME_EXIST, null);
			}
			logger.error("/createEosAccount........,uid: "+uid);
			if(1==1) {
				return this.error(MLApiException.ACCOUNT_NAME_ERR, "100积分免费创建活动已结束，更多活动敬请期待！");
			}
			MLResultObject<Boolean> canCreateResult = userFacadeAPI.canCreateEosAccountByUid(Long.parseLong(uid));
			if (canCreateResult.isSuccess()) {
				Boolean canCreate = canCreateResult.getResult();
				if (canCreate) {
					// 远程创建EOS账号
					resp = new CreateAccount().run(EOS_SERVER_API, jsonObject.toString()); // http://localhost:7001/account/create,需要在本地启动eos-server-api服务
					if (resp.isSuccess()) {
						// 保存数据库
						UserExt userExt = new UserExt();
						userExt.setEosAccount(requestMap.get("username"));
						userExt.setUid(Long.parseLong(uid));
						MLResultObject<Boolean> createEosAccountResult = userFacadeAPI2.createEosAccount(userExt);
						if (createEosAccountResult.isSuccess()) {
							return this.success(createEosAccountResult.getResult());
						} else {
							return this.error(createEosAccountResult.getErrorCode(),
									createEosAccountResult.getErrorHint(), null);
						}
					} else {
						// 创建失败
						return this.error(resp.getStatus(), resp.getData());
					}
				}
				return this.success(canCreateResult.getResult());
			} else {
				return this.error(canCreateResult.getErrorCode(), canCreateResult.getErrorHint(), null);
			}
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return this.error(MLApiException.EOSRPC_FAIL, null);
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/shareAddPoint")
	public Object shareAddPoint(HttpServletRequest request) {
		try{
			String uid = request.getHeader("uid") ;
			if (StringUtils.isEmpty(uid)) {
				return this.error(MLApiException.PARAM_ERROR, null);
			}
			MLResultObject<UserPointRecord> resultObject=userFacadeAPI.updatePoint(UserPointType.SHARE, uid);
			if(resultObject.isSuccess()) {
				return this.success(true);
			}else {
				return this.error(MLApiException.SYS_ERROR, null);
			}	
		}catch (Exception e) {
			logger.error(e.toString());
			return this.error(MLApiException.SYS_ERROR, null);
		}
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/eostRecord")
	public Object eostRecord(HttpServletRequest request) {
		try{
			String uid = request.getHeader("uid") ;
			if (StringUtils.isEmpty(uid)) {
				return this.error(MLApiException.PARAM_ERROR, null);
			}
			MLResultList<EostRecord> list=eostRecordFacadeAPI.findByUid(uid);
            if(list.isSuccess()) {
            	if(list.getList().size()>0) {
            		if(list.getList().size()>0) {
                 	   EostRecord eostRecord =list.getList().get(0);
                 	   Double eost= eostRecord.getEost();
                 	   eostRecord.setEost(-eost);
         			   return this.success(eostRecord);
         			}
    			}else{
    			   return this.error(MLApiException.WAItRECEIVE, "没有领取记录等待领取");
    			}
			}
		}catch (Exception e) {
			logger.error(e.toString());
			return this.error(MLApiException.SYS_ERROR, null);
		}
		return request;
	}
	
	@ResponseBody
	@RequestMapping(value = "/selectPoint")
	public Object selectPoint(HttpServletRequest request) {
		try{
			String uid = request.getHeader("uid") ;
			if (StringUtils.isEmpty(uid)) {
				return this.error(MLApiException.PARAM_ERROR, null);
			}
			MLResultObject<User> obj=userFacadeAPI.findByUid(uid);
			if(obj.isSuccess()) {
				User user=obj.getResult();
				String point=user.getPoint();
				Double eost=user.getEost();
				if(eost==0) {
					return this.error(MLApiException.NOEOST, "没有奖励可以领取。");
				}
				if(Integer.parseInt(point)<Integer.parseInt(receive_point)) {
					return this.error(MLApiException.NOEOST, "没有奖励可以领取。");
					//return this.error(MLApiException.POINTNOTENOUGH, "您的积分暂时没有达到领取标准，多多签到可以新增积分哦");
				}else {
					return this.error(MLApiException.NOEOST, "没有奖励可以领取。");
					//return this.success(true);
				}
				
			}
		}catch (Exception e) {
			logger.error(e.toString());
			return this.error(MLApiException.SYS_ERROR, null);
		}
		return request;
	}
	
	@ResponseBody
	@RequestMapping(value = "/eostReceive")
	public Object eostReceive(@RequestBody Map<String, String> requestMap,HttpServletRequest request) {
		try{
			String uid = request.getHeader("uid") ;
			if (StringUtils.isEmpty(uid)) {
				return this.error(MLApiException.PARAM_ERROR, null);
			}
			String eos_account=requestMap.get("eos_account");
			if (StringUtils.isEmpty(eos_account) || eos_account.length() != 12) {
				return this.error(MLApiException.ACCOUNT_NAME_ERR, "账户名称必须为12位");
			}
			MLResultList<EostRecord> list=eostRecordFacadeAPI.findByUid(uid);
            if(list.isSuccess()) {
            	if(list.getList().size()>0) {
            	   EostRecord eostRecord =list.getList().get(0);
            	   Double eost= eostRecord.getEost();
            	   eostRecord.setEost(-eost);
    			   return this.success(eostRecord);
    			}
			}
			MLResultObject<User> obj=userFacadeAPI.findByUid(uid);
			if(obj.isSuccess()) {
				User user=obj.getResult();
				String point=user.getPoint();
				Double eost=user.getEost();
				if(Integer.parseInt(point)<Integer.parseInt(receive_point)) {
					return this.error(MLApiException.POINTNOTENOUGH, "您的积分暂时没有达到领取标准，多多签到可以新增积分哦");
				}else {
					if(eost==0|| eost<0) {
						return this.error(MLApiException.NOEOST, "没有奖励可以领取。");
					}
					return this.error(MLApiException.NOEOST, "没有奖励可以领取。");
//					EostRecord eostRecord=new EostRecord();
//					eostRecord.setType("audit");
//					eostRecord.setUid(Long.parseLong(uid));
//					eostRecord.setEost(-user.getEost());
//					eostRecord.setEos_account(eos_account);
//					MLResult result=eostRecordFacadeAPI.saveEostRecord(eostRecord);
//					if(result.isSuccess()) {
//							return this.success(true);
//					}else {
//						return this.error(MLApiException.SYS_ERROR, null);
//					}
				}
			}
		}catch (Exception e) {
			logger.error(e.toString());
			return this.error(MLApiException.SYS_ERROR, null);
		}
		return request;
	}
}
