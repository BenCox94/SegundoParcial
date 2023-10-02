package com.bc.desarrollo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bc.desarrollo.entity.Clientes;
import com.bc.desarrollo.repository.DesarrolloRepository;


@Service
public class DesarrolloService {

    private final DesarrolloRepository desarrolloRepository;

    public DesarrolloService(DesarrolloRepository desarrolloRepository) {
        this.desarrolloRepository = desarrolloRepository;
    }

    public List<Clientes> obtenerTodosLosClientes() {
        return desarrolloRepository.findAll();
    }

    public Optional<Clientes> obtenerClientePorId(Long id) {
        return desarrolloRepository.findById(id);
    }

    public Clientes guardarCliente(Clientes cliente) {
        return desarrolloRepository.save(cliente);
    }

    public Clientes actualizarCliente(Long id, Clientes nuevoCliente) {
        if (desarrolloRepository.existsById(id)) {
            nuevoCliente.setIdClientes(id);
            return desarrolloRepository.save(nuevoCliente);
        }
        return null;
    }
}
