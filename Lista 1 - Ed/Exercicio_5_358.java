import javax.swing.JOptionPane;

public class Exercicio_5_358 {
    public static void main(String[] args) {
        double preçoCompra[]= new double[100], preçoVenda[] = new double[100];
        int totalLucroMenor10 = 0, totalLucroMenor20 = 0, totalLucroMaior20= 0;

        for(int a= 0; a < 100;a++){
            String entrada1 = JOptionPane.showInputDialog("Qual o preço de Compra?");
            double compra = Double.parseDouble(entrada1);
            preçoCompra[a] = compra;

            String entrada2 = JOptionPane.showInputDialog("Qual o preço de Venda?");
            double venda = Double.parseDouble(entrada2);
            preçoVenda[a] = venda;

            
            if (preçoVenda[a] <  (1.10 * preçoCompra[a]) ) {
                totalLucroMenor10++;
            }else if (preçoVenda[a]<= (1.20*preçoCompra[a])) {
                totalLucroMenor20++;
            }else{
                totalLucroMaior20++;
            }
            

        }
        JOptionPane.showMessageDialog(null, "total de de mercadorias\n Menor que 10%: "+totalLucroMenor10+
        "\nMais que 10%:"+totalLucroMenor20+"\nMais que 20%:"+totalLucroMaior20);
    }
}
