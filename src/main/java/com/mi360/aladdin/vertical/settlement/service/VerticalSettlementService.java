package com.mi360.aladdin.vertical.settlement.service;

import java.util.HashMap;
import java.util.Map;

public interface VerticalSettlementService {
	/**
	 * 根据用户id查找由直接下级销售得到的佣金信息
	 * 
	 * @param requestId
	 *            请求标识
	 * @param mqId
	 *            用户id
	 * @return
	 */
	Map<String, Object> findSales(String requestId, String mqId, int page, int pageSize);

	/**
	 * 根据用户id查找由直接下级销售得到的佣金信息
	 * 
	 * @param requestId
	 *            请求标识
	 * @param mqId
	 *            用户id
	 * @return
	 */
	Map<String, Object> findMemberSales(String requestId, String mqId, int page, int pageSize);

	enum FindMemberSalesErrcode {
		/** 查询成功 */
		e0(0, "查询成功"),
		/** 查询失败 */
		e210601(210601, "查询失败");
		private int code;
		private String msg;
		private String method;

		private FindMemberSalesErrcode(int code, String msg) {
			this.code = code;
			this.msg = msg;
			this.method = "VerticalSettlementService.findMemberSales";
		}

		public int getCode() {
			return code;
		}

		public void setCode(int code) {
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

	enum FindSalesErrcode {
		/** 查询成功 */
		e0(0, "查询成功"),
		/** 查询失败 */
		e210601(210601, "查询失败");
		private int code;
		private String msg;
		private String method;

		private FindSalesErrcode(int code, String msg) {
			this.code = code;
			this.msg = msg;
			this.method = "VerticalSettlementService.findSales";
		}

		public int getCode() {
			return code;
		}

		public void setCode(int code) {
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
