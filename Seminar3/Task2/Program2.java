package IntroductionToJava.Seminar3.Task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Создать список типа ArrayList
// Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.

public class Program2 {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<Object>();
        list.add(4);
        list.add(55);
        list.add("Строка");
        list.add(5);
        list.add(6.3);
        list.add("list");
        System.out.println(list);
        Iterator<Object> iterator = list.iterator();
        while(iterator.hasNext()){
            if (iterator.next() instanceof Integer){
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}