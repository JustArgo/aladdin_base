package com.aladdin.account.service;

import java.util.HashMap;
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
	Map<String, Object> getRemainingSum(String requestId, String mqId);

	/**
	 * 获取用户冻结余额
	 * 
	 * @param requestId
	 *            请求标识
	 * @param mqId
	 *            麦圈用户id
	 * @return
	 */
	Map<String, Object> getFrozenSum(String requestId, String mqId);

	/**
	 * 获取用户累计收入
	 * 
	 * @param requestId
	 *            请求标识
	 * @param mqId
	 *            麦圈用户id
	 * @return
	 */
	Map<String, Object> getTotalEaring(String requestId, String mqId);

	/**
	 * 获取用户已提现金额
	 * 
	 * @param requestId
	 *            请求标识
	 * @param mqId
	 *            麦圈用户id
	 * @return
	 */
	Map<String, Object> getTotalWithdraw(String requestId, String mqId);

	/**
	 * 获取用户资金信息：用户可用余额（remainingSum）、用户冻结余额（frozenSum）、用户累计收入（totalEaring）、
	 * 用户已提现金额 （totalWithdraw）
	 * 
	 * @param requestId
	 *            请求标识
	 * @param mqId
	 *            麦圈用户id
	 * @return
	 */
	Map<String, Object> getAccountInfo(String requestId, String mqId);

	/**
	 * 申请提现
	 * 
	 * @param requestId
	 *            请求标识
	 * @param money
	 *            提现金额（分）
	 * @param mqId
	 *            麦圈用户id
	 * @return
	 */
	Map<String, Object> applyWithDraw(String requestId, long money, String mqId);

	/**
	 * 创建账户
	 * 
	 * @param requestId
	 *            请求标识
	 * @param mqId
	 *            麦圈用户id
	 * @return
	 */
	Map<String, Object> createAccount(String requestId, String mqId);

	/**
	 * 创建账户错误代码
	 * 
	 * @author JSC
	 *
	 */
	enum CreateAccountErrcode {
		/** 创建账户成功 */
		e0("0", "创建账户成功"),
		/** 创建账户失败 */
		e210601("210601", "创建账户失败");
		/** 代码 */
		private String code;
		/** 描述 */
		private String msg;

		private CreateAccountErrcode(String code, String msg) {
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

		/**
		 * 返回map形式
		 * 
		 * @return
		 */
		public Map<String, Object> toMap() {
			Map<String, Object> map = new HashMap<>();
			map.put("errcode", code);
			map.put("errmsg", msg);
			return map;
		}
	}

	/**
	 * 获取用户已提现金额错误代码
	 * 
	 * @author JSC
	 *
	 */
	enum GetTotalWithdrawErrcode {
		/** 获取用户已提现金额成功 */
		e0("0", "获取用户冻结余额成功"),
		/** 获取用户已提现金额失败 */
		e210601("210601", "获取用户冻结余额失败");
		/** 代码 */
		private String code;
		/** 描述 */
		private String msg;

		private GetTotalWithdrawErrcode(String code, String msg) {
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

		/**
		 * 返回map形式
		 * 
		 * @return
		 */
		public Map<String, Object> toMap() {
			Map<String, Object> map = new HashMap<>();
			map.put("errcode", code);
			map.put("errmsg", msg);
			return map;
		}
	}

	/**
	 * 获取用户累计收入错误代码
	 * 
	 * @author JSC
	 *
	 */
	enum GetTotalEaringErrcode {
		/** 获取用户累计收入成功 */
		e0("0", "获取用户冻结余额成功"),
		/** 获取用户累计收入失败 */
		e210601("210601", "获取用户冻结余额失败");
		/** 代码 */
		private String code;
		/** 描述 */
		private String msg;

		private GetTotalEaringErrcode(String code, String msg) {
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

		/**
		 * 返回map形式
		 * 
		 * @return
		 */
		public Map<String, Object> toMap() {
			Map<String, Object> map = new HashMap<>();
			map.put("errcode", code);
			map.put("errmsg", msg);
			return map;
		}
	}

	/**
	 * 获取用户冻结余额错误代码
	 * 
	 * @author JSC
	 *
	 */
	enum GetFrozenSumErrcode {
		/** 获取用户冻结余额成功 */
		e0("0", "获取用户冻结余额成功"),
		/** 获取用户冻结余额失败 */
		e210601("210601", "获取用户冻结余额失败");
		/** 代码 */
		private String code;
		/** 描述 */
		private String msg;

		private GetFrozenSumErrcode(String code, String msg) {
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

		/**
		 * 返回map形式
		 * 
		 * @return
		 */
		public Map<String, Object> toMap() {
			Map<String, Object> map = new HashMap<>();
			map.put("errcode", code);
			map.put("errmsg", msg);
			return map;
		}
	}

	/**
	 * 获取用户可用余额错误代码
	 * 
	 * @author JSC
	 *
	 */
	enum GetRemainingSumErrcode {
		/** 获取用户可用余额成功 */
		e0("0", "获取用户可用余额成功"),
		/** 获取用户可用余额失败 */
		e210601("210601", "获取用户可用余额失败");
		/** 代码 */
		private String code;
		/** 描述 */
		private String msg;

		private GetRemainingSumErrcode(String code, String msg) {
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

		/**
		 * 返回map形式
		 * 
		 * @return
		 */
		public Map<String, Object> toMap() {
			Map<String, Object> map = new HashMap<>();
			map.put("errcode", code);
			map.put("errmsg", msg);
			return map;
		}
	}

	/**
	 * 获取用户资金信息错误代码
	 * 
	 * @author JSC
	 *
	 */
	enum GetAccountInfoErrcode {
		/** 获取用户资金信息成功 */
		e0("0", "获取用户资金信息成功"),
		/** 获取用户资金信息失败 */
		e210601("210601", "获取用户资金信息失败");
		/** 代码 */
		private String code;
		/** 描述 */
		private String msg;

		private GetAccountInfoErrcode(String code, String msg) {
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

		/**
		 * 返回map形式
		 * 
		 * @return
		 */
		public Map<String, Object> toMap() {
			Map<String, Object> map = new HashMap<>();
			map.put("errcode", code);
			map.put("errmsg", msg);
			return map;
		}
	}

	/**
	 * 申请提现错误代码
	 * 
	 * @author JSC
	 *
	 */
	enum ApplyWithDrawErrcode {
		/** 提交申请成功 */
		e0("0", "提交申请成功"),
		/** 提现申请金额大于提现余额 */
		e210601("210601", "提现申请金额大于提现余额"),
		/** 提现金额为0 */
		e210602("210602", "提现金额为0"),
		/** 其他错误 */
		e210604("210604", "其他错误");
		/** 代码 */
		private String code;
		/** 描述 */
		private String msg;

		private ApplyWithDrawErrcode(String code, String msg) {
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

		/**
		 * 返回map形式
		 * 
		 * @return
		 */
		public Map<String, Object> toMap() {
			Map<String, Object> map = new HashMap<>();
			map.put("errcode", code);
			map.put("errmsg", msg);
			return map;
		}
	}
}
