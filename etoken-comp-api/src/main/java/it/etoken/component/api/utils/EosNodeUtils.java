package it.etoken.component.api.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;

import it.etoken.cache.service.CacheService;

@Component  
public class EosNodeUtils {

	@Autowired
	CacheService cacheService;
	
	/**
	 * 获取主节点Url
	 * @return
	 */
	public Map<String, String> getNodeUrls() {
		Map<String, String> result = new HashMap<String, String>();
		@SuppressWarnings("unchecked")
		List<JSONObject> node_list = cacheService.get("node_list", List.class);
		JSONObject pre_node = node_list.get(0);
		JSONObject secondary_node = node_list.get(1);
		String pre_url = pre_node.getString("url");
		String secondary_url = secondary_node.getString("url");
		
		result.put("url_chain", pre_url + "/v1/chain/");
		result.put("url_chain_backup", secondary_url + "/v1/chain/");
		result.put("url_history", pre_url + "/v1/history/");
		result.put("url_history_backup", secondary_url + "/v1/history/");
		
		return result;
	}
}
