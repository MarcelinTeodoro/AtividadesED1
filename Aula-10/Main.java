public class Main {

    public static void main(String[] args) {
        TorreDeHanoi torre  = new TorreDeHanoi();
        int numeroDiscos = 41; 

        // Resolvendo o problema para a quantidade de discos desejada
        System.out.println("execultando...");

        long inicio = System.currentTimeMillis();
        torre.moverDiscos(numeroDiscos, 1, 3, 2);
        long fim = System.currentTimeMillis();

        // Calculando o tempo de execução
        int segundos = (int) (fim - inicio) / 1000;
        int milissegundos = (int) (fim - inicio) % 1000;
        int minutos =  segundos/60;
        segundos = segundos % 60;
        int horas = minutos / 60;
        minutos = minutos % 60;


        System.out.println("Número mínimo de movimentos para " + numeroDiscos + " discos: " + torre.getContadorMovimentos());
        System.out.println("Tempo em horas:"+ horas +" minutos:"+minutos+" segundos:"+ segundos+" milesegundos:"+ milissegundos);
        System.out.println("Tempo: ("+horas+":"+minutos+":"+segundos+":"+milissegundos+")");
    }
}