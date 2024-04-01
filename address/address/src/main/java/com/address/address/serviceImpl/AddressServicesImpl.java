package com.address.address.serviceImpl;

import com.address.address.entuti.Address;
import com.address.address.repo.AddressRepo;
import com.address.address.service.AddressServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AddressServicesImpl implements AddressServices {

    private final AddressRepo addressRepo;

    @Override
    public Address addAddress(Address updateAddress) {
        return addressRepo.save(updateAddress);
    }

    @Override
    public List<Address> getAddress() {
        return addressRepo.findAll();
    }

    @Override
    public List<Address> saveAddress(List<Address> addresses) {
        return addressRepo.saveAll(addresses);
    }



    @Override
    public String deleteAddress(int addressId) {
        addressRepo.deleteById(addressId);
        return "AddressId deleted";
    }

    @Override
    public Address updateAddress(Address updateAddress) {
        Address existingAddress = addressRepo.findById(updateAddress.getAddressId())
                .orElseThrow(() -> new IllegalArgumentException("Cant't find Address ID"));

        existingAddress.setCity(updateAddress.getCity());
        existingAddress.setArea(updateAddress.getArea());
        existingAddress.setState(updateAddress.getState());
        existingAddress.setCountry(updateAddress.getCountry());
        existingAddress.setPinCode(updateAddress.getPinCode());

        addressRepo.save(existingAddress);
        return existingAddress;
    }

    @Override
    public Address findByCity(String city) {
        return addressRepo.findByCity(city);
    }

//    @Override
//    public Address findByPinCode(String pinCode) {
//        return addressRepo.findByPincode(pinCode);
//    }
}


