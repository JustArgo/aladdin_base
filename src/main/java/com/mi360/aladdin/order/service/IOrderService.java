package com.mi360.aladdin.order.service;

import java.util.List;
import java.util.Map;

import com.mi360.aladdin.order.domain.GoodsReturn;
import com.mi360.aladdin.order.domain.MoneyReturn;
import com.mi360.aladdin.order.domain.Order;
import com.mi360.aladdin.order.domain.OrderPayment;

public interface IOrderService {
	
	/**
	 * 根据订单ID查找订单
	 */
	Order getOrderByID(Integer orderID, String requestID);
	
	/**
	 * 根据主订单id 查找子订单列表
	 */
	List<Order> getChildOrdersByParentOrderID(Integer orderID, String requestID);
	
	/**
	 * 根据主订单orderCode  查找子订单列表
	 */
	List<Order> getChildOrdersByParentOrderCode(String orderCode, String requestID);
	
	/**
	 * 新增订单
	 */
	int placeOrder(String mqID, String orderType, Integer[] skuIDs, Integer[] buyNums, Long[] skuPrices, Long pFee, Long pSum, String invoiceName, String notes, String requestID);
	
	/**
	 * 删除订单 
	 */
	int deleteOrder(Integer orderID, String requestID);
	
	/**
	 * 修改订单
	 */
	int updateOrder(Order order, String requestID);
	
	/**
	 * 根据订单号查询订单
	 */
	Order getOrderByOrderCode(String orderCode, String requestID);
	
	/**
	 * 根据下单用户的ID查询订单
	 */
	List<Order> getOrderByMqID(String mqID, String requestID);
	
	/**
	 * 拆分订单
	 */
	int divideOrder(Order order, String requestID);

	/**
	 * 根据订单状态查找订单
	 */
	List<Order> getOrderByOrderStatus(String mqID, String orderStatus, String requestID);
	
	/**
	 * 根据支付状态查找订单
	 */
	List<Order> getOrderByPayStatus(String mqID, String payStatus, String requestID);
	
	/**
	 * 根据退款状态查找订单
	 */
	List<Order> getOrderByReturnMoneyStatus(String mqID, String returnMoneyStatus, String requestID);
	
	/**
	 * 根据退货状态查找订单
	 */
	List<Order> getOrderByReturnGoodsStatus(String mqID, String returnGoodsStatus, String requestID);
	
	/**
	 * 根据发货状态查找订单 
	 */
	List<Order> getOrderByShippingStatus(String mqID, String shippingStatus, String requestID);
	
	/**
	 * 根据评论状态查找订单 
	 */
	List<Order> getOrderByCommentStatus(String mqID, String commentStatus, String requestID);
	
	/**
	 * 根据支付渠道查找订单
	 */
	List<Order> getOrderByPayChannel(String mqID, String channle, String requestID);
	
	/**
	 * 为某个订单设置收货地址
	 */
	Order setReceAdd(String mqID, Order order, String requestID);
	
	/**
	 * 申请退货
	 * @return 返回退货记录的id
	 */
	GoodsReturn applyReturnGoods(String mqID, String orderCode, Integer orderProductID, Long refundFee, String returnReason, String returnDesc, String[] imgs, String requestID);
	
	/**
	 * 申请退款
	 * @return 返回退款记录的id
	 */
	MoneyReturn applyReturnMoney(String mqID, String orderCode, Long refundFee, String refundReason, String refundDesc, String requestID);

	/**
	 * 查找退货单
	 */
	GoodsReturn getGoodsReturnByID(Integer goodsReturnID, String requestID);
	
	/**
	 * 查找退款单
	 */
	MoneyReturn getMoneyReturnByID(Integer moneyReturnID, String requestID);
	
	/**	
	 * 用户提交退货申请 商家点击审核 且选择审核通过 或不通过
     */
	int auditReturnGoods(String requestID, Integer goodsReturnID, String auditStatus, Integer uid);

	/**
	 *用户提交退款申请 商家点击审核  且选择审核通过 或不通过
     */
	int auditReturnMoney(String requestID, Integer moneyReturnID, String auditStatus, Integer uid);
	
	/**
	 * 根据退货单号  查找退货记录
	 * @param returnCode
	 * @param requestID
	 * @return
	 */
	GoodsReturn getGoodsReturnByReturnCode(String returnCode, String requestID);
	
	/**
	 * 根据退款单号 查找退款记录
	 * @param returnCode
	 * @param requestID
	 * @return
	 */
	MoneyReturn getMoneyReturnByReturnCode(String returnCode, String requestID);
	
	/**
	 * 新增订单支付历史  无论支付成功还是失败都要记录
	 * @param orderPayment
	 * @param requestID
	 * @return
	 */
	int addOrderPayment(OrderPayment orderPayment, String requestID);
	
	/**
	 * 查找出指定用户的 所有子订单
	 * @param mqID
	 * @param requestID
	 * @return
	 */
	List<Map<String,Object>> getChildOrderListByMqID(String mqID, String requestID);
}