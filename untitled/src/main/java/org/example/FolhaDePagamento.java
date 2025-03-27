package org.example;

import org.example.entity.Desenvolvedor;
import org.example.entity.Funcionario;
import org.example.entity.Gerente;

import java.util.ArrayList;
import java.util.List;

public class FolhaDePagamento {

    List<Funcionario> funcionarios = new ArrayList<Funcionario>();


    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(Funcionario funcionario) {
        funcionarios.remove(funcionario);
    }



    public void listarFuncionarios() {

        for (Funcionario funcionario : funcionarios) {

            if (funcionario instanceof Gerente) {
                Gerente gerente = (Gerente) funcionario;
                String mesnagem = String.format("Funcionário: %s (Gerente) - %.2f", gerente.getNome(), gerente.calcularSalario() );
                System.out.println(mesnagem);

            }else if (funcionario instanceof Desenvolvedor) {

                Desenvolvedor desenvolvedor = (Desenvolvedor) funcionario;
                String mesnagem = String.format("Funcionário: %s (Desenvolvedor) - %.2f", desenvolvedor.getNome(), desenvolvedor.calcularSalario() );
                System.out.println(mesnagem);

            }

        }
    }

    public double TotalFolha() {
        double total = 0.0;

        for (Funcionario funcionario : funcionarios) {
            double salarioFuncionario = funcionario.calcularSalario();  // Armazena o salário calculado

            if (funcionario instanceof Gerente) {

                Gerente gerente = (Gerente) funcionario;
                System.out.println("Salário do Gerente " + gerente.getNome() + ": " + salarioFuncionario); // Imprime salário do gerente
                total += salarioFuncionario;

            } else if (funcionario instanceof Desenvolvedor) {

                Desenvolvedor desenvolvedor = (Desenvolvedor) funcionario;
                System.out.println("Salário do Desenvolvedor " + desenvolvedor.getNome() + ": " + salarioFuncionario); // Imprime salário do desenvolvedor
                total += salarioFuncionario;

            }
        }
        System.out.println("Total da Folha de Pagamento: " + total);
        return total;
    }


}
