package IntroductionToJava.Seminar4.Task6;


/*
Реализовать стэк с помощью массива.
Нужно реализовать методы:
size(), empty(), push(), peek(), pop().
*/

public class Program {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);

        while (!myStack.empty()) {
            System.out.println(myStack.pop());
        }
    }
}
class MyStack {
    public int[] arr = new int[10];
    public int size = 0;

    int size() {
        return size;
    }

    boolean empty() {
        return size == 0;
    }

    void push(int element) {
        if (size >= arr.length) {
            int[] arr2 = new int[arr.length * 2];
            System.arraycopy(arr, 0, arr2, 0, arr.length);
            arr = arr2;
        }
        arr[size++] = element;
    }

    int peek() {
        return arr[size - 1];
    }

    int pop() {
        return arr[--size];
    }
}