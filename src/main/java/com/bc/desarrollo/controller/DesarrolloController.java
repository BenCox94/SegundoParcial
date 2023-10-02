package com.bc.desarrollo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bc.desarrollo.entity.Clientes;
import com.bc.desarrollo.service.DesarrolloService;



@RestController
@RequestMapping("/api/clientes")
public class DesarrolloController {

    private final DesarrolloService desarrolloService;

 
    public DesarrolloController(DesarrolloService desarrolloService) {
        this.desarrolloService = desarrolloService;
    }

    @GetMapping("/")
    public ResponseEntity<List<Clientes>> obtenerTodosLosClientes() {
        List<Clientes> clientes = desarrolloService.obtenerTodosLosClientes();
        return new ResponseEntity<>(clientes, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Clientes> obtenerClientesPorId(@PathVariable Long id) {
        Optional<Clientes> cliente = desarrolloService.obtenerClientePorId(id);
        if (cliente.isPresent()) {
            return new ResponseEntity<>(cliente.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/")
    public ResponseEntity<Clientes> guardarCliente(@RequestBody Clientes cliente) {
        Clientes nuevoCliente = desarrolloService.guardarCliente(cliente);
        return new ResponseEntity<>(nuevoCliente, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Clientes> actualizarCliente(@PathVariable Long id, @RequestBody Clientes nuevoCliente) {
        Clientes clienteActualizado = desarrolloService.actualizarCliente(id, nuevoCliente);
        if (clienteActualizado != null) {
            return new ResponseEntity<>(clienteActualizado, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
