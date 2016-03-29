package com.aladdin.wx.mp.message.service;

import java.util.HashMap;
import java.util.Map;

/**
 * 微信公众号发送消息服务
 * 
 * @author JSC
 *
 */
public interface WxMpMessageService {
	/**
	 * 发送文本信息
	 * 
	 * @param openId
	 *            微信openId
	 * @param content
	 *            文本内容
	 * @return
	 */
	Map<String, Object> text(String openId, String content);

	enum TextErrcode {
		/** 发送成功 */
		e0("0", "发送成功"),
		/** 发送失败 */
		e210601("210601", "发送失败");
		/** 错误代码 */
		private String code;
		/** 错误信息 */
		private String msg;

		private TextErrcode(String code, String msg) {
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
