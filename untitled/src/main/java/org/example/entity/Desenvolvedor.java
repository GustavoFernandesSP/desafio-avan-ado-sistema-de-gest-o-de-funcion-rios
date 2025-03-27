package org.example.entity;


public class Desenvolvedor implements Funcionario {

    public Integer ID;
    public String nome;
    public Double salario;


    public Desenvolvedor(Integer ID, String nome, Double salario) {
        this.ID = ID;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public Double calcularSalario(){
        return this.salario += this.salario * 0.1;
    };

}
