public class Answer {
    public int countNTriangle(int n){
      if (n < 1) 
        return -1;
      if (n==1) 
        return 1;
      return n + countNTriangle(n-1);
    }

    public void printPrimeNums() {
        throw new UnsupportedOperationException("Unimplemented method 'printPrimeNums'");
    }
}
