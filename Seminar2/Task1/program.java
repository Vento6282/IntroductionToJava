package IntroductionToJava.Seminar2.Task1;

import java.util.Scanner;

// Дано четное число N (>0) и символы c1 и c2.
// Написать метод, который вернет строку длины N, которая
// состоит из чередующихся символов c1 и c2, начиная с c1.

public class program {
    public static void main(String[] args) {
        int length = 0;
        String c1 = "";
        String c2 = "";
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите число:");
        String str = scr.nextLine();
        while (isNumber(str)) {
            System.out.println("Неверный формат числа!");
            System.out.println("Введите число: ");
            str = scr.nextLine();
        }
        length = Integer.parseInt(str);
        System.out.println("Введите первый символ:");
        str = scr.nextLine();
        while (isOneSymbol(str)) {
            System.out.println("Неверный формат числа!");
            System.out.println("Введите первый символ: ");
            str = scr.nextLine();
        }
        c1 = str;
        System.out.println("Введите второй символ:");
        str = scr.nextLine();
        while (isOneSymbol(str)) {
            System.out.println("Введено больше одного символа!");
            System.out.println("Введите второй символ: ");
            str = scr.nextLine();
        }
        c2 = str;
        System.out.println(generate_str(length, c1, c2));
        scr.close();
    }
    static String generate_str(int n, String c1, String c2){
        String result = "";
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0) result += c2;
            else result += c1;
        }
        return result;
    }
    static boolean isNumber(String str) throws NumberFormatException {
        try {
            int i = Integer.parseInt(str);
            if (i <= 0) 
                return true;
            return false;
        } catch (NumberFormatException e) {
            return true;
        }
    }
    static boolean isOneSymbol(String str){
        if (str.length() == 1)
            return false;
        else return true;
    }
}
