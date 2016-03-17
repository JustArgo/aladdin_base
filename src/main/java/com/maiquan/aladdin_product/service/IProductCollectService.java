package com.maiquan.aladdin_product.service;

import java.util.List;

import com.maiquan.aladdin_product.vo.ProductCollectVo;

public interface IProductCollectService {

	List<ProductCollectVo> getProductCollectListByIDs(String mqID, String requestID);
	
}
