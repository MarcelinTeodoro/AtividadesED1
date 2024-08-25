
import java.util.Random;

public class Main {
    public static void main(String[] args) {
    PilhaDinanmica pilha1 = new PilhaDinanmica();// 1 a 3 4 a 6 7 a 9
    PilhaDinanmica pilha2 = new PilhaDinanmica();
    PilhaDinanmica pilha3 = new PilhaDinanmica();
    
    Random rand = new Random();
    
        for(int i = 0 ; i < 100; i++){

            int valor = rand.nextInt(9)+1;
            if (valor <= 3) {
                
                pilha1.empilhar(valor);
            }
            if ( valor >6) {
                pilha3.empilhar(valor);
            }
            if (valor > 3 && valor <= 6) {
                
                pilha2.empilhar(valor);
            }
        }

        for(int i = 0 ; i < 100; i++){

            int valor = rand.nextInt(3)+1;
            
            if (pilha1.estaVazia()) {
                System.out.println("O progama foi encerrado porque a pilha 1 esta vazia");
                break;
            }
            if (pilha2.estaVazia()) {
                System.out.println("O progama foi encerrado porque a pilha 2 esta vazia");
                break;
            }
            if (pilha3.estaVazia()) {
                System.out.println("O progama foi encerrado porque a pilha 3 esta vazia");
                break;
            }
            if (valor == 1) {
                int valor1 = pilha2.desempilhar();
                int valor2 = pilha3.desempilhar();

                System.out.println("Empilhando os numeros "+ valor1 +" e "+ valor2 +" na pilha 1" );
                pilha1.empilhar(valor1);
                pilha1.empilhar(valor2);
            }
            if (valor == 2) {
                int valor1 = pilha1.desempilhar();
                int valor2 = pilha3.desempilhar();

                System.out.println("Empilhando os numeros "+ valor1 +" e "+ valor2 +" na pilha 2");
                pilha2.empilhar(valor1);
                pilha2.empilhar(valor2);
            }
            if (valor == 3) {
                int valor1 = pilha1.desempilhar();
                int valor2 = pilha2.desempilhar();

                System.out.println("Empilhando os numeros "+ valor1 +" e "+ valor2 +" na pilha 3");
                pilha3.empilhar(valor1);
                pilha3.empilhar(valor2);
            }
        
        }
        
        

    }
}
