package com.aladdin.product.category.service;

import java.util.HashMap;
import java.util.Map;


/**
 * 商品分类服务
 * 
 * @author JSC
 *
 */
public interface ProductCategoryService {
	/**
	 * 列表
	 * 
	 * @param requestId
	 *            请求标识
	 * @return
	 */
	Map<String, Object> findList(String requestId);

	/**
	 * 清除缓存
	 * 
	 * @param requestId
	 *            请求标识
	 * @return
	 */
	Map<String, Object> flush(String requestId);

	/**
	 * 查找商品分类列表错误代码
	 * 
	 * @author JSC
	 *
	 */
	public enum FindListErrcode {
		/** 获取商品分类列表成功 */
		e0(0, "获取商品分类列表成功"),
		/** 获取商品分类列表失败 */
		e210601(210601, "获取商品分类列表失败");
		/** 代码 */
		private int code;
		/** 描述 */
		private String msg;

		private FindListErrcode(int code, String msg) {
			this.code = code;
			this.msg = msg;
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

		/**
		 * 返回Map形式
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
	 * 清除缓存错误错误代码
	 * 
	 * @author JSC
	 *
	 */
	public enum FlushErrcode {
		/** 清除缓存成功 */
		e0(0, "清除缓存成功"),
		/** 清除缓存失败 */
		e210601(210601, "清除缓存失败");
		/** 代码 */
		private int code;
		/** 描述 */
		private String msg;

		private FlushErrcode(int code, String msg) {
			this.code = code;
			this.msg = msg;
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

		/**
		 * 返回Map形式
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
