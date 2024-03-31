package com.address.address.repo;

import com.address.address.entuti.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends JpaRepository<Address,Integer> {
    Address findByCity(String city);

}
