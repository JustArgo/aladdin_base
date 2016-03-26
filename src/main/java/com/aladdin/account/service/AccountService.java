package com.aladdin.account.service;

import java.util.Map;

/**
 * 用户资金服务
 * 
 * @author JSC
 *
 */
public interface AccountService {
	/**
	 * 获取用户可用余额
	 * 
	 * @param requestId
	 *            请求标识
	 * @param mqId
	 *            麦圈用户id
	 * @return
	 */
	long getRemainingSum(String requestId, String mqId);

	/**
	 * 获取用户冻结余额
	 * 
	 * @param requestId
	 *            请求标识
	 * @param mqId
	 *            麦圈用户id
	 * @return
	 */
	long getFrozenSum(String requestId, String mqId);

	/**
	 * 获取用户累计收入
	 * 
	 * @param requestId
	 *            请求标识
	 * @param mqId
	 *            麦圈用户id
	 * @return
	 */
	long getTotalEaring(String requestId, String mqId);

	/**
	 * 获取用户已提现金额
	 * 
	 * @param requestId
	 *            请求标识
	 * @param mqId
	 *            麦圈用户id
	 * @return
	 */
	long getTotalWithdraw(String requestId, String mqId);

	/**
	 * 获取用户资金信息：用户可用余额（remainingSum）、用户冻结余额（frozenSum）、用户累计收入（totalEaring）、
	 * 用户已提现金额 （totalWithdraw）
	 * 
	 * @param requestId
	 *            请求标识
	 * @param mqId
	 *            麦圈用户id
	 * @return 用户资金信息
	 */
	Map<String, Long> getAccountInfo(String requestId, String mqId);

	/**
	 * 申请提现
	 * 
	 * @param requestId
	 *            请求标识
	 * @param money
	 *            提现金额（分）
	 * @param mqId
	 *            麦圈用户id
	 * @return 提交申请提现成功或失败信息
	 */
	Map<String, Object> applyWithDraw(String requestId, long money, String mqId);
}
