package notasalunos;

import utils.Leitor;

public class Main {
    private final static int quantidadeAlunos = 3;
    private final static int quantidadeNotas = 3;

    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[quantidadeAlunos];
        Leitor leitor = new Leitor();

        for(int i = 0; i < quantidadeAlunos; i++){
            String nome = leitor.lerString("Digite o nome do aluno: ");
            double[] notas = leitor.lerVariosDecimais("Digite a nota do aluno: ", quantidadeNotas);
            alunos[i] = new Aluno(nome, notas);
        }

        for(Aluno aluno : alunos) {
            System.out.printf("%s teve a média %.2f.\n", aluno.getNome(), aluno.calcularMedia());
        }
    }
}
