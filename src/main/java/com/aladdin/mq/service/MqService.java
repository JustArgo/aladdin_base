package com.aladdin.mq.service;


/**
 * 消息队列服务
 * 
 * @author JSC
 *
 */
public interface MqService {
	/**
	 * 添加纵向分销关系，若upDistributionUserId为null或空字符串，则distributionUserId表示用户成为顶级
	 * 
	 * @param requestId
	 *            请求标识
	 * @param upDistributionUserId
	 *            邀请者标识(上级)
	 * @param distributionUserId
	 *            受邀请者标识(下级)
	 * @return
	 */
	void joinDistribution(String requestId, String upDistributionUserId, String distributionUserId);

}
