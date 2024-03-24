import javax.swing.JOptionPane;

public class Teste5 {
    public static void main(String[] args) {
Operação5 op1 = new Operação5();

        while (true) {
            String  valor = JOptionPane.showInputDialog("imeiros  o wfsdfgoritimo");
            int entrada = Integer.parseInt(valor);
        
        
            switch (entrada) {
            case 1:
                op1.criarVetor1();
                break;
            
            case 2:
                op1.criarVetor2();

                break;
            
            case 3:
                op1.imprimir();
                break;
            case 4:
                op1.somar();
                break;
            case 5:
                op1.subtrair();
                break;
            case 6:
                
                System.exit(0);
                break;
            
            
            }
        }
    }
}
