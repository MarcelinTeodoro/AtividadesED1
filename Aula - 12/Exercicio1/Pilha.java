package Exercicio1;
import java.util.Stack;
class Pilha {
    private Stack<Character> stack;

    public Pilha() {
        stack = new Stack<>();
    }

    public boolean estaVazia() {
        return stack.isEmpty();
    }

    public void empilhar(char item) {
        stack.push(item);
    }

    public char desempilhar() {
        return stack.pop();
    }

    public int tamanho() {
        return stack.size();
    }
}
