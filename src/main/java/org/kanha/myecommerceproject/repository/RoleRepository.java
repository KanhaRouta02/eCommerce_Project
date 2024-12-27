package org.kanha.myecommerceproject.repository;

import org.kanha.myecommerceproject.model.AppRole;
import org.kanha.myecommerceproject.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByRoleName(AppRole appRole);
}
