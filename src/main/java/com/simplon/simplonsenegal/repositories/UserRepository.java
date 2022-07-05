package com.simplon.simplonsenegal.repositories;

import com.simplon.simplonsenegal.entities.ERole;
import org.apache.catalina.Role;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@Repository
@RestController
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<Role> findByName(ERole name);
}
