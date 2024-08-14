public class Main {

    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        lista.inserir("Homer");
        lista.inserir("Marge");
        System.out.println("1) Lista após adicionar Homer e Marge:");
        lista.exibir();

        // 2) Esvazie a lista e imprima.
        lista.esvaziar();
        System.out.println("2) Lista após esvaziar:");
        lista.exibir();

        // 3) Adicione Homer na lista. Depois adicione Bart na posição 0 e Moll na posição 1 e imprima a lista.
        lista.inserir("Homer");
        lista.inserirNaPosicao("Bart", 0);
        lista.inserirNaPosicao("Moll", 1);
        System.out.println("3) Lista após adicionar Homer, Bart na posição 0 e Moll na posição 1:");
        lista.exibir();

        // 4) Esvazie a lista.
        lista.esvaziar();
        System.out.println("4) Lista após esvaziar:");
        lista.exibir();

        // 5) Adicione Homer e Bart na lista e depois Adicione Lisa no início da lista. Imprima o resultado e o tamanho da lista.
        lista.inserir("Homer");
        lista.inserir("Bart");
        lista.inserirNoInicio("Lisa");
        System.out.println("5) Lista após adicionar Homer, Bart e Lisa no início:");
        lista.exibir();
        System.out.println("Tamanho da lista: " + lista.tamanho());

        // 6) Esvazie a lista e imprima.
        lista.esvaziar();
        System.out.println("6) Lista após esvaziar:");
        lista.exibir();

        // 7) Adicione Homer e Maggie na lista. Depois adicione Bart na posição 0 e Marge na posição 1 e imprima a lista.
        // Verifique se Lisa está na lista.
        lista.inserir("Homer");
        lista.inserir("Maggie");
        lista.inserirNaPosicao("Bart", 0);
        lista.inserirNaPosicao("Marge", 1);
        System.out.println("7) Lista após adicionar Homer, Maggie, Bart na posição 0 e Marge na posição 1:");
        lista.exibir();
        System.out.println("Lisa está na lista? " + lista.contem("Lisa"));

        // 8) Esvazie a lista.
        lista.esvaziar();
        System.out.println("8) Lista após esvaziar:");
        lista.exibir();

        // 9) Adicione Homer e Bart na lista e depois imprima o resultado e o tamanho da lista.
        lista.inserir("Homer");
        lista.inserir("Bart");
        System.out.println("9) Lista após adicionar Homer e Bart:");
        lista.exibir();
        System.out.println("Tamanho da lista: " + lista.tamanho());

        // 10) Verifique se Marge, Homer, Bart e Maggie estão na lista e depois imprima o resultado e o tamanho da lista.
        System.out.println("10) Verificação de presença na lista:");
        System.out.println("Marge está na lista? " + lista.contem("Marge"));
        System.out.println("Homer está na lista? " + lista.contem("Homer"));
        System.out.println("Bart está na lista? " + lista.contem("Bart"));
        System.out.println("Maggie está na lista? " + lista.contem("Maggie"));
        System.out.println("Tamanho da lista: " + lista.tamanho());

        // 11) Esvazie a lista.
        lista.esvaziar();
        System.out.println("11) Lista após esvaziar:");
        lista.exibir();

        // 12) Adicione Homer e Bart no começo da lista. Depois adicione Marge, e depois Maggie na posição 1 e depois Ned
        // Flanders no Começo da lista e Sr. Burns no Final da lista imprima a lista
        lista.inserirNoInicio("Homer");
        lista.inserirNoInicio("Bart");
        lista.inserir("Marge");
        lista.inserirNaPosicao("Maggie", 1);
        lista.inserirNoInicio("Ned Flanders");
        lista.inserir("Sr. Burns");
        System.out.println("12) Lista após as inserções múltiplas:");
        lista.exibir();

        // 13) Remova do fim da lista e imprima a lista.
        lista.remover("Sr. Burns");
        System.out.println("13) Lista após remover do fim (Sr. Burns):");
        lista.exibir();

        // 14) Remova a posição 1, depois imprima a lista e o tamanho da lista.
        lista.remover("Maggie");
        System.out.println("14) Lista após remover a posição 1 (Maggie):");
        lista.exibir();
        System.out.println("Tamanho da lista: " + lista.tamanho());

        // 15) Verifique se Marge, Homer, Bart e Maggie estão na lista e depois imprima o resultado e o tamanho da lista.
        System.out.println("15) Verificação de presença na lista:");
        System.out.println("Marge está na lista? " + lista.contem("Marge"));
        System.out.println("Homer está na lista? " + lista.contem("Homer"));
        System.out.println("Bart está na lista? " + lista.contem("Bart"));
        System.out.println("Maggie está na lista? " + lista.contem("Maggie"));
        System.out.println("Tamanho da lista: " + lista.tamanho());

        // 16) Remova do começo da lista, depois imprima a lista e o tamanho da lista.
        lista.remover("Ned Flanders");
        System.out.println("16) Lista após remover do começo (Ned Flanders):");
        lista.exibir();
        System.out.println("Tamanho da lista: " + lista.tamanho());

        // 17) Verifique se Marge, Homer, Bart e Maggie estão na lista e depois imprima o resultado e o tamanho da lista.
        System.out.println("17) Verificação de presença na lista:");
        System.out.println("Marge está na lista? " + lista.contem("Marge"));
        System.out.println("Homer está na lista? " + lista.contem("Homer"));
        System.out.println("Bart está na lista? " + lista.contem("Bart"));
        System.out.println("Maggie está na lista? " + lista.contem("Maggie"));
        System.out.println("Tamanho da lista: " + lista.tamanho());

        // 18) Esvazie a lista e imprima.
        lista.esvaziar();
        System.out.println("18) Lista após esvaziar:");
        lista.exibir();
    }
}