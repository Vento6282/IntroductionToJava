package IntroductionToJava.Seminar5.Task2;

import java.util.HashMap;
import java.util.Map;

// Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
// повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. (Например, add - egg изоморфны)
// буква может не меняться, а остаться такой же. (Например, note - code)
// Пример 1:
// Input: s = "foo", t = "bar"
// Output: false
// Пример 2:
// Input: s = "paper", t = "title"
// Output: true

public class Program {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("paper","title"));
        System.out.println(isIsomorphic("foo","bar"));
        System.out.println(isIsomorphic("note","code"));
        System.out.println(isIsomorphic("bar","foo"));
    }

    static boolean isIsomorphic(String s, String t){
        Map<Character, Character> map = new HashMap<>(); 
        for (int i = 0; i< s.length();i++){
            map.putIfAbsent(s.toLowerCase().charAt(i), t.toLowerCase().charAt(i));
        };
        String r = "";
        for (int i = 0; i< s.length();i++){
            r += map.get(s.toLowerCase().charAt(i));
        }
        if(t.equals(r)){
            return true;
        }
        return false;
    }
}
