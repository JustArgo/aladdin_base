package com.mi360.aladdin.product.vo;

import java.io.Serializable;
import java.util.List;

import com.mi360.aladdin.comment.vo.CommentVo;
import com.mi360.aladdin.product.domain.Product;
import com.mi360.aladdin.product.domain.ProductSku;

public class ProductVo implements Serializable{

	private static final long serialVersionUID = 2796643884761933555L;
	
	private Product product;
	private String productImg;
	private List<ProductSku> skus;
	private CommentVo commentVo;
	private Integer commentCount;
	private Integer goodCommentRate;
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public List<ProductSku> getSkus() {
		return skus;
	}
	public void setSkus(List<ProductSku> skus) {
		this.skus = skus;
	}
	public String getProductImg() {
		return productImg;
	}
	public void setProductImg(String productImg) {
		this.productImg = productImg;
	}
	public CommentVo getCommentVo() {
		return commentVo;
	}
	public void setCommentVo(CommentVo commentVo) {
		this.commentVo = commentVo;
	}
	public Integer getCommentCount() {
		return commentCount;
	}
	public void setCommentCount(Integer commentCount) {
		this.commentCount = commentCount;
	}
	public Integer getGoodCommentRate() {
		return goodCommentRate;
	}
	public void setGoodCommentRate(Integer goodCommentRate) {
		this.goodCommentRate = goodCommentRate;
	}
	@Override
	public String toString() {
		return "ProductVo [product=" + product + ", productImg=" + productImg
				+ ", skus=" + skus + ", commentVo=" + commentVo
				+ ", commentCount=" + commentCount + ", goodCommentRate="
				+ goodCommentRate + "]";
	}
}