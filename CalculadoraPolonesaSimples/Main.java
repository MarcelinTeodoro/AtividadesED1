import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        
            Calculadora calculator = new Calculadora();
            int i = Integer.parseInt(JOptionPane.showInputDialog("Informe a notação \n1-infixa\n2-posfixa\n3-prefixa"));
            String expressao = JOptionPane.showInputDialog("qual é a expressao?");
            switch (i) {

                case 1:
                String infixExpression = expressao;
                String postfixExpression = calculator.infixToPosfix(expressao);
                String prefixExpression = calculator.infixToPrefix(expressao);
                int result = calculator.operacaoPosFixa(postfixExpression);
                resultado(infixExpression, postfixExpression, prefixExpression, result);
                    break;
                
                case 2:
                postfixExpression = expressao;
                infixExpression = calculator.posfixToInfix(expressao);
                prefixExpression = calculator.infixToPrefix(infixExpression);
                result = calculator.operacaoPosFixa(postfixExpression);
                resultado(infixExpression, postfixExpression, prefixExpression, result);
                    break;
                    
                
                
                case 3:
                prefixExpression = expressao;
                postfixExpression = calculator.prefixToPostfix(expressao);
                infixExpression = calculator.posfixToInfix(postfixExpression);
                result = calculator.operacaoPosFixa(postfixExpression);
                resultado(infixExpression, postfixExpression, prefixExpression, result);
                    break;
                
            }
            
            
    
            
    }
    public static void resultado(String expressao, String postfixExpression, String prefixExpression, int result){
                System.out.println("Expressao infixa: " + expressao);
                System.out.println("Expressao pos-fixa: " + postfixExpression);
                System.out.println("Expressao pre-fixa: " + prefixExpression);
                System.out.println("Resultado: " + result);
    }
}