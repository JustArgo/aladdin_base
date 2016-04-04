package com.aladdin.vertical.settlement.service;

import java.util.HashMap;
import java.util.Map;

/**
 * 纵向实时佣金计算
 * 
 * @author JSC
 *
 */
public interface VerticalSettlementService {
	/**
	 * 纵向分配佣金
	 * 
	 * @param requestId
	 *            请求标识
	 * @param orderCode
	 *            主订单id
	 * @return
	 */
	Map<String, Object> distributeReward(String requestId, String orderCode);

	/**
	 * 纵向返还佣金
	 * 
	 * @param requestId
	 *            请求标识
	 * @param orderCode
	 *            退款订单id
	 * @return
	 */
	Map<String, Object> returnReward(String requestId, String returnCode);

	/**
	 * 横向实时佣金计算错误代码
	 * 
	 * @author JSC
	 *
	 */
	enum DistributeRewardErrcode {
		/** 纵向实时佣金计算成功 */
		e0("0", "纵向实时佣金计算成功"),
		/** 纵向实时佣金计算失败，其它错误 */
		e210601("", "纵向实时佣金计算失败，其它错误");
		/** 代码 */
		private String code;
		/** 描述 */
		private String msg;
		/** 方法 */
		private String method;

		private DistributeRewardErrcode(String code, String msg) {
			this.code = code;
			this.msg = msg;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getMsg() {
			return msg;
		}

		public void setMsg(String msg) {
			this.msg = msg;
		}

		public String getMethod() {
			return method;
		}

		public void setMethod(String method) {
			this.method = method;
		}

		/**
		 * 返回map形式
		 * 
		 * @return
		 */
		public Map<String, Object> toMap() {
			Map<String, Object> map = new HashMap<>();
			map.put("errcode", code);
			map.put("errmsg", msg);
			map.put("method", method);
			return map;
		}
	}

}
