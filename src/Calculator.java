import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new; //Создаем переменную instance типа Supplier.
    // Supplier - это функциональный интерфейс, реализующий метод get().
    // С помощью данной переменной можно будет получить экземпляр класса Calculator

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> y != 0 ? x / y : 0;

    UnaryOperator<Integer> square = x -> x * x;
    UnaryOperator<Integer> reverse = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println; //Создаем переменную println типа Consumer.
    // Consumer - это функциональный интерфейс, реализующий метод accept().
    // С помощью данной переменной можно выводить значения на экран
}