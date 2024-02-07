package IntroductionToJava.HomeWork6;

import java.util.*;

public class Program {

    static int[] ram = { 2, 4, 8, 16 };
    static int[] hdd = { 200, 250, 350, 450, 500, 1000 };
    static String[] os = { "Windows 10", "Windows 11", "Linux", "MacOS", "NoOS" };
    static String[] color = { "black", "white", "grey", "pink" };

    public static void main(String[] args) {

        Set<Notebook> notebooks = new HashSet<>();
        createNotebooks(5, notebooks);
        // printNotebooks(notebooks);

        Map<String, Object> filter = new HashMap<String, Object>();

        String choose = "0";
        Scanner scanner = new Scanner(System.in);
        while (!choose.equals("6")) {
            
            System.out.println(
                    "Введите цифру, соответствующую необходимому критерию:\n" +
                            "1 - ОЗУ\n" +
                            "2 - Объем ЖД\n" +
                            "3 - Операционная система\n" +
                            "4 - Цвет\n" +
                            "5 - Поиск\n" +
                            "6 - Выход");
            System.out.print("Выбор: ");
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    filterRAM(filter);
                    break;
                case "2":
                    filterHDD(filter);
                    break;
                case "3":
                    filterOS(filter, notebooks);
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    System.out.println("До новых встреч!");
                    break;
                default:
                    System.out.println("Выбран не существующий пункт!");
                    break;
            }
        }
    }

    static void createNotebooks(int count, Set<Notebook> notebooks) {
        Random random = new Random();
        for (int i = 1; i <= count; i++) {
            Notebook notebook = new Notebook();
            notebook.ram = ram[random.nextInt(0, ram.length)];
            notebook.hdd = hdd[random.nextInt(0, hdd.length)];
            notebook.os = os[random.nextInt(0, os.length)];
            notebook.color = color[random.nextInt(0, color.length)];
            notebooks.add(notebook);
        }
    }

    static void printNotebooks(Set<Notebook> notebooks) {
        for (Notebook notebook : notebooks) {
            System.out.println(notebook);
        }
    }

    static void filterRAM(Map<String, Object> filter) {
        Scanner scannerFilter = new Scanner(System.in);
        System.out.print("Укажите минимальный объём RAM: ");
        String RAM = scannerFilter.nextLine();
        while (!isCorrectInteger(RAM)) {
            System.out.println("Введено некорректное значение!");
            System.out.print("Укажите минимальный объем RAM, Gb: ");
            RAM = scannerFilter.nextLine();
        }
        filter.put("RAM", Integer.valueOf(RAM));
    }

    static void filterHDD(Map<String, Object> filter) {
        Scanner scannerFilter = new Scanner(System.in);
        System.out.print("Укажите минимальный объем HDD: ");
        String HDD = scannerFilter.nextLine();
        while (!isCorrectInteger(HDD)) {
            System.out.println("Введено некорректное значение!");
            System.out.print("Укажите минимальный объем HDD, Gb: ");
            HDD = scannerFilter.nextLine();
        }
        filter.put("HDD", Integer.valueOf(HDD));
    }

    static void filterOS(Map<String, Object> filter, Set<Notebook> notebooks) {


    }

    static boolean isCorrectInteger(String str) {
        try {
            int intValue = Integer.valueOf(str);
            if (intValue < 0) {
                return false;
            }
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
