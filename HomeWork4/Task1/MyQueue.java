
package IntroductionToJava.HomeWork4.Task1;

import java.util.LinkedList;

public class MyQueue {
        LinkedList<Integer> list = new LinkedList<>();
        
    public void enqueue(int element){
      list.add(element);
    }

    public int dequeue(){
      return list.pollFirst();
    }

    public int first(){
      return list.getFirst();

    }

    public LinkedList<Integer> getElements() {
        return list;
      
    }
}