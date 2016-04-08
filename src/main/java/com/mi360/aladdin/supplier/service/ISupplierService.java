package com.mi360.aladdin.supplier.service;

import java.util.List;

import com.mi360.aladdin.supplier.domain.Supplier;

public interface ISupplierService {

	Supplier getSupplier(Integer supplierID, String requestID);
	List<Supplier> getSupplierListByIDs(String requestID,Integer... ids);
}
