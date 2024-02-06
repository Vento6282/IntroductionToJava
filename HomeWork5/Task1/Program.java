package IntroductionToJava.HomeWork5.Task1;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] initArray;

        if (args.length == 0) {
            initArray = new int[]{17, 32, 1, 4, 25, 17, 0, 3, 10, 7, 64, 1};
        } else {
            initArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        System.out.println("Initial array:");
        System.out.println(Arrays.toString(initArray));
        HeapSort.heapSort(initArray, initArray.length);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(initArray));
    }
}

class HeapSort {
    public static void buildTree(int[] tree, int sortLength) {
           // Введите свое решение ниже
        int temp = 0;
        for (int i = 0; i < tree.length; i++){
            for (int j = 1; j < tree.length; j++){
                if (tree[j] < tree[j-1]){
                    temp = tree[j];
                    tree[j] = tree[j-1];
                    tree[j-1] = temp;
                }
            }
        }
    }

    public static void heapSort(int[] sortArray, int sortLength) {
        // Введите свое решение ниже
     int temp = 0;
     for (int i = 0; i < sortArray.length; i++){
         for (int j = 1; j < sortArray.length; j++){
             if (sortArray[j] < sortArray[j-1]){
                 temp = sortArray[j];
                 sortArray[j] = sortArray[j-1];
                 sortArray[j-1] = temp;
             }
         }
     }
 }
}