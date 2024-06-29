package com.address.address.serviceImpl;

import com.address.address.entuti.Address;
import com.address.address.repo.AddressRepo;
import com.address.address.service.AddressService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class AddressServiceIMpl implements AddressService {

    private final AddressRepo addressRepo;


    @Override
    public List<Address> getAddress() {
        return addressRepo.findAll();
    }

    @Override
    public Address findBypincode(int pinCode) {
        return addressRepo.findByPinCode(String.valueOf(pinCode));
    }

    @Override
    public Optional<Address> findByAddressIdBy(int addressId) {
        return addressRepo.findById(addressId);
    }

    @Override
    public Address updateAddressById(int addressId, Address updateAddress) {
        Address exitAddress = addressRepo.findById(addressId)
                .orElseThrow(() -> new IllegalArgumentException("Need to Create Address,Not Found"));

        exitAddress.setArea(updateAddress.getArea());
        exitAddress.setCity(updateAddress.getCity());
        exitAddress.setState(updateAddress.getState());
        exitAddress.setCountry(updateAddress.getCountry());
        exitAddress.setPinCode(updateAddress.getPinCode());

        addressRepo.save(exitAddress);

        return exitAddress;
    }

    @Override
    public Address createAddress(Address address) {
        return addressRepo.save(address);
    }

    @Override
    public List<Address> getAllAddresses() {
        return addressRepo.findAll();
    }

    @Override
    public Optional<Address> getAddressById(int addressId) {
        return addressRepo.findById(addressId);
    }

    @Override
    public String deleteAddress(int addressId) {
        addressRepo.deleteById(addressId);
        return "addressId deleted success!!!!";
    }


}
