package IntroductionToJava.Seminar3.Task2;

import java.util.ArrayList;
import java.util.List;

// Создать список типа ArrayList
// Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.

public class Program {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<Object>();
        list.add(4);
        list.add(55);
        list.add("Строка");
        list.add(5);
        list.add(6.3);
        list.add("list");
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Integer){
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }
}
