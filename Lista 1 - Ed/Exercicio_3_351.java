import javax.swing.JOptionPane;

public class Exercicio_3_351 {
    public static void main(String[] args) {
        String nomes[] = new String[5];
        for(int a = 0 ; a < 5; a++){
            nomes[a] = JOptionPane.showInputDialog("Qual o Nome?");
        }
        
        String valor = JOptionPane.showInputDialog(null, "Fale o numero, sequencia que vc pediu os nomes");
        int b = Integer.parseInt(valor);
        JOptionPane.showMessageDialog(null, nomes[b-1]);
    }
}
