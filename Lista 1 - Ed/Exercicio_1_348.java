import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio_1_348{
public static void main(String[] args) {
        String alunos[] = new String[5];
        
        double media[] = new double[5], pr1[] = new double[5], pr2[] = new double[5];
        DecimalFormat df = new DecimalFormat("#.#");

        for(int a = 0; a < 5; a++){
            String nome = JOptionPane.showInputDialog("Nome do aulno?");
            alunos[a] = nome;

            String nota1 = JOptionPane.showInputDialog("Qual foi a primera nota?");
            pr1[a] = Double.parseDouble(nota1);

            String nota2 = JOptionPane.showInputDialog("Qual foi a segunda nota?");
            pr2[a] = Double.parseDouble(nota2);

            media[a] = Double.parseDouble(df.format(((pr1[a]+pr2[a]) / 2)).replace(",", "."));
            
            
            System.out.println("------\n"+"Nome do aluno: "+ alunos[a]+"\nNota 1: "+pr1[a]+"\nNota 2: "+pr2[a]+"\nMédia: "+media[a]);
            
            
        }
    }
}
