package IntroductionToJava.Seminar5.Task4;

import java.util.*;

// Взять набор строк, например,

// Мороз и солнце день чудесный 
// Еще ты дремлешь друг прелестный 
// Пора красавица проснись.

// Написать метод, который отсортирует эти строки по длине с помощью TreeMap. 
// Строки с одинаковой длиной не должны “потеряться”.

public class Program {
    public static void main(String[] args) {
        String s ="Мороз и солнце день чудесный\n" +
        "Еще ты дремлешь друг прелестный\n" +
        "Пора красавица проснись.\n";
    sortByLength(s);
    }
    static void sortByLength(String s){
        TreeMap<Integer, List<String>> treeMap = new TreeMap<>(Comparator.reverseOrder());
        s = s.replace(".", "");
        s = s.replace("\n", " ");
        String[] words = s.split(" ");
        for (String word : words){
            int l = word.length();
            if (treeMap.containsKey(l)){
                List<String> list = treeMap.get(l);
                list.add(word);
            } else {
                List<String> list = new ArrayList<>();
                list.add(word);
                treeMap.put(l, list);
            }
        }
        System.out.println(treeMap);
    }
}
