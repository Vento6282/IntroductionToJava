// В методе calculate класса Calculator реализовать калькулятор, 
// который будет выполнять математические операции (+, -, *, /) над двумя целыми числами и возвращать результат вещественного типа.
// В классе Printer необходимо реализовать проверку переданного оператора, 
// при некорректном операторе программа должна вывести сообщение об ошибке "Некорректный оператор: 'оператор'".

public class Printer{ 
    public static void main(String[] args) { 
        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '+';
            b = 7;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }

        Calculator calculator = new Calculator();
        double result = calculator.calculate(op, a, b);
        System.out.println(result);
    }
}
class Calculator {
    public double calculate(char op, int a, int b) {
      double result = 0;
      if (op == '+') result = a + b;
      else if (op == '-') result = a - b;
      else if (op == '*') result = a * b ;
      else if (op == '/') result = a / b ;
      else System.out.println("Некорректный оператор: " + op);
      return result;
    }
}