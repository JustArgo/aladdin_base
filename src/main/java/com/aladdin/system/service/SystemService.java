package com.aladdin.system.service;

import java.util.Map;

/**
 * 系统设置
 * 
 * @author JSC
 *
 */
public interface SystemService {
	/**
	 * 获取系统设置
	 * 
	 * @param requestId
	 *            请求标识
	 * @return
	 */
	Map<String, Object> getBaseConfigs();

	/**
	 * 清除系统设置缓存
	 * 
	 * @return
	 */
	Map<String, Object> flush();
}
