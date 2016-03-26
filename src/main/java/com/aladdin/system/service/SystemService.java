package com.aladdin.system.service;

import java.util.HashMap;
import java.util.Map;

/**
 * 系统配置
 * 
 * @author JSC
 *
 */
public interface SystemService {
	/**
	 * 获取系统配置
	 * 
	 * @param requestId
	 *            请求标识
	 * @return
	 */
	Map<String, Object> getBaseConfigs();

	/**
	 * 清除系统配置缓存
	 * 
	 * @return
	 */
	Map<String, Object> flush();

	/**
	 * 根据配置Key查找配置
	 * 
	 * @param configKey
	 *            配置Key
	 * @return
	 */
	Map<String, Object> getBaseConfigByConfigKey(String configKey);

	enum ConfigKey {
		/** 金牌用户佣金比例 */
		fxyq_gold_rate("FXYQ_GOLD_RATE", "金牌用户佣金比例"),
		/** 渠道推广佣金比例 */
		fxyq_chan_rate("FXYQ_CHAN_RATE", "渠道推广佣金比例"),
		/** 消费自动升级*/
		fxyq_gold_consume_update("FXYQ_GOLD_CONSUME_UPDATE", "消费自动升级"),
		/** 关注自动升级 */
		fxyq_gold_motion_update("FXYQ_GOLD_MOTION_UPDATE", "关注自动升级"),
		/** 金牌用户名称 */
		fxyq_gold_name("FXYQ_GOLD_NAME", "金牌用户名称"),
		/** 推广渠道名称 */
		fxyq_chan_name("FXYQ_CHAN_NAME", "推广渠道名称"),
		/** 推广渠道自动升级 */
		fxyq_chan_update("FXYQ_CHAN_UPDATE", "推广渠道自动升级"),
		/** 推广渠道自动升级深度 */
		fxyq_chan_update_level("FXYQ_CHAN_UPDATE_LEVEL", "推广渠道自动升级深度"),
		/** 消费升级的金额 */
		fxyq_gold_sum("FXYQ_GOLD_SUM", "消费升级的金额");
		/** 代码 */
		private String code;
		/** 描述 */
		private String desc;

		private ConfigKey(String code, String desc) {
			this.code = code;
			this.desc = desc;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		/**
		 * 返回map形式
		 * 
		 * @return
		 */
		public Map<String, Object> toMap() {
			Map<String, Object> map = new HashMap<>();
			map.put("errcode", code);
			map.put("errmsg", desc);
			return map;
		}
	}

	/**
	 * 根据配置Key查找配置错误代码
	 * 
	 * @author JSC
	 *
	 */
	enum GetBaseConfigByConfigKeyErrcode {
		/** 清除缓存成功 */
		e0("0", "查找配置Key对应配置成功"),
		/** 清除缓存失败 */
		e210601("210601", "查找配置Key对应配置失败");
		/** 代码 */
		private String code;
		/** 描述 */
		private String msg;

		private GetBaseConfigByConfigKeyErrcode(String code, String msg) {
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
	 * 清除系统配置缓存错误代码
	 * 
	 * @author JSC
	 *
	 */
	enum FlushErrcode {
		/** 清除缓存成功 */
		e0("0", "清除缓存成功"),
		/** 清除缓存失败 */
		e210601("210601", "清除缓存失败");
		/** 代码 */
		private String code;
		/** 描述 */
		private String msg;

		private FlushErrcode(String code, String msg) {
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
	 * 获取系统配置错误代码
	 * 
	 * @author JSC
	 */
	enum GetBaseConfigErrcode {
		/** 获取系统配置成功 */
		e0("0", "获取系统配置成功"),
		/** 获取系统配置失败 */
		e210601("210601", "获取系统配置失败");
		/** 代码 */
		private String code;
		/** 描述 */
		private String msg;

		private GetBaseConfigErrcode(String code, String msg) {
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
