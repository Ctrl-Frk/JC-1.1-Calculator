public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get(); //Создаем экземпляр класса Calculator
        // через вызов статической переменной instance
        ErrorListener errorListener = System.out::println;

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(a, b); //Здесь возникает ошибка из-за деления на 0 (т.к. b = 0).
        // Решение: реализовать метод devide через тернарный оператор. И при делении на 0 выводить 0
        if (c == 0) {
            errorListener.onError ("На 0 делить нельзя :(");
        } else {
            calc.println.accept(c);
        }
    }
}

@FunctionalInterface
interface ErrorListener {
    void onError(String text);
}