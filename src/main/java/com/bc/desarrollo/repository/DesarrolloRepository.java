package com.bc.desarrollo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bc.desarrollo.entity.Clientes;

@Repository
public interface DesarrolloRepository extends JpaRepository<Clientes, Long> {
}
