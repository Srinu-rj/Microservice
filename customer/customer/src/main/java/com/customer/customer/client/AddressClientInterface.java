package com.customer.customer.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(url = "http://localhost:7009",value = "Address")
public interface AddressClientInterface {

    @GetMapping("/api/address/get/{addressId}")
    List<AddresssClient>getAddressService(@PathVariable int addressId);
}
