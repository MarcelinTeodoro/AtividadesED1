import javax.swing.JOptionPane;

public class Exercicio_2_346 {
    public static void main(String[] args) {
        
        int operaçao = 0;
        while(operaçao != 4){
            String  valor = JOptionPane.showInputDialog("\n Menu \n 1- Imprime o compromento da frase \n 2 - Imprime os dois primeiros e dois ultimos caracteres da frase\n 3- Imprimem a frase espelhada\n 4-Termina o algoritimo");
            operaçao = Integer.parseInt(valor);
        
        
            switch (operaçao) {
                case 1:
                    String frase = JOptionPane.showInputDialog("Faça uma Frase");
                    JOptionPane.showMessageDialog(null,"O comprimento é"+ frase.length());
                    break;
        
                case 2:
                    String frase2 = JOptionPane.showInputDialog("Faça uma Frase");
                    int fim = frase2.length();
                    JOptionPane.showMessageDialog(null, frase2.substring(0,2)+frase2.substring((fim-2),fim));
                    break;
                case 3:
                    String frase3 = JOptionPane.showInputDialog("Faça uma Frase");

                    StringBuilder fraseInvertida = new StringBuilder(frase3).reverse();
                    
                    JOptionPane.showMessageDialog(null, fraseInvertida);

                    break;
            }

            
        }
    }
}
