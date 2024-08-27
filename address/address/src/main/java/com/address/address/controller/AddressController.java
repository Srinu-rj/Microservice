package com.address.address.controller;

import com.address.address.entuti.Address;
import com.address.address.service.AddressService;
import jakarta.ws.rs.Path;
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

//    @GetMapping("address/get/{addressId}")
//    public List<Address> getAllAddressByCustomer(@PathVariable int addressId){
//        return addressService.getAddressService(addressId);
//    }


    @PutMapping("/update/{addressId}")
    public Address updateAddress(@RequestParam int addressId, @RequestBody Address updateAddress) {
        return addressService.updateAddressById(addressId, updateAddress);
    }

    @DeleteMapping("/delete/{addressId}")
    public String deleteAddress(@PathVariable int addressId) {
        return addressService.deleteAddress(addressId);
    }
}
