import java.util.LinkedList;
import java.util.Random;

public class Josephus {

    public static void main(String[] args) {
        // Criar lista circular de pessoas
        LinkedList<Pessoa> pessoas = new LinkedList<>();
        Random numeroAleatoria = new Random();
        Pessoa pessoa1 = new Pessoa("Marcelo","82724323534", "132312312", "2532232", 1);
        Pessoa pessoa2 = new Pessoa("Marco","827243235344", "1312312432", "53453", 2);
        Pessoa pessoa3 = new Pessoa("Marcel","827243534234", "1312243312", "12421243", 3);
        Pessoa pessoa4 = new Pessoa("Melo","82724323455334", "1312365412", "423432", 4);
        Pessoa pessoa5 = new Pessoa("Monica","827243254334", "1312316542", "243243", 5);
        Pessoa pessoa6 = new Pessoa("Maria","827243253534", "1312317542", "423342", 6);
        Pessoa pessoa7 = new Pessoa("Mario","82724323232424", "1312374512", "53534", 7);
        Pessoa pessoa8 = new Pessoa("Marcio","82724323524", "1312317452", "5232253", 8);
        Pessoa pessoa9 = new Pessoa("Marilha","827243234235", "131231543542", "5433643", 9);
        Pessoa pessoa10 = new Pessoa("Marcelho","827243233534", "1312314232", "63436543", 10);
        Pessoa pessoa11 = new Pessoa("Murilo","827243236344", "1312312243", "423256", 11);
        Pessoa pessoa12 = new Pessoa("Mel","827243236634", "13125443312", "643423", 12);
        Pessoa pessoa13 = new Pessoa("Melriani","82724323634", "13153432312", "458658", 13);
        Pessoa pessoa14 = new Pessoa("Malvaro","8272432334", "1312315342", "12356", 14);
        Pessoa pessoa15 = new Pessoa("Marziano","827243236344", "13123152352", "243423", 15);
        Pessoa pessoa16 = new Pessoa("Marina","82724326334", "131231523522", "2342423234", 16);
        Pessoa pessoa17 = new Pessoa("Minoria","827243236344", "1312352312", "432234", 17);
        Pessoa pessoa18 = new Pessoa("Madenio","827246453234", "1312315232", "3423", 18);
        Pessoa pessoa19 = new Pessoa("Marcos","82724323452235", "1312315232", "32421", 19);
        Pessoa pessoa20 = new Pessoa("Marcelo Augusto","827231243234", "1312532312", "9999", 20);
        pessoas.add(pessoa1);pessoas.add(pessoa2);pessoas.add(pessoa3);pessoas.add(pessoa4);
        pessoas.add(pessoa5);pessoas.add(pessoa6);pessoas.add(pessoa7);pessoas.add(pessoa8);
        pessoas.add(pessoa9);pessoas.add(pessoa10);pessoas.add(pessoa11);pessoas.add(pessoa12);
        pessoas.add(pessoa13);pessoas.add(pessoa14);pessoas.add(pessoa15);pessoas.add(pessoa16);
        pessoas.add(pessoa17);pessoas.add(pessoa18);pessoas.add(pessoa19);pessoas.add(pessoa20);
        
        // Simular eliminação de pessoas
        int index = 0;
        while (pessoas.size() > 1) {
            index = numeroAleatoria.nextInt(pessoas.size());
            
            

            // Remover a pessoa na posição atual
            pessoas.remove(index);
        }

        // Exibir pessoa sobrevivente
        Pessoa sobrevivente = pessoas.getFirst();
        System.out.println("Pessoa sobrevivente: " + sobrevivente.getNome()+ "Numero da pessoa: " + sobrevivente.getNumero());
    }
}



