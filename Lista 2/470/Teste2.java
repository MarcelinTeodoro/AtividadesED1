import javax.swing.JOptionPane;

public class Teste2 {
    public static void main(String[] args) {
        Operaçao2 n1 = new Operaçao2();
        n1.numero = Integer.parseInt(JOptionPane.showInputDialog("Digiti um numero: "));
    
        if (n1.ehRegular(n1.numero)) {
            JOptionPane.showMessageDialog(null, "O número " + n1.numero + " nao é primo");
        } else {
            JOptionPane.showMessageDialog(null, "O número " + n1.numero + " é primo.");
        }
    }
}
