package com.address.address.service;

import com.address.address.entuti.Address;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface AddressService {

    List<Address> getAddress();


    Address findBypincode(int pinCode);

    Optional<Address> findByAddressIdBy(int addressId);

    Address updateAddressById(int addressId, Address updateAddress);

    Address createAddress(Address address);


    List<Address> getAllAddresses();

    Optional<Address> getAddressById(int addressId);

    String deleteAddress(int addressId);

}
