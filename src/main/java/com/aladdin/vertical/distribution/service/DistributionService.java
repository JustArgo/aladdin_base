package com.aladdin.vertical.distribution.service;

import java.util.HashMap;
import java.util.Map;

/**
 * 纵向分销引擎
 * 
 * @author JSC
 *
 */
public interface DistributionService {
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
	Map<String, Object> joinDistribution(String requestId, String upDistributionUserId, String distributionUserId);

	/**
	 * 查询上下级佣金设置
	 * 
	 * @param requestId
	 *            请求标识
	 * @param recordId
	 *            购买商品记录id
	 * @param mqId
	 *            麦圈用户id
	 * @return
	 */
	Map<String, Object> queryDistributionSetting(String requestId, String recordId, String mqId);

	/**
	 * 查询我的销售
	 * 
	 * @param requestId
	 *            请求标识
	 * @param mqId
	 *            麦圈用户id
	 * @param page
	 *            页数
	 * @param pageSize
	 *            每页数量
	 * @return
	 */
	Map<String, Object> findSales(String requestId, String mqId, int page, int pageSize);

	/**
	 * 查询我会员的销售
	 * 
	 * @param requestId
	 *            请求标识
	 * @param mqId
	 *            麦圈用户id
	 * @param page
	 *            页数
	 * @param pageSize
	 *            每页数量
	 * @return
	 */
	Map<String, Object> findMemberSales(String requestId, String mqId, int page, int pageSize);

	/**
	 * 查找直接下级
	 * 
	 * @param requestId
	 *            请求标识
	 * @param mqId
	 *            麦圈用户id
	 * @param page
	 *            页数
	 * @param pageSize
	 *            每页数量
	 * @return
	 */
	Map<String, Object> findLevel1(String requestId, String mqId, int page, int pageSize);

	/**
	 * 查询查找第二下级
	 * 
	 * @param requestId
	 *            请求标识
	 * @param mqId
	 *            麦圈用户id
	 * @param page
	 *            页数
	 * @param pageSize
	 *            每页数量
	 * @return
	 */
	Map<String, Object> findLevel2(String requestId, String mqId, int page, int pageSize);

	/**
	 * 查询第三级以下会员
	 * 
	 * @param requestId
	 *            请求标识
	 * @param mqId
	 *            麦圈用户id
	 * @param page
	 *            页数
	 * @param pageSize
	 *            每页数量
	 * @return
	 */
	Map<String, Object> findLevelFurther(String requestId, String mqId, int page, int pageSize);

	/**
	 * 查找直接下级错误代码
	 * 
	 * @author JSC
	 *
	 */
	enum FindLevel1Errcode {
		e0("0", "查询成功"), e210601("210601", "查询失败");
		private String code;
		private String msg;

		private FindLevel1Errcode(String code, String msg) {
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
	 * 查询查找第二下级错误代码
	 * 
	 * @author JSC
	 *
	 */
	enum FindLevel2Errcode {
		e0("0", "查询成功"), e210601("210601", "查询失败");
		private String code;
		private String msg;

		private FindLevel2Errcode(String code, String msg) {
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
	 * 查询第三级以下会员错误代码
	 * 
	 * @author JSC
	 *
	 */
	enum FindLevelFurtherErrcode {
		e0("0", "查询成功"), e210601("210601", "查询失败");
		private String code;
		private String msg;

		private FindLevelFurtherErrcode(String code, String msg) {
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
	 * 添加纵向分销关系接口错误代码
	 * 
	 * @author JSC
	 *
	 */
	enum JoinDistributionErrcode {
		/** 建立分销关系成功 */
		e0("0", "建立分销关系成功"),
		/** 建立分销关系失败，此用户已存在分销关系 */
		e210601("210601", "建立分销关系失败，此用户已存在分销关系"),
		/** 建立分销关系失败，上级用户不存在 */
		e210602("210602", "建立分销关系失败，上级用户不存在"),
		/** 建立分销关系失败，下级用户不存在 */
		e210603("210603", "建立分销关系失败，下级用户不存在"),
		/** 建立分销关系失败，其它错误 */
		e210604("210604", "建立分销关系失败，其它错误");

		/** 错误代码 */
		private String code;
		/** 错误信息 */
		private String msg;

		private JoinDistributionErrcode(String code, String msg) {
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
	 * 查询上下级佣金设置接口错误代码
	 * 
	 * @author JSC
	 *
	 */
	enum QueryDistributionSettingErrcode {
		/** 查询上下级佣金设置成功 */
		e0("0", "查询上下级佣金设置成功"),
		/** 查询上下级佣金设置失败，其它错误 */
		e210701("210701", "查询上下级佣金设置失败，其它错误");
		/** 错误代码 */
		private String code;
		/** 错误信息 */
		private String msg;

		private QueryDistributionSettingErrcode(String code, String msg) {
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
	 * 查询我的销售错误代码
	 * 
	 * @author JSC
	 *
	 */
	enum FindSalesErrcode {
		/** 查询上下级佣金设置成功 */
		e0("0", "查询我的销售成功"),
		/** 查询上下级佣金设置失败，其它错误 */
		e210701("210701", "查询我的销售失败");
		/** 错误代码 */
		private String code;
		/** 错误信息 */
		private String msg;

		private FindSalesErrcode(String code, String msg) {
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
	 * 查询我会员的销售错误代码
	 * 
	 * @author JSC
	 *
	 */
	enum FindMemberSalesErrcode {
		/** 查询我会员的销售成功 */
		e0("0", "查询我会员的销售成功"),
		/** 查询我会员的销售失败 */
		e210701("210701", "查询我会员的销售失败");
		/** 错误代码 */
		private String code;
		/** 错误信息 */
		private String msg;

		private FindMemberSalesErrcode(String code, String msg) {
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
