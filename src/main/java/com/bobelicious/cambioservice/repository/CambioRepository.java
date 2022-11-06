package com.bobelicious.cambioservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bobelicious.cambioservice.model.Cambio;

public interface CambioRepository extends JpaRepository<Cambio, Long> {
    
    public Optional<Cambio> findByFromAndTo(String from, String to);
}
