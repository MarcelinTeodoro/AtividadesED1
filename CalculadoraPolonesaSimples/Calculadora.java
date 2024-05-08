import java.util.Stack;
public class Calculadora {

        // Função para verificar precedência de operadores
    private int precedencia(char operador) {
            switch (operador) {
                case '+':
                case '-':
                    return 1;
                case '*':
                case '/':
                    return 2;
                default:
                    return 0;
            }
        }
    
        // Função para converter expressão infixa para pós-fixa
        public String infixToPosfix(String infixExpression) {
            Stack<Character> stack = new Stack<>();
            StringBuilder posfix = new StringBuilder();
    
            for (char c : infixExpression.toCharArray()) {
                if (Character.isDigit(c)) {
                    posfix.append(c);
                } else {
                    while (!stack.isEmpty() && precedencia(stack.peek()) >= precedencia(c)) {
                        posfix.append(stack.pop());
                    }
                    stack.push(c);
                }
            }
    
            while (!stack.isEmpty()) {
                posfix.append(stack.pop());
            }
    
            return posfix.toString();
        }

    // Função para converter expressão pré-fixa para pós-fixa
    public String prefixToPostfix(String prefixExpression) {
        Stack<String> stack = new Stack<>(); 

        
        StringBuilder reversedPrefix = new StringBuilder(prefixExpression).reverse();

        
        for (char c : reversedPrefix.toString().toCharArray()) {
            if (Character.isDigit(c)) {
            stack.push(String.valueOf(c)); 
        } else {
        
            String operand2 = stack.pop();
            String operand1 = stack.pop();

        
            StringBuilder postfix = new StringBuilder();
            postfix.append(operand2).append(operand1).append(c);
            stack.push(postfix.toString()); 
            }
        }

        
        return stack.pop();
    }




        // função para converter infixa para prefixa
        public String infixToPrefix(String infixExpression) {
            StringBuilder reversedInfix = new StringBuilder(infixExpression).reverse();
            String reversedPosfix = infixToPosfix(reversedInfix.toString()); 
            StringBuilder prefixExpression = new StringBuilder();
            
            
            for (char c : reversedPosfix.toCharArray()) {
                prefixExpression.append(c);
            }
        
            return prefixExpression.reverse().toString();
        }
        
        // Função para converter expressão pós-fixa para infixa 
        public String posfixToInfix(String postfixExpression) {
            Stack<String> stack = new Stack<>();
        
            for (char c : postfixExpression.toCharArray()) {
                if (Character.isDigit(c)) {
                    stack.push(String.valueOf(c)); 
                } else {
                    String operand2 = stack.pop();
                    String operand1 = stack.pop();
                    String infixExpression =  operand1 + c + operand2 ; 
                    stack.push(infixExpression);
                }
            }
        
            return stack.pop(); 
        }
        
        // Função para avaliar expressão pós-fixa
        public int operacaoPosFixa(String postfixExpression) {
            Stack<Integer> stack = new Stack<>();
    
            for (char c : postfixExpression.toCharArray()) {
                if (Character.isDigit(c)) {
                    stack.push(Character.getNumericValue(c));
                } else {
                    int operand2 = stack.pop();
                    int operand1 = stack.pop();
    
                    switch (c) {
                        case '+':
                            stack.push(operand1 + operand2);
                            break;
                        case '-':
                            stack.push(operand1 - operand2);
                            break;
                        case '*':
                            stack.push(operand1 * operand2);
                            break;
                        case '/':
                            stack.push(operand1 / operand2);
                            break;
                    }
                }
            }
    
            return stack.pop();
        }
    
                
    }
