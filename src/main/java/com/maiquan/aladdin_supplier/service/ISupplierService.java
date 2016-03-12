package com.maiquan.aladdin_supplier.service;

import com.maiquan.aladdin_supplier.domain.Supplier;

public interface ISupplierService {

	Supplier getSupplier(Integer supplierID, String requestID);
	
}
