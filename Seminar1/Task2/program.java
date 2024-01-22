// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
// максимальное количество подряд идущих 1.

package IntroductionToJava.Seminar1.Task2;

public class program {
    public static void main(String[] args) {
        // int random_int = (int)Math.floor(Math.random() * (2));
        // System.out.println(random_int);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)Math.floor(Math.random() * (2));
            System.out.println(arr[i]);
        }
    }
}
