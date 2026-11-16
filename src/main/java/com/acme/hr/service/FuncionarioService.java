package com.acme.hr.service;
import java.util.List;

import com.acme.hr.model.Funcionario;
import com.acme.hr.repository.FuncionarioRepositoryMemoria;
//import com.acme.hr.exception.EntidadeNaoEncontradaException;
//import com.acme.hr.exception.CadastroDuplicadoException;

public class FuncionarioService {
    private final FuncionarioRepositoryMemoria repository;

    public FuncionarioService(FuncionarioRepositoryMemoria repository) {
        this.repository = repository;
    }

    public void cadastrar(Funcionario funcionario) {

/*        boolean placaExiste = repository.findAll()
                .stream()
                .anyMatch(v -> v.getPlaca().equalsIgnoreCase(
                        funcionario.getPlaca()
                ));

        if (placaExiste) {
            throw new CadastroDuplicadoException(
                    "Já existe um veículo cadastrado com esta placa."
            );
        }
*/
        repository.save(funcionario);
    }

    public List<Funcionario> listarTodos() {
        return repository.findAll();
    }
    public List<Funcionario> listarDisponiveis() {
        return repository.findAll()
                .stream()
                .filter(Funcionario::isDisponivel)
                .toList();
    }

    public Funcionario buscarPorId(String id) {

        return repository.findById(id)
                .orElseThrow(() ->
                        new EntidadeNaoEncontradaException(
                                "Veículo não encontrado: " + id
                        )
                );
    }

    public void remover(String id) {

        Funcionario funcionario = buscarPorId(id);
        repository.deleteById(id);
    }
}

