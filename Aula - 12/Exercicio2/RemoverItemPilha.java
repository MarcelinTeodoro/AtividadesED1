package Exercicio2;

import java.util.Stack;

public class RemoverItemPilha {
    public  void removerItemComChave(Stack<Integer> pilha, int chave) {
        Stack<Integer> pilhaAuxiliar = new Stack<>();

        // Transferir itens da pilha original para a pilha auxiliar, exceto o item com a chave fornecida
        while (!pilha.isEmpty()) {
            int topo = pilha.pop();
            if (topo != chave) {
                pilhaAuxiliar.push(topo);
            }
        }

        // Transferir os itens de volta para a pilha original
        while (!pilhaAuxiliar.isEmpty()) {
            pilha.push(pilhaAuxiliar.pop());
        }
    }
}

