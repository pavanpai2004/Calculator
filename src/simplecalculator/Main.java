package simplecalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc =  new Scanner(System.in);

        while(true){
            System.out.println("Enter Operand 1");
            int op1 = sc.nextInt();
            System.out.println("Enter Operand 2");
            int op2 = sc.nextInt();
            System.out.println("Enter Operator");
            String op = sc.next();

            switch (op){
                // addition
                case "+":
                    System.out.println(calculator.add(op1,op2));
                    break;

                //subtraction
                case "-":
                    System.out.println(calculator.subtract(op1,op2));
                    break;

                //multiplication
                case "*":
                    System.out.println(calculator.multiply(op1,op2));
                    break;

                //division
                // must handle divide by zero exception
                case "/":
                    try {
                        System.out.println(calculator.divide(op1, op2));
                    }catch (ArithmeticException e){
                        System.out.println(e.getMessage());
                    }
                    break;

                // invalid input
                default:
                    System.out.println("Invalid operator");
            }

            System.out.println("Do you want to Continue? (y/n)");
            String option =  sc.next();
            if(option.equalsIgnoreCase("N")){
                break;
            }
        }
    }
}

