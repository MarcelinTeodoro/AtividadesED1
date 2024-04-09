import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JOptionPane;

public class Refeitorio {
    public static void main(String[] args) {
        Queue <Object> fila = new LinkedList<>();
        String mensagem = "Escolha uma opçao da fila\n 1- Chame quem esta na fila, para dentro do refeitorio \n 2- remover \n 3-tamanho \n 4- limpar fila \n 5- fechar";
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
            while (!fila.isEmpty()) {
                Object obj = fila.poll();
                String nome = obj.getClass().getName().substring(obj.getClass().getName().lastIndexOf(".") + 1);
                JOptionPane.showMessageDialog(null, nome);
            }
                break;
            case 2:
            if (!fila.isEmpty()) {
                Object obj = fila.poll();
                String nome = obj.getClass().getName().substring(obj.getClass().getName().lastIndexOf(".") + 1);
                if (nome.equals("Aluno")) {
                    JOptionPane.showMessageDialog(null, ((Aluno) obj).getNome());
                } else if (nome.equals("Professor")) {
                    JOptionPane.showMessageDialog(null, ((Professor) obj).getNome());
                } else if (nome.equals("TecnicoAdministrativo")) {
                    JOptionPane.showMessageDialog(null, ((TecnicoAdminstrativo) obj).getNome());
                }
            }
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "O tamanho da fila é : " + fila.size());
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "A fila foi  cancelada, sem almoço");
                fila.clear();
                break;
            case 5:
                
                System.exit(0);
                
            
        }}
        

        
    }
}
