import javax.swing.JOptionPane;

public class Teste3 {

    public static void main(String[] args) {
        Operação3 n1 = new Operação3();
        n1.numero = Integer.parseInt(JOptionPane.showInputDialog("Digiti um numero: "));
        if(n1.verificar(n1.numero)){
            JOptionPane.showMessageDialog(null, "o numero é capicua");
        }else{JOptionPane.showMessageDialog(null, "o numero não é capicua");;}
    }
}