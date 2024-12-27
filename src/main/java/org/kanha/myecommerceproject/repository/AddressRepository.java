package org.kanha.myecommerceproject.repository;

import org.kanha.myecommerceproject.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
