package com.address.address.controller;

import com.address.address.entuti.Address;
import com.address.address.service.AddressService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/address")
@RequiredArgsConstructor
@Slf4j
public class AddressController {

    private final AddressService addressService;


    @PostMapping("/save")
    public Address createAddress(@RequestBody Address address) {
        return addressService.createAddress(address);
    }

    @GetMapping("/fetch/{addressId}")
    public Optional<Address> getAddressById(@PathVariable("addressId") int addressId) {
        return addressService.getAddressById(addressId);
    }

    @GetMapping
    public List<Address> getAllAddresses() {
        return addressService.getAllAddresses();
    }
    @GetMapping("/get")
    public List<Address> findAllAddress() {
        return addressService.getAddress();
    }

    @GetMapping("/findPinCode/{pinCode}")
    public Address findByPinCode(@PathVariable int pinCode) {
        return addressService.findBypincode(pinCode);
    }

    @PutMapping("/update/{addressId}")
    public Address updateAddress(@RequestParam int addressId ,@RequestBody Address exitsAddress ){
        return addressService.updateAddressById(addressId,exitsAddress);
    }

}
