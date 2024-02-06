package IntroductionToJava.Seminar5.Task1;

import java.util.HashMap;
import java.util.Map;

public class Passports {
    Map<String, String> map = new HashMap<>();
    
    void add(String passNo, String lastName){
        map.put(passNo, lastName);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String element : map.keySet()){
            stringBuilder.append(element);
            stringBuilder.append(" : ");
            stringBuilder.append(map.get(element));
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    String findByName (String lastName){
        StringBuilder stringBuilder = new StringBuilder();
        for (String element : map.keySet()){
            if (map.get(element).equals(lastName)){
                stringBuilder.append(element);
                stringBuilder.append(" : ");
                stringBuilder.append(map.get(element));
                stringBuilder.append("\n");
            } 
        }
        return stringBuilder.toString();
    }
}
