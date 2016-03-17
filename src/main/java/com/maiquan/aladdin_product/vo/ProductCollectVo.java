package com.maiquan.aladdin_product.vo;

import java.io.Serializable;

import com.maiquan.aladdin_product.domain.Product;
import com.maiquan.aladdin_supplier.domain.Supplier;

public class ProductCollectVo implements Serializable{

	private static final long serialVersionUID = 8652921411479463669L;
	
	private Product product;
	
	private Supplier supplier;
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	
	
	
	
	
}
