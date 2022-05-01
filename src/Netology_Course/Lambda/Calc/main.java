package Netology_Course.Lambda.Calc;

public class main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.divide.apply(a, b);
        /*Ошибка деление на 0 в операторе divide, исправлено в классе calculator*/
        calc.println.accept(c);
    }
}
