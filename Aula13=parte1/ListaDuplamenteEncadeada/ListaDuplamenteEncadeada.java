public class ListaDuplamenteEncadeada {
    No inicio;
    No fim;


    public void criar(){
        this.inicio= null;
        this.fim = null;
    }
    
    public void inserir(String String){
        
        No novoNo = new No(String);
        if (this.inicio==null) {
            this.inicio = novoNo;
            this.fim = novoNo;
        }else{
            this.fim.proximo = novoNo;
            novoNo.anterior = this.fim;
            this.fim = novoNo;
        }
        
    }
    public void inserirNoInicio(String valor) {
        No novoNo = new No(valor);
        if (inicio == null) { 
            inicio = novoNo;
            fim = novoNo;
        } else {
            novoNo.proximo = inicio;
            inicio.anterior = novoNo;
            inicio = novoNo;
        }
    }
    public void inserirNaPosicao(String valor, int posicao) {
        if (posicao == 0) {
            inserirNoInicio(valor);
            return;
        }

        No novoNo = new No(valor);
        No atual = inicio;

        for (int i = 0; i < posicao - 1 && atual != null; i++) {
            atual = atual.proximo;
        }

        if (atual == null || atual.proximo == null) { // Adiciona no final se a posição for maior que o tamanho da lista
            inserir(valor);
        } else {
            novoNo.proximo = atual.proximo;
            novoNo.anterior = atual;
            atual.proximo.anterior = novoNo;
            atual.proximo = novoNo;
        }
    }
    public boolean contem(String valor) {
        No atual = inicio;
        while (atual != null) {
            if (atual.valor == valor) {
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }

    public int tamanho() {
        int tamanho = 0;
        No atual = inicio;
        while (atual != null) {
            tamanho++;
            atual = atual.proximo;
        }
        return tamanho;
    }

    public void exibir(){
        No atual = this.inicio;
        while (atual != null) {
            System.out.println(atual.valor +"");
            atual = atual.proximo;
        }
        System.out.println("\n");
    }

    public void remover(String String) {
        No atual = this.inicio;
    
        while (atual != null) {
            if (atual.valor == String) {
                
                if (atual.anterior != null) {
                    atual.anterior.proximo = atual.proximo;
                } else {
                    this.inicio = atual.proximo;
                }
    
                if (atual.proximo != null) {
                    atual.proximo.anterior = atual.anterior;
                } else {
                    this.fim = atual.anterior;
                }
    
                
                return;
            }
            
            atual = atual.proximo;
        }
    }
    
    public void esvaziar() {
        this.inicio = null;
        this.fim = null;
        
    }


}