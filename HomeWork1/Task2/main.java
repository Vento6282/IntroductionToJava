// Напишите функцию printPrimeNums, которая выведет на экран все простые числа в промежутке от 1 до 1000, каждое на новой строке.
// Напишите свой код в методе printPrimeNums класса Answer.

public class Printer{ 
    public static void main(String[] args) { 
      
      Answer ans = new Answer();      
      ans.printPrimeNums();
    }
}
class Answer {
    public void printPrimeNums(){
        // Напишите свое решение ниже
        for (int i = 2; i<= 1000; i++){
          int count = 0;
          for (int j = 2; j < i; j++){
            if(i % j == 0) 
              count += 1;
          }
          if (count == 0)
            System.out.println(i);
        }
    }
}