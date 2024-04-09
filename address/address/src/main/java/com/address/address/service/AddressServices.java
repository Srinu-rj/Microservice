package com.address.address.service;


import com.address.address.entuti.Address;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface AddressServices {



    List<Address> getAddress();

    List<Address> saveAddress(List<Address> addresses);

    String deleteAddress(int addressId);

    Address updateAddress(Address updateAddress);

    Address findByCity(String city);

    Address save(Address address);

//    Address findByPinCode(String pinCode);

}
