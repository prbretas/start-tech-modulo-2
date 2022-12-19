package utils;

import java.util.Scanner;

public class Leitor {
    private Scanner scanner = new Scanner(System.in);

    public String lerString(String mensagem) {
        System.out.println(mensagem);
        return scanner.nextLine();
    }

    public int lerInteiro(String mensagem) {
        while (true) {
            try {
                String string = lerString(mensagem);
                return Integer.parseInt(string);
            } catch (NumberFormatException e) {
                System.out.println("Digite um número válido.");
            }
        }
    }

    public double lerDecimal(String mensagem) {
        while (true) {
            try {
                String string = lerString(mensagem);
                return Double.parseDouble(string);
            } catch (NumberFormatException e) {
                System.out.println("Digite um número válido.");
            }
        }
    }

    public double[] lerVariosDecimais(String mensagem, int quantidade) {
        double[] numeros = new double[quantidade];

        for(int i = 0; i < quantidade; i ++) {
            String novaMensagem = String.format("%s (%d de %d) ", mensagem, i+1, quantidade);
            numeros[i] = lerDecimal(novaMensagem);
        }

        return numeros;
    }
}
