package com.simplon.simplonsenegal.repositories;

import org.apache.catalina.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
@RestController
public interface RoleRepository extends JpaRepository<Role, Long> {
}
