package Exercicio8;

import java.util.Stack;

class Pilha {
    private Stack<Integer> stack;

    public Pilha() {
        this.stack = new Stack<>();
    }

    public void push(int item) {
        stack.push(item);
    }

    public Integer pop() {
        if (!stack.isEmpty()) {
            return stack.pop();
        } else {
            return null;
        }
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}

public class TestaPilha {
    private Pilha pilhaP;
    private Pilha pilhaN;

    public TestaPilha() {
        this.pilhaP = new Pilha();
        this.pilhaN = new Pilha();
    }

    public void operar(int numero) {
        if (numero > 0) {
            pilhaP.push(numero);
        } else if (numero < 0) {
            pilhaN.push(numero);
        } else {
            Integer fromPilhaP = pilhaP.pop();
            Integer fromPilhaN = pilhaN.pop();
            System.out.println("Elemento retirado da pilha P: " + (fromPilhaP != null ? fromPilhaP : "Nenhum"));
            System.out.println("Elemento retirado da pilha N: " + (fromPilhaN != null ? fromPilhaN : "Nenhum"));
        }
    }
}
