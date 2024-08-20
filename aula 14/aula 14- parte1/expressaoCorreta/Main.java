public class Main {
    public static void main(String[] args) {
        PilhaDinanmica pilha = new PilhaDinanmica();
        String exepressao = "( [ ( - ) } )";

        valido(expressaoCorreta(exepressao, pilha), exepressao);
        
    }

        
    public static boolean expressaoCorreta(String exepressao, PilhaDinanmica pilha){
        for(char ch : exepressao.toCharArray()){
            if (ch == '('||ch == '['|| ch =='{' ) {
                pilha.empilhar(ch);

            } else if (ch == ')'||ch == ']'|| ch =='}' ){
                if (pilha.estaVazia()) {
                    return false;
                }
                char top = pilha.desempilhar();
                if (ch == ')'&& top != '('||ch == ']' && top != '['|| ch =='}' && top != '{') {
                    return false;
                }

            }

            
        }
        return pilha.estaVazia();
    }
    


    public static void valido(boolean resulado, String expressao){

        if (resulado ) {
            System.out.println("A expressao é válida: " + expressao);
        }else{
        System.out.println("A expressao é  não válida: " + expressao);
        }
    }
}
