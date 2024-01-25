package IntroductionToJava.HomeWork2.Task2;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Program{ 
    public static void main(String[] args) { 
      int[] arr = {};
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        arr = new int[]{9, 3, 4, 8, 2, 5, 7, 1, 6, 10};
      }
      else{
        arr = Arrays.stream(args[0].split(", "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
      }     
      
      BubbleSort ans = new BubbleSort();      
      ans.sort(arr);

      try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class BubbleSort {
    private static File log;
    private static FileWriter fileWriter;

    public static void sort(int[] mas) {
        try (FileWriter fileWriter = new FileWriter("log.txt")){
            fileWriter.write("");
        } catch (IOException e) {
            e.printStackTrace();
        }
        int temp = 0;
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        StringBuilder result = new StringBuilder();
        for (int j = 0; j < mas.length; j++){
            StringBuilder sb = new StringBuilder();
            sb.append(formatForDateNow.format(dateNow) + " [");
            for (int i = 1; i < mas.length; i++){
                if (mas[i-1] > mas[i]){
                    temp = mas[i];
                    mas[i] = mas[i-1];
                    mas[i-1] = temp;
                    sb.append(mas[i-1]);
                    sb.append(", ");
                    
                } else {
                        sb.append(mas[i-1]);
                        sb.append(", ");
                }
            }
            sb.append(mas[mas.length-1] + "]\n");
            String[] str = result.toString().split("\n");
            int count = 0;
            for (int k = 0; k < str.length; k++) {
                if (sb.toString().trim().equals(str[k].trim())){
                    count += 1;
                }
            }
            if (count < 2){
                result.append(sb);
            }
        }
        try (FileWriter fileWriter = new FileWriter("log.txt")){
            fileWriter.write(result.toString().trim());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
