package com.acme.hr.model;

import java.math.BigDecimal;

public class Funcionario {
    public abstract class Funcionario {

        private String id;
        private String nome;
        private String cpf;
        private BigDecimal salarioBase;

        public Funcionario(
                String id,
                String nome,
                String cpf,
                BigDecimal salarioBase) {

            if (id == null || id.isBlank()) {
                throw new IllegalArgumentException("ID inválido.");
            }

            if (nome == null || nome.isBlank()) {
                throw new IllegalArgumentException("Nome inválido.");
            }

            if (cpf == null || cpf.isBlank()) {
                throw new IllegalArgumentException("CPF inválido.");
            }

            if (salarioBase == null ||
                    salarioBase.compareTo(BigDecimal.ZERO) <= 0) {
                throw new IllegalArgumentException(
                        "O valor do salário base deve ser maior que zero.");
            }

            this.id = id;
            this.nome = nome;
            this.cpf = cpf;
            this.salarioBase = salarioBase;
        }

        public String getId() {
            return id;
        }

        public String getNome() {
            return nome;
        }

        public String getCpf() {
            return cpf;
        }

        public BigDecimal getValorDiaria() {
            return salarioBase;
        }

    }
