package IntroductionToJava.Seminar2.Task3;

import java.util.Scanner;

// Напишите метод, который принимает на вход строку (String) и
// определяет является ли строка палиндромом (возвращает
// boolean значение).

public class program {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = scr.nextLine();
        System.out.println(palindrom(str));
    }
    static boolean palindrom(String str){
        for (int i = 0; i <= str.length() / 2; i++){
            if (str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
