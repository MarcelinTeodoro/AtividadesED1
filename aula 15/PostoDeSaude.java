import java.util.Random;

public class PostoDeSaude {
    private static final int CAPACIDADE_MAXIMA = 100;
    private FilaAtendimento fila;

    public PostoDeSaude() {
        fila = new FilaAtendimento(CAPACIDADE_MAXIMA);
    }

    public void simularChegadaGrupos() {
        Random random = new Random();
        int idCounter = 1;

        for (int i = 0; i < 10; i++) {  // 10 grupos de 10 pessoas
            for (int j = 0; j < 10; j++) {
                Pessoa pessoa;
                if (j == 0) { // Necessidade Especial
                    pessoa = new Pessoa(idCounter++, "F", random.nextInt(80) + 20, false, false, true);
                } else if (j == 1) { // Gestante
                    pessoa = new Pessoa(idCounter++, "F", random.nextInt(40) + 18, true, false, false);
                } else if (j == 2) { // Lactante
                    pessoa = new Pessoa(idCounter++, "F", random.nextInt(40) + 18, false, true, false);
                } else if (j < 6) { // Acima de 60 anos
                    pessoa = new Pessoa(idCounter++, "M", random.nextInt(40) + 60, false, false, false);
                } else { // Prioridade Normal
                    pessoa = new Pessoa(idCounter++, "M", random.nextInt(50) + 10, false, false, false);
                }
                fila.insertLast(pessoa);
            }
        }
    }

    public void realizarAtendimentos() {
        int totalAtendidos = 0;

        for (int i = 1; i <= 10; i++) {  // 10 grupos de atendimento
            int numAtendimentos = i;

            Pessoa[] pessoasPrioritarias = fila.getSortedByPriority();
            for (int j = 0; j < numAtendimentos && totalAtendidos < CAPACIDADE_MAXIMA; j++) {
                if (pessoasPrioritarias[j] != null) {
                    System.out.println("Atendendo: " + pessoasPrioritarias[j]);
                    fila.deleteFront();
                    totalAtendidos++;
                }
            }
        }

        // Exibindo as pessoas que não foram atendidas
        if (!fila.isEmpty()) {
            System.out.println("\nPessoas que não foram atendidas:");
            Pessoa[] naoAtendidas = fila.getSortedByPriority();
            for (Pessoa p : naoAtendidas) {
                System.out.println(p);
            }
        }
    }

    public static void main(String[] args) {
        PostoDeSaude posto = new PostoDeSaude();
        posto.simularChegadaGrupos();
        posto.realizarAtendimentos();
    }
}
