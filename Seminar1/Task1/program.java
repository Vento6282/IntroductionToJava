package IntroductionToJava.Seminar1.Task1;
import java.util.Scanner;
import java.time.LocalDateTime;  
public class program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Представьтесь, пожалуйста");
        String name = iScanner.nextLine();
        int time = LocalDateTime.now().getHour();
        if (time >= 5 && time <12) System.out.printf("Доброе утро, %s!", name);
        else if (time >= 12 && time <18) System.out.printf("Добрый день, %s!", name);
        else if (time >= 18 && time <23) System.out.printf("Добрый вечер, %s!", name);
        else System.out.printf("Доброй ночи, %s!", name);
    }
}