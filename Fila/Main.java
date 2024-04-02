public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila();
        fila.criarFila(5);
        fila.inserirElemento(2);
        fila.inserirElemento(4);
        fila.inserirElemento(7);
        System.out.println("elemento removido: "+ fila.removerElemento());
        System.out.println("elemento removido: "+ fila.removerElemento());
        int posicao = fila.localizarElemento(7);
        if(posicao != -1){System.out.println("a posicao do elemento: "+ posicao);}else{System.out.println("nao esta na fila");}


        fila.destruirFila();
    }
}
