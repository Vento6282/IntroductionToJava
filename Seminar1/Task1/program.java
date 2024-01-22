package IntroductionToJava.Seminar1.Task1;
import java.util.Scanner;
import java.time.LocalDateTime;  
public class program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = iScanner.nextLine();
        iScanner.close();
        int time = LocalDateTime.now().getHour() * 100 + LocalDateTime.now().getMinute();
        if ((time >= 0 & time <500) | (time > 2300)) System.out.printf("Доброй ночи, %s!", name);
        if (time >= 500 & time <1200) System.out.printf("Доброе утро, %s!", name);
        if (time >= 1200 & time <1800) System.out.printf("Добрый день, %s!", name);
        if (time >= 1800 & time <2300) System.out.printf("Добрый вечер, %s!", name);
    }
}
