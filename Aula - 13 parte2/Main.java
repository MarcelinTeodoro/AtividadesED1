import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[1000];
        Random rand = new Random();

        // Gerar números aleatórios e armazenar no vetor
        for (int i = 0; i < 1000; i++) {
            vetor[i] = rand.nextInt(20000) - 9999;
        }

        ListaDuplamenteEncadeadaCircular lista = new ListaDuplamenteEncadeadaCircular();

        // Inserir elementos do vetor na lista em ordem crescente
        for (int num : vetor) {
            lista.inserirEmOrdem(num);
        }

        // Imprimir a lista em ordem crescente e decrescente
        System.out.println("-------Ordem Cresente --------");
        lista.printList(true);
        System.out.println("-------Ordem Decresente --------");
        lista.printList(false);

        // Remover números primos da lista
        lista.removePrimos();

        // Imprimir a lista após a remoção
        System.out.println("--------- Lista sem os Numeros que são primos ----------");
        lista.printList(true);
    }
}