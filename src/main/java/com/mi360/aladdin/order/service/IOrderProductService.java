package com.mi360.aladdin.order.service;

import java.util.List;

import com.mi360.aladdin.order.domain.OrderProduct;

public interface IOrderProductService {

	
	OrderProduct getOrderProductByID(Integer orderProductID, String requestID);
	
	List<OrderProduct> getOrderProductByOrderID(Integer orderID, String requestID);
	
}
