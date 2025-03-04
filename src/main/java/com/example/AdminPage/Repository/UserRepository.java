package com.example.AdminPage.Repository;

import com.example.AdminPage.DTO.LoginDTO;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<LoginDTO,Long> {
    LoginDTO findByUsername(String username);
}
