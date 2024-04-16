import java.util.Stack;

public class InverterString {

    
    
    public static void main(String[] args) {
        Stack <Character> pilha;
        pilha = new Stack<>();

        String frase = "ESARF :ATERCES ODALERAHCAB ME AICNEIC AD OAÇATUPMOC  E AIGOLONCET ME SAMETSIS ARAP TENRETNI OD FI ONAIOG SUPMAC SOHNIRROM OAS SOD SEROHLEM SOSRUC ED OAÇATUPMOC OD ODATSE ED SAIOG";
        
        
        for(int i = 0 ; i < frase.length(); i++){
            pilha.push(frase.charAt(i));
            if(frase.charAt(i) == ' '){
                pilha.push(frase.charAt(i));
                while (!pilha.empty()) {
                    System.out.print(pilha.pop());
                }
            }

        } 
        System.out.print(" ");
        while (!pilha.empty()) {
            System.out.print(pilha.pop());
        }


    }
}