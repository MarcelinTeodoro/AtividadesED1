

public class PilhaDinanmica {
    Nodo topo;


    public PilhaDinanmica() {
        this.topo = null;
    }
    
    public  void empilhar(int valor){
        Nodo novoNo = new Nodo(valor);
        if (this.topo!= null) {
            novoNo.anterior = this.topo;
            this.topo.proximo = novoNo;
        }
        this.topo = novoNo;
    }
    public int desempilhar(){
        if(this.topo == null){
            System.out.println("esta vazia");
            return 0;
        }
        int valor = this.topo.dado;
        this.topo = this.topo.anterior;
        if (this.topo != null) {
            this.topo.proximo = null;
            
        }
        return valor;
    }
    public int  consutarTopo(){
        if (this.topo == null) {
            System.out.println("A pilha esta vazia");
            return -1;
        }
        return this.topo.dado;
    }
    public boolean estaVazia(){
        return this.topo == null;
    }
    public int qtdElementos(){
        int qtdElementos = 0;
        Nodo atual = this.topo;
        while (atual != null) {
            qtdElementos++;
            atual = atual.anterior;
        }

        return qtdElementos;
    }
}
