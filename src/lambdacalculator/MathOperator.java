package lambdacalculator;

// an interface which have only one abstract method.
// we can write its implementation using lambda functions
@FunctionalInterface
public interface MathOperator {
    int operate(int a, int b);
}
