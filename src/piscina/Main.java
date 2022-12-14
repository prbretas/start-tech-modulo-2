package piscina;

public class Main {
    public static void main(String[] args) {
        Piscina piscina = new Piscina();
        Leitor leitor = new Leitor();

        piscina.largura = leitor.lerDecimal("Digite a largura: ");
        piscina.comprimento = leitor.lerDecimal("Digite o comprimento: ");
        piscina.profundidade = leitor.lerDecimal("Digite a profundidade: ");

        System.out.printf("O volume da piscina é %f m³.", piscina.calcularVolume());
    }
}
