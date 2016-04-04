package com.maiquan.aladdin_product.service;

import java.util.List;
import java.util.Map;

import com.maiquan.aladdin_product.domain.Product;
import com.maiquan.aladdin_product.domain.ProductAttr;
import com.maiquan.aladdin_product.domain.ProductAttrValue;
import com.maiquan.aladdin_product.domain.ProductImg;

public interface IProductService {

	/**
	 * 查找指定状态的商品
	 * @param status
	 * @param requestID
	 * @return
	 */
	List<Product> getProductListByStatus(String status, String requestID);
	
	/**
	 * 查找所有商品
	 * @param requestID
	 * @return
	 */
	List<Product> queryProductList(String requestID);
	
	/**
	 * 根据id查找商品
	 * @param ID
	 * @param requestID
	 * @return
	 */
	Product queryProduct(Integer ID, String requestID);
	
	/**
	 * 根据类目查找商品
	 * @param categoryID
	 * @param requestID
	 * @return
	 */
	List<Product> getProductListByCategoryID(Integer categoryID, String requestID);
	
	/**
	 * 更新商品
	 * @param product
	 * @param requestID
	 * @return
	 */
	int updateProduct(Product product, String requestID);
	
	/**
	 * 删除商品
	 * @param ID
	 * @param requestID
	 * @return
	 */
	int deleteProduct(Integer ID, String requestID);
	
	/**
	 * 下架商品
	 * @param ID
	 * @param requestID
	 * @return
	 */
	int offShelfProduct(Integer ID, String requestID);
	
	/**
	 * 增加商品
	 * @param product
	 * @param requestID
	 * @return
	 */
	int addProduct(Product product, String requestID);
	
	/**
	 * 增加商品属性 对应的商品id已在 productAttr中
	 * @return 返回插入行的id
	 */
	int addProductAttr(ProductAttr productAttr, String requestID);
	
	/**
	 * 增加某个商品属性的可选值  对应的属性id  已在productAttrValue中
	 * @param productAttrValue
	 * @param requestID
	 * @return 返回插入行的id
	 */
	int addProductAttrValue(ProductAttrValue productAttrValue, String requestID);
	
	/**
	 * 根据商品id获得商品属性
	 * @param productID
	 * @param requestID
	 * @return
	 */
	List<ProductAttr> getProductAttrByProductID(Integer productID, String requestID);
	
	/**
	 * 根据商品属性ID获得 该属性对应的可选值
	 * @param attrID
	 * @param requestID
	 * @return
	 */
	List<ProductAttrValue> getAttrValuesByAttrID(Integer attrID, String requestID);
	
	int collectProduct(String mqID, Integer productID, String requestID);
	
	int uncollectProduct(String mqID, Integer productID, String requestID);
	
	List<Product> getProductListByIDs(Integer[] ids, String requestID); 
	
	/**
	 * 根据关键字搜索商品   模糊查询  (分页)
	 * @param keyWord  关键字
	 * @param startIndex  开始行
	 * @param pageSize	      每一页数量
	 * @param orderBy    如果orderBy=createTime 则按时间从大到小排   否则按价格 排  orderBy为asc或desc 
	 * @return
	 */
	List<Map> selectByKeyWordWithPagination(String keyWord, Integer startIndex, Integer pageSize, String orderBy, String requestID);

	/**
	 * 增加商品图片 
	 * @param productImg 
	 * @param requestID
	 * @return
	 */
	int addProductImg(ProductImg productImg, String requestID);
}
