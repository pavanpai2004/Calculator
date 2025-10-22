package lambdacalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // lambda function for addition
        MathOperator addition = (a, b) -> a + b;

        // lambda function for subtraction
        MathOperator subtraction = (a, b) -> a - b;

        // lambda function for multiplication
        MathOperator multiplication = (a, b) -> a * b;

        // lambda function for division
        // if b is zero, function throws Arithmetic Exception.
        MathOperator division = (a, b) ->{
            if(b== 0){
                throw new ArithmeticException("Divider must not be zero");
            }
            return a / b;
        };


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
                    System.out.println(addition.operate(op1,op2));
                    break;

                // subtraction
                case "-":
                    System.out.println(subtraction.operate(op1,op2));
                    break;

                // multiplication
                case "*":
                    System.out.println(multiplication.operate(op1,op2));
                    break;

                // division
                case "/":
                    try {
                        System.out.println(division.operate(op1, op2));
                    }catch (ArithmeticException e){
                        System.out.println(e.getMessage());
                    }
                    break;

                // invalid input
                default:
                    System.out.println("Invalid Operator.");
            }

            System.out.println("Do you want to Continue? (y/n)");
            String option =  sc.next();
            if(option.equalsIgnoreCase("N")){
                break;
            }
        }
    }
}
