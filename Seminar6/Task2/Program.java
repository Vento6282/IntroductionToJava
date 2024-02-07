package IntroductionToJava.Seminar6.Task2;

// 1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
// 2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных 
// значений в данном массиве и верните его в виде числа с плавающей запятой.
// Для вычисления процента используйте формулу:
// процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

import java.util.*;



public class Program {
    public static void main(String[] args) {
        Integer[] arr = fillArray(100, 0, 24);
        System.out.println(percent(arr));
        System.out.println(Arrays.toString(arr));        
    }
    static Integer[] fillArray(int count, int min, int max){
        Integer[] arr = new Integer[count];
        Random r = new Random();
        for (int i = 0; i < count; i++){
            arr[i] = r.nextInt(min, max+1);
        }
        return arr;
    }
    static double percent(Integer[] arr){
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        // return (double)(set.size()) * 100.0 / (double)(arr.length);
        return set.size() * 100.0 / arr.length;
    }
}
