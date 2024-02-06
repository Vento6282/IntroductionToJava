package IntroductionToJava.Seminar4.Task5;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Program {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5};
        printAsStack(arr);
        
    }

    static void printAsQueue(Integer[] arr){
        Queue<Integer> queue = new LinkedList<>();
        queue.addAll(Arrays.asList(arr)); 
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

    static void printAsStack(Integer[] arr){
        Stack<Integer> stack = new Stack<>();
        stack.addAll(Arrays.asList(arr));  
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
