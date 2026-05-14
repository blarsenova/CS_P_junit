import java.util.stream.DoubleStream;

public class Calculator {

        static double add(double... operands) {
            return DoubleStream.of(operands)
                    .sum();
        }

        static double multiply(double... operands) {
            return DoubleStream.of(operands)
                    .reduce(1, (a, b) -> a * b);
        }

    public static double divide(int i, int i1) {
        if (i1 == 0) {
            throw new ArithmeticException("Division by zero");
        }
            return (double) i/i1;
    }
}




