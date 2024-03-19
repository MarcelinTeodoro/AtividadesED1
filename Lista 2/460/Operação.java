import javax.swing.JOptionPane;

public class Operação {
    int numero;
    int resultado;
    
    
    int dobrar(int valor){
        
        return (valor*2);
    }
    void fazerOperação(){
        this.numero  =  Integer.parseInt(JOptionPane.showInputDialog("Digiti um numero: "));
        this.resultado = this.dobrar(this.numero);
        JOptionPane.showMessageDialog(null, this.resultado);
    }


    
}
