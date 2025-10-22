package simplecalculator;

public class Calculator {
    // method for adding two integers
    public int add(int a, int b){
        return a+b;
    }

    // method for subtraction
    public int subtract(int a, int b){
        return a-b;
    }

    // method for multiplying two integers
    public int multiply(int a, int b){
        return a*b;
    }

    // method for division
    //throws Arithmetic Exception if second number is zero
    public int divide(int a, int b){
        if(b== 0){
            throw new ArithmeticException("Divider must not be zero");
        }
        return a/b;
    }
}
