package com.mi360.aladdin.product.service;

import java.util.List;

import com.mi360.aladdin.product.vo.ProductCollectVo;

public interface IProductCollectService {

	List<ProductCollectVo> getProductCollectListByMqID(String mqID, String requestID);
	
}
