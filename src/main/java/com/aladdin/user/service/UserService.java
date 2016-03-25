package com.aladdin.user.service;

import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;


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
	Map<String, Object> existsUser(String requestId, String mqId);

	/**
	 * 微信用户注册错误代码
	 */
	enum CreateWxErrcode {
		/** 用户注册成功 */
		e0("0", "用户注册成功"),
		/** 用户注册失败：用户已经存在，不可以重复注册 */
		e210303("210303", "用户注册失败：用户已经存在，不可以重复注册"),
		/** 用户注册失败：其他原因 */
		e210403("210403", "用户注册失败：其他原因");
		/** 代码 */
		private String code;
		/** 描述 */
		private String msg;

		private CreateWxErrcode(String code, String msg) {
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
	 * 判断用户是否存在错误代码
	 * 
	 * @author JSC
	 *
	 */
	enum ExistsUserErrcode {
		/** 查询成功 */
		e0("0", "查询成功"),
		/** 查询失败 */
		e210601("210601", "查询失败");
		/** 代码 */
		private String code;
		/** 描述 */
		private String msg;

		private ExistsUserErrcode(String code, String msg) {
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
