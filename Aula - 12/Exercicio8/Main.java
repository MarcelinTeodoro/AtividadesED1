package Exercicio8;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
    TestaPilha testaPilha = new TestaPilha();
    Random random = new Random();

    for (int i = 0; i < 1000; i++) {
        int numero = random.nextInt(201) - 100; // Gera números entre -100 e 100
        testaPilha.operar(numero);
    }
}
}
