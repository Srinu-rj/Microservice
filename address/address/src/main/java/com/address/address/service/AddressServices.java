package com.address.address.service;


import com.address.address.entuti.Address;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface AddressServices {

    Address addAddress(Address address);

    List<Address> getAddress();

    List<Address> saveAddress(List<Address> addresses);

    Optional<Address> getById(int addressId);

    String deleteAddress(int addressId);

    Address updateAddress(Address updateAddress);

    Address findByCity(String city);

//    Address findByPinCode(String pinCode);

}
