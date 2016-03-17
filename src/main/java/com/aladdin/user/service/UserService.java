package com.aladdin.user.service;

import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

import com.aladdin.user.entity.BaseCollect;
import com.aladdin.user.entity.WxUser;

/**
 * 用户中心服务
 * 
 * @author JSC
 *
 */
public interface UserService {
	/**
	 * 微信用户注册
	 * 
	 * @param requestId
	 *            请求标识
	 * @param wxOpenId
	 *            用户的微信openId
	 * @param wxUnionId
	 *            用户的微信unionId
	 * @param wxNickname
	 *            用户的微信昵称
	 * @return
	 */
	Map<String, Object> createWx(String requestId, String wxOpenId, String wxUnionId, String wxNickname);

	/**
	 * 判断用户是否存在
	 * 
	 * @param requestId
	 *            请求标识
	 * @param mqId
	 *            麦圈用户id
	 * @return
	 */
	boolean existsUser(String requestId, String mqId);

	/**
	 * 查找用户收藏
	 * 
	 * @param requestId
	 *            请求标识
	 * @param mqId
	 *            麦圈用户id
	 * @return
	 */
	List<BaseCollect> findCollects(String requestId, String mqId);
}
