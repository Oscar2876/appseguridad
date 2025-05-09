package com.example.demo.repository;


import com.example.demo.entity.usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<usuario, Long> {
    Optional<usuario> findByUsername(String username);
}