package com.address.address.repo;

import com.address.address.entuti.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface AddressRepo extends JpaRepository<Address,Integer> {

    Address findByPinCode(String pinCode);


//    List<Address> getAddressService(int addressId);
}
