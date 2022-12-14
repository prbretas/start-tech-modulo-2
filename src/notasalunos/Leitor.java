package notasalunos;

import java.util.Scanner;

public class Leitor {
    Scanner scanner = new Scanner(System.in);

    String lerString(String mensagem) {
        System.out.println(mensagem);
        return scanner.nextLine();
    }

    int lerInteiro(String mensagem) {
        while (true) {
            try {
                String string = lerString(mensagem);
                return Integer.parseInt(string);
            } catch (NumberFormatException e) {
                System.out.println("Digite um número válido.");
            }
        }
    }

    double lerDecimal(String mensagem) {
        while (true) {
            try {
                String string = lerString(mensagem);
                return Double.parseDouble(string);
            } catch (NumberFormatException e) {
                System.out.println("Digite um número válido.");
            }
        }
    }
}
