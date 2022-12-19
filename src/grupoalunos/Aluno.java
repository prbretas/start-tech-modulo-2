package grupoalunos;

public class Aluno {
    private String nome;
    private String email;
    private int idade;

    public Aluno(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String toString() {
        return String.format("%s(%d): %s", nome, idade, email);
    }
}
