package com.address.address.controller;

import com.address.address.entuti.Address;
import com.address.address.service.AddressServices;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/address")
@Slf4j
public class AddressController {
    private AddressServices addressServices;

    @PostMapping("/save")
    public Address saveAddress(@RequestBody @Valid Address address) {

        log.info("Address Are saved");
        return addressServices.save(address);
    }

    @PostMapping("/addMore")
    public List<Address> addAddress(@RequestBody List<Address> addresses) {
        return addressServices.saveAddress(addresses);
    }

    @GetMapping("/get")
    public List<Address> findAllAddress() {
        return addressServices.getAddress();
    }

    @DeleteMapping("/delete/{addressId}")
    public String deleteBill(@PathVariable int addressId) {
        return addressServices.deleteAddress(addressId);
    }

    @PutMapping("/update/{id}")
    public Address updateAddress(@RequestBody Address updateAddress) {
        return addressServices.updateAddress(updateAddress);
    }

    @GetMapping("/findCity/{city}")
    public Address findByAddressCity(@PathVariable String city) {
        return addressServices.findByCity(city);
    }
//
//    @PostMapping("/findByPinCode/{pinCode}")
//    public Address findByPinCode (@PathVariable String pinCode){
//        return addressServices.findByPinCode(pinCode);
//    }


}