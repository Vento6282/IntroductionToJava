// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
// максимальное количество подряд идущих 1.

package IntroductionToJava.Seminar1.Task2;

public class program {
    public static void main(String[] args) {
        // int random_int = (int)Math.floor(Math.random() * (2));
        // System.out.println(random_int);
        int[] arr = {1,1,0,1,1,1};
        int count_max = 0;
        int count = 0;
        for (int i = 0; i <arr.length; i++){
            if (arr[i] == 1){
                count = count + 1;
                if (count > count_max){
                    count_max = count;
                }
            } else count = 0;
        }
        System.out.printf("Максимальное количество подряд 1 - %d", count_max);
    }
}

