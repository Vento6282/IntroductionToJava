package IntroductionToJava.HomeWork6;

import java.util.*;

public class Program {

    static int[] ram = { 2, 4, 8, 16 };
    static int[] hdd = { 200, 250, 350, 450, 500, 1000 };
    static String[] os = { "Windows 10", "Windows 11", "Linux", "MacOS", "NoOS" };
    static String[] color = { "black", "white", "grey", "pink" };

    public static void main(String[] args) {

        Set<Notebook> notebooks = new HashSet<>();
        createNotebooks(10, notebooks);
        Set<Notebook> filteredNotebooks = notebooks;

        Map<String, String> filter = new HashMap<String, String>();
        filter.put("RAM", "0");
        filter.put("HDD", "0");
        filter.put("OS", "all");
        filter.put("color", "all");

        String choose = "0";
        Scanner scanner = new Scanner(System.in);
        while (!choose.equals("7")) {
            System.out.println("-----------------------------------------------------");
            System.out.println(
                    "Введите цифру, соответствующую необходимому критерию:\n" +
                            "1 - ОЗУ\n" +
                            "2 - Объем ЖД\n" +
                            "3 - Операционная система\n" +
                            "4 - Цвет\n" +
                            "5 - Поиск\n" +
                            "6 - Сбросить фильтр поиска\n" +
                            "7 - Выход");
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
                    filterOS(filter, filteredNotebooks);
                    break;
                case "4":
                    filterColor(filter, filteredNotebooks);
                    break;
                case "5":
                    findByNotebook(filter, filteredNotebooks);
                    break;
                case "6":
                    resetFilter(filter, filteredNotebooks, notebooks);
                    break;
                case "7":
                    System.out.println("-----------------------------------------------------");
                    System.out.println("До новых встреч!");
                    break;
                default:
                    System.out.println("-----------------------------------------------------");
                    System.out.println("Выбран не существующий пункт!");
                    break;
            }
        }
    }

    // Создание списка ноутбуков
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

    // Ввод фильтра RAM
    static void filterRAM(Map<String, String> filter) {

        Scanner scannerFilter = new Scanner(System.in);
        System.out.println("-----------------------------------------------------");
        System.out.print("Укажите минимальный объём оперативной памяти, GB: ");
        String RAM = scannerFilter.nextLine();
        while (!isCorrectInteger(RAM)) {
            System.out.println("-----------------------------------------------------");
            System.out.println("Введено некорректное значение!");
            System.out.println("-----------------------------------------------------");
            System.out.print("Укажите минимальный объем RAM оперативной памяти, GB: ");
            RAM = scannerFilter.nextLine();
        }
        filter.put("RAM", RAM);
    }

    // Ввод фильтра HDD
    static void filterHDD(Map<String, String> filter) {
        System.out.println("-----------------------------------------------------");
        Scanner scannerFilter = new Scanner(System.in);
        System.out.print("Укажите минимальный объем жесткого диска, GB: ");
        String HDD = scannerFilter.nextLine();
        while (!isCorrectInteger(HDD)) {
            
            System.out.println("Введено некорректное значение!");
            System.out.println("-----------------------------------------------------");
            System.out.print("Укажите минимальный объем жесткого диска, GB: ");
            HDD = scannerFilter.nextLine();
        }
        filter.put("HDD", HDD);
    }

    // Ввод фильтра операционной системы
    static void filterOS(Map<String, String> filter, Set<Notebook> filterNotebooks) {
        Map<Integer, String> listOS = new HashMap<>();
        int number = 1;
        for (Notebook notebook : filterNotebooks) {
            if (!listOS.containsValue(notebook.os)) {
                listOS.put(number, notebook.os);
                number++;
            }
        }
        Scanner scannerFilter = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.println("-----------------------------------------------------");
            System.out.println("Введите цифру, соответствующую необходимой ОС:");
            for (int i = 1; i <= listOS.size(); i++) {
                System.out.println(i + " - " + listOS.get(i));
            }
            System.out.println(listOS.size() + 1 + " - " + "all OS");
            System.out.print("Выбор: ");
            String OS = scannerFilter.nextLine();
            if (isCorrectInteger(OS)) {
                if (Integer.valueOf(OS) > 0 && Integer.valueOf(OS) <= listOS.size()) {
                    filter.put("OS", listOS.get(Integer.valueOf(OS)));
                    check = false;
                } else if(Integer.valueOf(OS) == listOS.size() + 1) {
                    filter.put("OS", "all");
                    check = false;
                } else {
                    System.out.println("-----------------------------------------------------");
                    System.out.println("Введено некорректное значение!");
                }
            } else {
                System.out.println("-----------------------------------------------------");
                System.out.println("Введено некорректное значение!");
            }
        }
    }

    // Ввод фильтра цвета
    static void filterColor(Map<String, String> filter, Set<Notebook> filterNotebooks) {
        Map<Integer, String> listColor = new HashMap<>();
        int number = 1;
        for (Notebook notebook : filterNotebooks) {
            if (!listColor.containsValue(notebook.color)) {
                listColor.put(number, notebook.color);
                number++;
            }
        }
        Scanner scannerFilter = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.println("Введите цифру, соответствующую необходимому цвету:");
            for (int i = 1; i <= listColor.size(); i++) {
                System.out.println(i + " - " + listColor.get(i));
            }
            System.out.println(listColor.size() + 1 + " - " + "all colors");
            System.out.print("Выбор: ");
            String color = scannerFilter.nextLine();
            if (isCorrectInteger(color)) {
                if (Integer.valueOf(color) > 0 && Integer.valueOf(color) <= listColor.size()) {
                    filter.put("color", listColor.get(Integer.valueOf(color)));
                    check = false;
                } else if(Integer.valueOf(color) == listColor.size() + 1) {
                    filter.put("color", "all");
                    check = false;
                } else {
                    System.out.println("-----------------------------------------------------");
                    System.out.println("Введено некорректное значение!");
                }
            } else {
                System.out.println("-----------------------------------------------------");
                System.out.println("Введено некорректное значение!");
            }
        }
    }

    // Вывод ноутбуков по фильтру
    static void findByNotebook(Map<String, String> filter, Set<Notebook> filteredNotebooks) {
        System.out.println("-----------------------------------------------------");
        Set<Notebook> notebookFiltered = new HashSet<>();
        for (Notebook notebook : filteredNotebooks) {
            int check = 0;
            if (notebook.ram >= Integer.valueOf(filter.get("RAM"))) {
                check += 1;
            }
            if (notebook.hdd >= Integer.valueOf(filter.get("HDD"))) {
                check += 1;
            }
            if (filter.get("OS").equals("all") || notebook.os.equals(filter.get("OS"))) {
                check += 1;
            }
            if (filter.get("color").equals("all") || notebook.color.equals(filter.get("color"))) {
                check += 1;
            }
            if (check == 4) {
                notebookFiltered.add(notebook);
            }
        }
        if (notebookFiltered.size() == 0) {
            System.out.println("Под фильтр не попадает ни один из ноутбуков!");
        } else {
            for (Notebook notebook : notebookFiltered) {
                System.out.println(notebook.toString());
            }
        }
        filteredNotebooks = notebookFiltered;
    }

    // Сброс фильтра
    static void resetFilter(Map<String, String> filter, Set<Notebook> filteredNotebooks, Set<Notebook> notebooks) {
        filter.put("RAM", "0");
        filter.put("HDD", "0");
        filter.put("OS", "all");
        filter.put("color", "all");
        filteredNotebooks = notebooks;
    }

    // Проверка, что введённое значение можно преобразовать в число
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
