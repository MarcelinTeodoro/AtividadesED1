

public class PilhaDinanmica {
    No topo;


    public PilhaDinanmica() {
        this.topo = null;
    }
    
    public  void empilhar(char valor){
        No novoNo = new No(valor);
        if (this.topo!= null) {
            novoNo.anterior = this.topo;
            this.topo.proximo = novoNo;
        }
        this.topo = novoNo;
    }
    public char desempilhar(){
        if(this.topo == null){
            System.out.println("esta vazia");
            return 0;
        }
        char valor = this.topo.dado;
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
}
