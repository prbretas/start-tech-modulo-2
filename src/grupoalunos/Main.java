package grupoalunos;

public class Main {
    public static void main(String[] args) {
        Leitor leitor = new Leitor();
        int quantidadeAlunos = 3;
        Aluno[] alunos = new Aluno[quantidadeAlunos];

        for(int i = 0; i < quantidadeAlunos; i++) {
            Aluno aluno = new Aluno();

            aluno.nome = leitor.lerString("Digite o nome do aluno: ");
            aluno.email = leitor.lerString("Digite o email do aluno: ");
            aluno.idade = leitor.lerInteiro("Digite a idade do aluno: ");

            alunos[i] = aluno;
        }

        for(Aluno aluno : alunos) {
            System.out.printf("%s: %s - %d\n", aluno.nome, aluno.email, aluno.idade);
        }
    }
}
