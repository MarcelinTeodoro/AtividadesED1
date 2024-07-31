package Exercicio1;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManipuladorTexto malador = new ManipuladorTexto();
        System.out.print("Digite uma sequência de caracteres: ");
        String texto = scanner.nextLine();
        scanner.close();
        String textoInvertido = malador.inverterTexto(texto);
        System.out.println("Texto na ordem inversa: " + textoInvertido);

        if (malador.verificarPalindromo(texto)) {
            System.out.println("O texto é um palíndromo.");
        } else {
            System.out.println("O texto não é um palíndromo.");
        }
    }

}
