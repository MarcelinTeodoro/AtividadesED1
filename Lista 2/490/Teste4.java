

public class Teste4 {
    public static void main(String[] args) {
        Operação4 n1 =  new Operação4();
        String[] palavras = {"escola", "sacada", "algoritmos", "festa", "escada", "cantar", "tocar", "estudar", "pancada", "cansei"};
        char caractere = 'a';
        
        for (int i = 0; i < palavras.length; i++) {
            char[] vetorPalavra = palavras[i].toCharArray();
            int tamanhoPalavra = vetorPalavra.length;
            int totalRemovidos = n1.removerCaractere(vetorPalavra, tamanhoPalavra, caractere);
            String palavraModificada = new String(vetorPalavra);
            System.out.println(i + 1 + " - " + palavraModificada + " (" + totalRemovidos + ")");
        }
    }
}
