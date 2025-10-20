package lambdacalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MathOperator addition = (a, b) -> a + b;
        MathOperator subtraction = (a, b) -> a - b;
        MathOperator multiplication = (a, b) -> a * b;
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
                case "+":
                    System.out.println(addition.operate(op1,op2));
                    break;
                case "-":
                    System.out.println(subtraction.operate(op1,op2));
                    break;
                case "*":
                    System.out.println(multiplication.operate(op1,op2));
                    break;
                case "/":
                    try {
                        System.out.println(division.operate(op1, op2));
                    }catch (ArithmeticException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Invalid Operator");
            }

            System.out.println("Do you want to Continue? (y/n)");
            String option =  sc.next();
            if(option.equalsIgnoreCase("N")){
                break;
            }
        }

    }
}
