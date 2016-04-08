package com.aladdin.user.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	 * @param upDistributionUserId
	 *            上级
	 * @param wxOpenId
	 *            用户的微信openId
	 * @param wxUnionId
	 *            用户的微信unionId
	 * @param wxNickname
	 *            用户的微信昵称
	 * @return
	 */
	Map<String, Object> createWx(String requestId, String upDistributionUserId, String wxOpenId, String wxUnionId,
			String wxNickname);

	/**
	 * 判断用户是否存在
	 * 
	 * @param requestId
	 *            请求标识
	 * @param mqId
	 *            麦圈用户id
	 * @return
	 */
	Map<String, Object> existsUser(String requestId, String mqId);

	/**
	 * 根据微信openId查找用户
	 * 
	 * @param requestId
	 *            请求标识
	 * @param openId
	 *            微信openId
	 * @return
	 */
	Map<String, Object> findByOpenId(String requestId, String openId);

	/**
	 * 根据麦圈集合查找用户
	 * 
	 * @param requestId
	 *            请求标识
	 * @param mqIds
	 *            麦圈集合
	 * @return
	 */
	Map<String, Object> findByMqId(String requestId, List<String> mqIds);

	enum FindByMqIdErrcode {
		/** 查询成功 */
		e0(0, "查询成功"),
		/** 查询失败 */
		e210601(210601, "查询失败");
		/** 代码 */
		private int code;
		/** 描述 */
		private String msg;
		/** 方法 */
		private String method;

		private FindByMqIdErrcode(int code, String msg) {
			this.code = code;
			this.msg = msg;
			this.method = "UserService.findByMqId";
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

	/**
	 * 根据微信openId查找用户错误代码
	 * 
	 * @author JSC
	 *
	 */
	enum FindByOpenIdErrcode {
		/** 查询成功 */
		e0(0, "查询成功"),
		/** 查询失败 */
		e210601(210601, "查询失败");
		/** 代码 */
		private int code;
		/** 描述 */
		private String msg;
		private String method;

		private FindByOpenIdErrcode(int code, String msg) {
			this.code = code;
			this.msg = msg;
			this.method = "UserService.findByOpenId";
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

	/**
	 * 微信用户注册错误代码
	 */
	enum CreateWxErrcode {
		/** 用户注册成功 */
		e0(0, "用户注册成功"),
		/** 用户注册失败：用户已经存在，不可以重复注册 */
		e210303(210303, "用户注册失败：用户已经存在，不可以重复注册"),
		/** 用户注册失败：其他原因 */
		e210403(210403, "用户注册失败：其他原因");
		/** 代码 */
		private int code;
		/** 描述 */
		private String msg;
		private String method;

		private CreateWxErrcode(int code, String msg) {
			this.code = code;
			this.msg = msg;
			this.method = "UserService.createWx";
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

	/**
	 * 判断用户是否存在错误代码
	 * 
	 * @author JSC
	 *
	 */
	enum ExistsUserErrcode {
		/** 查询成功 */
		e0(0, "查询成功"),
		/** 查询失败 */
		e210601(210601, "查询失败");
		/** 代码 */
		private int code;
		/** 描述 */
		private String msg;
		private String method;

		private ExistsUserErrcode(int code, String msg) {
			this.code = code;
			this.msg = msg;
			this.method = "UserService.existsUser";
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
