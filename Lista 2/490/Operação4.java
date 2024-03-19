public class Operação4 {
    int totalRemovidos;

    public  int removerCaractere(char[] vetor, int tamanho, char caractere) {
        totalRemovidos = 0;
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == caractere) {
                vetor[i] = '*';
                totalRemovidos++;
            }
        }
        return totalRemovidos;
    }
    
    
    
}
