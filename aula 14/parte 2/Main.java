import java.util.Random;

public class Main {
    public static void main(String[] args) {
    PilhaDinanmica par = new PilhaDinanmica();
    PilhaDinanmica impar = new PilhaDinanmica();
    Random rand = new Random();
    int valor= rand.nextInt(256)-127;
    

    while (valor!= 0) {
        if (valor % 2 == 0) {
            par.empilhar(valor);
        }else{
            impar.empilhar(valor);
        }
        valor = rand.nextInt(256)-127;
    }
    boolean v = false;
    while (!par.estaVazia() && !impar.estaVazia()) {
        
        valor = v ? par.desempilhar() :impar.desempilhar();
        
        v = !v;
    }
    if (impar.estaVazia()) {
        System.out.println("impar está vazia e par falta "+ par.qtdElementos()+" elementos");
        while (!par.estaVazia()) {
            System.out.print(par.desempilhar()+" ");

        }
    }

    else{
        System.out.println("par está vazia e impar falta "+ impar.qtdElementos()+" elementos");
        while (!impar.estaVazia()) {
            System.out.print(impar.desempilhar()+" ");
        }
    }
    

    
    
    }
}
