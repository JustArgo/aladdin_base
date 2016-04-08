package com.mi360.aladdin.product.vo;

import java.io.Serializable;

import com.mi360.aladdin.product.domain.Product;
import com.mi360.aladdin.supplier.domain.Supplier;

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
