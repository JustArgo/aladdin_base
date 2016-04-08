package com.mi360.aladdin.receadd.service;

import java.util.List;

import com.mi360.aladdin.receadd.domain.Address;

public interface IAddressService {

	void addAddress(Address address, String requestID);
	Address getAddress(Integer id, String requestID);
	void addSubAddress(List<Address> addresses, String requestID);
	List<Address> getSubAddress(Integer pid, String requestID);
}
