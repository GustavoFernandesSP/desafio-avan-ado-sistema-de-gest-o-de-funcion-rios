package org.example;

import org.example.entity.Desenvolvedor;
import org.example.entity.Funcionario;
import org.example.entity.Gerente;

public class Main {
    public static void main(String[] args) {

    FolhaDePagamento folhaDePagamento = new FolhaDePagamento();

        Desenvolvedor desenvolvedor = new Desenvolvedor(1,"Gustavo", 3500.0);

        Desenvolvedor desenvolvedor2 = new Desenvolvedor(2,"Matheus", 5500.0);

        Gerente gerente = new Gerente(1,"Lucas", 13500.0);
        Gerente gerente2 = new Gerente(2,"Pedro", 8500.0);

        folhaDePagamento.adicionarFuncionario(desenvolvedor);
        folhaDePagamento.adicionarFuncionario(desenvolvedor2);
        folhaDePagamento.adicionarFuncionario(gerente);
        folhaDePagamento.adicionarFuncionario(gerente2);


//        folhaDePagamento.listarFuncionarios();

        System.out.println("Total da Folha de Pagamento: " + String.format("R$ %.2f", folhaDePagamento.TotalFolha()));




    }
}