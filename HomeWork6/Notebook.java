package IntroductionToJava.HomeWork6;
  
public class Notebook {
    int ram;
    int hdd;
    String os;
    String color;

    @Override
    public String toString(){
        return ("RAM - " + ram +" GB; HDD - "+ hdd + " GB; OS - "+os +"; color - " + color);
    }
}
