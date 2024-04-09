import java.util.Stack;

public class InverterString {

    /*Implementar uma estrutura de Pilha em Java. O programa da pilha deve inverter a ordem das letras
    de cada palavra de uma string ASCII, preservando a ordem das palavras (acentos podem ser desconsiderados).
    Por exemplo, para a string  ESTE EXERCICIO E MUITO FACIL  o resultado deve ser  ETSE OICICREXE E OTIUM LICAF.

use os dois exemplos abaixo:

1) UM CIENTISTA DA COMPUTAÇAO OU UM TECNÓLOGO EM SISTEMAS PARA INTERNET DEVE RESOLVER OS PROBLEMAS LOGICAMENTE

2) ESARF :ATERCES ODALERAHCAB ME AICNEIC AD OAÇATUPMOC  E AIGOLONCET ME SAMETSIS ARAP TENRETNI OD FI ONAIOG SUPMAC 
SOHNIRROM OAS SOD SEROHLEM SOSRUC ED OAÇATUPMOC OD ODATSE ED SAIOG */
    
    public static void main(String[] args) {
        Stack <String> pilha;
        pilha = new Stack<String>();

        String T = " ESTE EXERCICIO E MUITO FACIL";
        
        String []palavras = T.split(" ");
        for (String palavra : palavras){
            
            for (int i = 0; i < palavra.length(); i++) {
                pilha.push( = palavra.charAt(i));
                
}

        }
    }
}