package com.example.validation.repository;

import com.example.validation.model.Role;
import com.example.validation.model.RoleName;
import com.example.validation.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IUserRepository extends JpaRepository<User, Long> {
    Optional<Role> findByRoleName(RoleName roleName);
}
