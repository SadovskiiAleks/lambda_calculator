import java.util.function.*;

public class Calculator {

    public static Supplier supplier;

    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;

    //Делить на 0 нельзя. Можно инициализировать проверку Predicate
    BinaryOperator<Integer> devide = (x, y) -> {
        try {
            return x/y;
        }
        catch (ArithmeticException e) {
            System.out.println("Делить на ноль нельзя");
            return Integer.MIN_VALUE;
        }
    };

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    UnaryOperator<Integer> noZero = x -> x == 0 ? 1 : x;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;

}
