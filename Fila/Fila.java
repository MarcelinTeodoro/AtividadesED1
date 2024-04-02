public class Fila{
    private int tamanho;
    private int elementos[];
    private int inicio;
    private int fim;
    private int quantidade;

    void criarFila(int tamanhoMaximo){
        this.tamanho = tamanhoMaximo;
        this.elementos = new int[tamanhoMaximo];
        this.inicio = 0;
        this.fim = -1;

    }
    void destruirFila(){
        elementos = null;
    }
    public boolean filaCheia(){
        return quantidade == tamanho;
    }

    void inserirElemento(int elemento){
        if(filaCheia()){
            System.out.println("cheio");
            return;
        }
        fim = (fim+1)%tamanho;
        elementos[fim] = elemento;
        quantidade = quantidade+1;
        
    }
    boolean filaVazia(){
        return quantidade == 0;
    }
    int removerElemento(){
        if(filaVazia()){
            System.out.println("vazia");
            return 9999;
        }
        int elemntoRemovido = elementos[inicio];
        inicio = (inicio+1)%tamanho;
        quantidade= quantidade -1;
        return elemntoRemovido;
    }

    int localizarElemento(int elemento){
        int posicao = -1;
        for(int i = 0; i < tamanho;i++){
            if(elementos[i]==elemento){
            posicao = i;
            break;
            }
        }
        return posicao;
    }


}