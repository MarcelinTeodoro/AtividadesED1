import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JOptionPane;

public class Refeitorio {
    public static void main(String[] args) {
        Queue <Object> fila = new LinkedList<>();
        String mensagem = "Escolha uma opçao da fila\n 1- quem esta na fila \n 2- remover \n 3-tamanho \n 4- limpar fila \n 5- fechar";
        Aluno aluno = new Aluno("gabril","2123123", "agronomia");
        Professor prof = new Professor("Bruno", "Fisico", "1231233");
        TecnicoAdminstrativo tcnAdm = new TecnicoAdminstrativo("Vitor", "123123");
        fila.add(aluno);
        fila.add(prof);
        fila.add(tcnAdm);
        
        while (true){ 
            int b = Integer.parseInt(JOptionPane.showInputDialog(mensagem));
        switch (b) {
            case 1:
                JOptionPane.showMessageDialog(null, fila);
                break;
            case 2:
                JOptionPane.showMessageDialog(null,fila.poll());
                break;
            case 3:
                JOptionPane.showMessageDialog(null, fila.size());
                break;
            case 4:
                fila.clear();
                break;
            case 5:
                
                System.exit(0);
                
            
        }}
        

        
    }
}
