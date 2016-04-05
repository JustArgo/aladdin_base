package com.aladdin.account.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

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
	 * 
	 */
	Map<String, Object> getRemainingSum(String requestId, String mqId);

	/**
	 * 获取用户冻结余额
	 * 
	 * @param requestId
	 *            请求标识
	 * @param mqId
	 *            麦圈用户id
	 * 
	 */
	Map<String, Object> getFrozenSum(String requestId, String mqId);

	/**
	 * 获取用户累计收入
	 * 
	 * @param requestId
	 *            请求标识
	 * @param mqId
	 *            麦圈用户id
	 * 
	 */
	Map<String, Object> getTotalEaring(String requestId, String mqId);

	/**
	 * 获取用户已提现金额
	 * 
	 * @param requestId
	 *            请求标识
	 * @param mqId
	 *            麦圈用户id
	 * 
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
	 * 
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
	 * 
	 */
	Map<String, Object> applyWithDraw(String requestId, long money, String mqId);

	/**
	 * 查找余额明细
	 * 
	 * @param requestId
	 *            请求标识
	 * @param mqId
	 *            麦圈用户id
	 * @param accountType
	 *            账户类型
	 * @param page
	 *            页码
	 * @param pageSize
	 *            每页数量
	 * 
	 */
	Map<String, Object> getAccountDetail(String requestId, String mqId, String accountType, int page, int pageSize);

	/**
	 * [内部接口]金牌会员分佣，增加冻结余额
	 * 
	 * @param requestId
	 *            请求标识
	 * @param param
	 *            参数，每个map中存放着分佣历史表id（distributionListId）、佣金（money）和用户id（mqId）
	 * @param mqId
	 *            麦圈用户id
	 * 
	 */
	Map<String, Object> verticalDistributionToFrozensum(String requestId, List<Map<String, Object>> param);

	/**
	 * 余额支付
	 * 
	 * @param requestId
	 *            请求标识
	 * @param mqId
	 *            麦圈用户id
	 * @param money
	 *            支付金额
	 * @return
	 */
	Map<String, Object> remainingPlay(String requestId, String mqId, long money);

	enum RemainingPlayErrcode {
		/** 余额扣除成功 */
		e0("0", "余额扣除成功"),
		/** 支付金额大于可用余额 */
		e210601("210601", "支付金额大于可用余额"),
		/** 支付金额小于等于0 */
		e210602("210602", "支付金额小于等于0"),
		/** 余额支付过程中账户发生修改 */
		e210603("210603", "余额支付过程中账户发生修改"),
		/** 其它错误 */
		e210604("210604", "其它错误");
		private String code;
		private String msg;
		private String method;

		private RemainingPlayErrcode(String code, String msg) {
			this.code = code;
			this.msg = msg;
			this.method = "AccountService.remainingPlay";
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
		 */
		public Map<String, Object> toMap() {
			Map<String, Object> map = new HashMap<>();
			map.put("errcode", code);
			map.put("errmsg", msg);
			map.put("method", method);
			return map;
		}
	}

	/**
	 * 金牌会员分佣错误代码
	 * 
	 * @author JSC
	 *
	 */
	enum VerticalDistributionToFrozensumErrcode {
		/** 分配佣金成功 */
		e0("0", "分配佣金成功"),
		/** 分配佣金失败 */
		e210601("210601", "分配佣金失败"),
		/** 分配佣金过程中账户发生修改 */
		e210602("210602", "分配佣金过程中账户发生修改");
		/** 代码 */
		private String code;
		/** 描述 */
		private String msg;
		/** 方法 */
		private String method;

		private VerticalDistributionToFrozensumErrcode(String code, String msg) {
			this.code = code;
			this.msg = msg;
			this.method = "AccountService.verticalDistributionToFrozensum";
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
		 */
		public Map<String, Object> toMap() {
			Map<String, Object> map = new HashMap<>();
			map.put("errcode", code);
			map.put("errmsg", msg);
			map.put("method", method);
			return map;
		}
	}

	/**
	 * 获取余额明细错误代码
	 * 
	 * @author JSC
	 *
	 */
	enum GetAccountDetailErrcode {
		/** 获取余额明细成功 */
		e0("0", "获取余额明细成功"),
		/** 获取余额明细失败 */
		e210601("210601", "获取余额明细失败");
		/** 代码 */
		private String code;
		/** 描述 */
		private String msg;
		/** 方法 */
		private String method;

		private GetAccountDetailErrcode(String code, String msg) {
			this.code = code;
			this.msg = msg;
			this.method = "AccountService.getAccountDetail";
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
		 */
		public Map<String, Object> toMap() {
			Map<String, Object> map = new HashMap<>();
			map.put("errcode", code);
			map.put("errmsg", msg);
			map.put("method", method);
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
		/** 方法 */
		private String method;

		private GetTotalWithdrawErrcode(String code, String msg) {
			this.code = code;
			this.msg = msg;
			this.method = "AccountService.getTotalWithdraw";
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
		 */
		public Map<String, Object> toMap() {
			Map<String, Object> map = new HashMap<>();
			map.put("errcode", code);
			map.put("errmsg", msg);
			map.put("method", method);
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
		/** 方法 */
		private String method;

		private GetTotalEaringErrcode(String code, String msg) {
			this.code = code;
			this.msg = msg;
			this.method = "AccountService.getTotalEaring";
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
		 */
		public Map<String, Object> toMap() {
			Map<String, Object> map = new HashMap<>();
			map.put("errcode", code);
			map.put("errmsg", msg);
			map.put("method", method);
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
		/** 方法 */
		private String method;

		private GetFrozenSumErrcode(String code, String msg) {
			this.code = code;
			this.msg = msg;
			this.method = "AccountService.getFrozenSum";
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
		 */
		public Map<String, Object> toMap() {
			Map<String, Object> map = new HashMap<>();
			map.put("errcode", code);
			map.put("errmsg", msg);
			map.put("method", method);
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
		/** 方法 */
		private String method;

		private GetRemainingSumErrcode(String code, String msg) {
			this.code = code;
			this.msg = msg;
			this.method = "AccountService.getRemainingSum";
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
		 */
		public Map<String, Object> toMap() {
			Map<String, Object> map = new HashMap<>();
			map.put("errcode", code);
			map.put("errmsg", msg);
			map.put("method", method);
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
		/** 方法 */
		private String method;

		private GetAccountInfoErrcode(String code, String msg) {
			this.code = code;
			this.msg = msg;
			this.method = "AccountService.getAccountInfo";
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
		 */
		public Map<String, Object> toMap() {
			Map<String, Object> map = new HashMap<>();
			map.put("errcode", code);
			map.put("errmsg", msg);
			map.put("method", method);
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
		e210601("210601", "提现申请金额大于可用余额"),
		/** 提现金额为0 */
		e210602("210602", "提现金额小于等于0"),
		/** 提现过程中账户发生修改 */
		e210603("210603", "提现过程中账户发生修改"),
		/** 其他错误 */
		e210604("210604", "其他错误");
		/** 代码 */
		private String code;
		/** 描述 */
		private String msg;
		/** 方法 */
		private String method;

		private ApplyWithDrawErrcode(String code, String msg) {
			this.code = code;
			this.msg = msg;
			this.method = "AccountService.applyWithDraw";
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
