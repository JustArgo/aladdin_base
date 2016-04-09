package com.mi360.aladdin.interaction.wx.service;

import java.util.Map;

import me.chanjar.weixin.mp.bean.result.WxMpPayResult;
import me.chanjar.weixin.mp.bean.result.WxMpUser;

/**
 * 微信交互
 * 
 * @author JSC
 *
 */
public interface WxInteractionService {
	/**
	 * 验证服务器地址的有效性
	 * 
	 * @param requestId
	 *            请求标识
	 * @param signature
	 *            微信加密签名，signature结合了开发者填写的token参数和请求中的timestamp参数、nonce参数。
	 * @param timestamp
	 *            时间戳
	 * @param nonce
	 *            随机数
	 * @return 是否有效
	 */
	boolean checkSignature(String requestId, String timestamp, String nonce, String signature);

	/**
	 * snsapi_base权限获取用户信息
	 * 
	 * @param requestId
	 *            请求标识
	 * @param code
	 * @return 微信用户信息
	 * @throws Exception
	 */
	WxMpUser getSnsapiBaseUserInfo(String requestId, String code) throws Exception;

	/**
	 * snsapi_userinfo权限获取用户信息
	 * 
	 * @param requestId
	 *            请求标识
	 * @param code
	 * @return 微信用户信息
	 * @throws Exception
	 */
	WxMpUser getSnsapiUserInfo(String requestId, String code) throws Exception;

	/**
	 * 构造微信oauth2授权的url连接
	 * 
	 * @param requestId
	 *            请求标识
	 * @param scope
	 * @param state
	 * @return url
	 */
	String oauth2buildAuthorizationUrl(String requestId, String scope, String state);
	
	WxMpUser userInfo(String requestId,String openId) throws Exception;

	/**
	 * 统一下单
	 * 
	 * @param requestId
	 *            请求标识
	 * @return
	 */
	Map<String, String> unifiedOrder(String requestId, Map<String, String> parameters);

	/**
	 * 初始化 js配置
	 * 
	 * @param requestId
	 *            请求标识
	 * @return
	 */
	Map<String, String> getConfig(String requestId);

	/**
	 * 查询订单支付信息
	 * 
	 * @param requestId
	 *            请求标识
	 * @param outTradeNo
	 * @return
	 */
	WxMpPayResult getPayResult(String requestId, String outTradeNo);
	
	/**
	 * 申请退款
	 */
	Map<String,String> refund(String requestId, Map<String,String> parameters);
	
	/**
	 * 查询退款详情
	 */
	Map<String,String> getRefundResult(String requestId, Map<String,String> parameters);

	/**
	 * 对参数进行签名
	 * @param parameters
	 * @return 返回签名
	 */
	String createSign(Map<String,String> parameters);
}
