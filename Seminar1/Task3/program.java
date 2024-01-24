package IntroductionToJava.Seminar1.Task3;

// Дан массив nums = [3,2,2,3] и число val = 3. Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.

import java.util.Arrays;

public class program {
    public static void main(String[] args) {
        int[] array = {3,2,5,3};
        int val = 3;
        int[] result = sort(array, val);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(result));
    }
    static int[] sort(int[] arr, int val){
        int[] arr1 = new int[arr.length];
        Arrays.fill(arr1, val);
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] != val){
            arr1[j++] = arr[i];
            }
        }
        return arr1;
    }
}