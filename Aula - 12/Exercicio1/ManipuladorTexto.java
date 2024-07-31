package Exercicio1;

class ManipuladorTexto {
    public  String inverterTexto(String texto) {
        Pilha pilha = new Pilha();
        for (char ch : texto.toCharArray()) {
            pilha.empilhar(ch);
        }

        StringBuilder textoInvertido = new StringBuilder();
        while (!pilha.estaVazia()) {
            textoInvertido.append(pilha.desempilhar());
        }

        return textoInvertido.toString();
    }

    public  boolean verificarPalindromo(String texto) {
        String textoFiltrado = texto.replaceAll("[\\s.]", "").toLowerCase();
        Pilha pilha = new Pilha();

        for (char ch : textoFiltrado.toCharArray()) {
            pilha.empilhar(ch);
        }

        StringBuilder textoInvertido = new StringBuilder();
        while (!pilha.estaVazia()) {
            textoInvertido.append(pilha.desempilhar());
        }

        return textoFiltrado.equals(textoInvertido.toString());
    }
}
