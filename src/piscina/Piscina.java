package piscina;

public class Piscina {
    private double largura;
    private double comprimento;
    private double profundidade;

    public Piscina(double largura, double comprimento, double profundidade) {
        this.largura = largura;
        this.comprimento = comprimento;
        this.profundidade = profundidade;
    }

    double calcularVolume() {
        return largura * comprimento * profundidade;
    }

    public String toString() {
        return String.format("Piscina: %.2f, %.2f, %.2f.", largura, comprimento, profundidade);
    }
}
