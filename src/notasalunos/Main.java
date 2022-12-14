package notasalunos;

public class Main {
    public static void main(String[] args) {
        int quantidadeAlunos = 3;
        Aluno[] alunos = new Aluno[quantidadeAlunos];
        Leitor leitor = new Leitor();

        for(int i = 0; i < quantidadeAlunos; i++){
            Aluno aluno = new Aluno();
            aluno.nome = leitor.lerString("Digite o nome do aluno: ");
            aluno.notas[0] = leitor.lerDecimal("Digite a nota 1 do aluno: ");
            aluno.notas[1] = leitor.lerDecimal("Digite a nota 2 do aluno: ");
            aluno.notas[2] = leitor.lerDecimal("Digite a nota 3 do aluno: ");
            alunos[i] = aluno;
        }

        for(Aluno aluno : alunos) {
            System.out.printf("%s teve a média %f.\n", aluno.nome, aluno.calcularMedia());
        }
    }
}
