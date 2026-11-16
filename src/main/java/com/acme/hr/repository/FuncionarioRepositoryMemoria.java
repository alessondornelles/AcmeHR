package com.acme.hr.repository;

import com.acme.hr.model.Funcionario;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class FuncionarioRepositoryMemoria {

    public class FuncionarioRepositoryMemoria
            implements Repository<Funcionario, String> {

        private final Map<String, Funcionario> funcionarios = new HashMap<>();

        @Override
        public void save(Funcionario funcionario) {
            funcionarios.put(funcionario.getId(), funcionario);
        }

        @Override
        public Optional<Funcionario> findById(String id) {
            return Optional.ofNullable(funcionarios.get(id));
        }

        @Override
        public List<Funcionario> findAll() {
            return new ArrayList<>(funcionarios.values());
        }

        @Override
        public void deleteById(String id) {
            funcionarios.remove(id);
        }
    }

}
