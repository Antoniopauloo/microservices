package com.example.cliente.service;

import com.example.cliente.model.Cliente;
import com.example.cliente.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public List<Cliente> listarTodos() {
        return repository.findAll();
    }

    public Cliente salvar(Cliente cliente) {
        return repository.save(cliente);
    }

    public Cliente buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
