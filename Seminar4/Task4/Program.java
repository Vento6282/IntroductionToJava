package IntroductionToJava.Seminar4.Task4;

import java.util.Arrays;
import java.util.Stack;

// 1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
// 2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.

public class Program {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5};
        printAsStack(arr);
    }

    static void printAsStack(Integer[] arr){
        Stack<Integer> stack = new Stack<>();
        stack.addAll(Arrays.asList(arr));  
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
