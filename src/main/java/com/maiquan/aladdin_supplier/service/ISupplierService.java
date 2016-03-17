package com.maiquan.aladdin_supplier.service;

import java.util.List;

import com.maiquan.aladdin_supplier.domain.Supplier;

public interface ISupplierService {

	Supplier getSupplier(Integer supplierID, String requestID);
	List<Supplier> getSupplierListByIDs(String requestID,Integer... ids);
}
