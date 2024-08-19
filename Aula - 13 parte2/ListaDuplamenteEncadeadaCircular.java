public class ListaDuplamenteEncadeadaCircular {
    Node cabeça;

    public ListaDuplamenteEncadeadaCircular() {
        cabeça = new Node(-1); // Sentinela
        cabeça.anterior = cabeça.proximo = cabeça;
    }

    // Insere um nó na posição correta, mantendo a ordem crescente
    public void inserirEmOrdem(int valor) {
        Node novoNode = new Node(valor);
        Node atual = cabeça;

        // Encontrar o nó anterior ao local de inserção
        while (atual.proximo != cabeça && atual.proximo.valor < valor) {
            atual = atual.proximo;
        }

        // Ligar o novo nó aos nós anterior e posterior
        novoNode.anterior = atual;
        novoNode.proximo = atual.proximo;
        atual.proximo.anterior = novoNode;
        atual.proximo = novoNode;
    }

    // Imprime a lista na ordem especificada
    public void printList(boolean trueOrFalse) {
        Node atual;
        if (trueOrFalse) {
            atual = cabeça.proximo; // Começar da cabeça
        } else {
            atual = cabeça.anterior; // Começar da cauda
        }

        while (atual != cabeça) {
            System.out.print(atual.valor + " ");
            atual = trueOrFalse ? atual.proximo : atual.anterior;
        }
        System.out.println();
    }

    // Remove todos os nós com dados primos
    public void removePrimos() {
        Node atual = cabeça.proximo;
        while (atual != cabeça) {
            Node proximoDaLista = atual.proximo;
            if (isPrimo(atual.valor)) {
                System.out.println("numero primo a ser retirado:" + atual.valor);
                // Remover o nó
                atual.anterior.proximo = proximoDaLista;
                proximoDaLista.anterior = atual.anterior;
            }
            atual = proximoDaLista;
        }
    }

    // Função auxiliar para verificar se um número é primo
    private boolean isPrimo(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}