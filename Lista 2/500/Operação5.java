import javax.swing.JOptionPane;

public class Operação5 {
    int vetor1[] = new int[5];
    int vetor2[] = new int[5];
    
    
    boolean statusVetor1 = false;
    boolean statusVetor2 = false;


    public boolean criarVetor1(){
        
        int b = 1;
        for(int i = 0; i < 5; i++){
            String  valor = JOptionPane.showInputDialog("Digiti numero "+ b +":");
            int entrada = Integer.parseInt(valor);
            this.vetor1[i] = entrada;
            b++;
        }
        statusVetor1 =  true;
        return true;
        
    }
    public boolean criarVetor2(){
        
        int b = 1;
        for(int i = 0; i < 5; i++){
            String  valor = JOptionPane.showInputDialog("Digiti numero "+ b +":");
            int entrada = Integer.parseInt(valor);
            this.vetor2[i] = entrada;
            b++;
        }
        statusVetor2 =  true;
        return true;
    }

    void somar(){
        if(statusVetor2 == true && statusVetor1 == true ){
            System.out.println("Soma");
            for(int i = 0; i < 5; i++){
                System.out.println(vetor1[i] + vetor2[i]);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Deve criar os dois vetores do caso 1 e 2");
        }
    }

    void subtrair(){
        if(statusVetor2 == true && statusVetor1 == true ){
            System.out.println("Diferença");
            for(int i = 0; i < 5; i++){
                System.out.println(vetor1[i] - vetor2[i]);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Deve criar os dois vetores do caso 1 e 2");
        }
    }

    void imprimir(){
        if( statusVetor2 == true && statusVetor1 == true ){
            System.out.println("Vetor A");
            for(int i = 0; i < 5; i++){
                System.out.println(this.vetor1[i]);
            }
            System.out.println("Vetor B");
            for(int i = 0; i < 5; i++){
                System.out.println(this.vetor2[i]);
            }
        
        }else{
            JOptionPane.showMessageDialog(null, "Deve criar os dois vetores do caso 1 e 2");
        }
    }
    
}
