public class Operação3 {
    int numero;
    int numeroInvertido;

    boolean verificar(int valor){
        numeroInvertido = 0;
        while (( valor > 0 )) {
            numeroInvertido = numeroInvertido * 10 + valor % 10;
            valor /= 10;
        }
        return numero == numeroInvertido;
    }
    
}