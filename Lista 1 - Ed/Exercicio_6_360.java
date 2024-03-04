import javax.swing.JOptionPane;

public class Exercicio_6_360 {
    public static void main(String[] args) {
        String [] signos = {"Capricórnio","Aquário","Peixes","Aries","Touro","Gêmeos","Câncer", "Leão","Virgem","Libra","Escorpião","Sagitário"};
        int ultimoDia[] = {20,19,20,20,20,20,21,22,22,22,21,21};
        short a;
        
        
        do {
            String entrada = JOptionPane.showInputDialog( "Qual dia e mes vc nasceu? (ddmm) ou 9999 para encerrar");
            a = Short.parseShort(entrada);
            int mes = a % 100;
            int dia = a / 100;
            mes--;
            if(a!= 9999){
                if (dia <= ultimoDia[mes] ){
                    JOptionPane.showMessageDialog(null, "signo:"+signos[mes]);

                }else{
                    mes++;
                    JOptionPane.showMessageDialog(null, "sigino:"+signos[mes]);
                }
            }
        } while (a!= 9999);
    }
}
