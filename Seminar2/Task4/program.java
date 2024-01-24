package IntroductionToJava.Seminar2.Task4;

// Напишите метод, который составит строку, состоящую из 100
// повторений слова TEST и метод, который запишет эту строку в
// простой текстовый файл, обработайте исключения.

public class program {
    public static void main(String[] args) {
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("\file.txt");
        System.out.println(pathProject + "        " + pathFile);
    }
}
