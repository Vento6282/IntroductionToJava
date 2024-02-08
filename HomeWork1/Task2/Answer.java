public class Answer {
    void printPrimeNums(){
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

    public int countNTriangle(int n) {
      throw new UnsupportedOperationException("Unimplemented method 'countNTriangle'");
    }
}
