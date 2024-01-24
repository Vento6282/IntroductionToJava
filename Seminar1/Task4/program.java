package IntroductionToJava.Seminar1.Task4;

// Во фразе "Добро пожаловать на курс по Java" переставить слова
// в обратном порядке.

public class program {
    public static void main(String[] args) {
        String str = "Добро пожаловать на курс по Java";
        System.out.println(convert(str));
        

    }

    static String convert(String str){
        String result = "";
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++){
            StringBuffer str_temp = new StringBuffer(arr[i]).reverse();
            System.out.println(str_temp);
            result = result + ' ' + str_temp;
        }
        return result.trim();
    }
}
