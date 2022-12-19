package notasalunos;

public class Aluno {
    private String nome;
    private double[] notas;

    public Aluno(String nome, double[] notas) {
        this.nome = nome;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public double calcularMedia() {
        double soma = 0;

        for(double nota : notas){
            soma += nota;
        }

        return soma / notas.length;
    }
}
