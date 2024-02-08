public class Calculator {
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
