package com.mi360.aladdin.product.service;

import java.util.Map;

public interface IPostFeeService {

	/**
	 * 根据商品id和 购买数量计算商品运费 
	 */
	Long calcPostFee(Integer productID, Integer buyNum, Integer countryID, Integer provinceID, Integer cityID, Integer districtID, String requestID);
	
	/**
	 * 根据商品id 查找其对应的运费模板 和模板类型   返回map的可以 分别为  freightTplID  freightType
	 */
	Map<String,Object> getProductFreight(Integer productID, String requestID);
}
