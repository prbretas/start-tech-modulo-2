package grupoalunos;

import utils.Leitor;

public class Main {
    public static void main(String[] args) {
        Leitor leitor = new Leitor();
        int quantidadeAlunos = 1;
        Aluno[] alunos = new Aluno[quantidadeAlunos];

        for(int i = 0; i < quantidadeAlunos; i++) {
            String nome = leitor.lerString("Digite o nome do aluno: ");
            String email = leitor.lerString("Digite o email do aluno: ");
            int idade = leitor.lerInteiro("Digite a idade do aluno: ");

            alunos[i] = new Aluno(nome, email, idade);
        }

        for(Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
