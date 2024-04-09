package com.customer.customer.client;

import com.customer.customer.entity.CustomerWithAddress;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(url = "http://localhost:7009" ,value = "address")
public interface AddressClient {

    @GetMapping("/address/customer/{addressId}")
    List<CustomerWithAddress> getAddressOfCustomer(@PathVariable Long addressId);

}
