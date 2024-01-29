// package IntroductionToJava.HomeWork2.Task2;

// import java.io.FileWriter;
// import java.io.FileReader;
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.util.Arrays;
// import java.text.SimpleDateFormat;
// import java.util.Date;

// class BubbleSort {
// private static FileWriter fileWriter;

// static void createLog() {
// try {
// fileWriter = new FileWriter("log.txt");
// } catch (IOException e) {
// e.printStackTrace();
// }
// }

// static void closeLog() {
// try {
// fileWriter.close();
// } catch (IOException e) {
// e.printStackTrace();
// }
// }

// public static void sort(int[] mas) {
// createLog();
// bubbleSort(mas);
// closeLog();
// }

// private static int[] bubbleSort(int[] mas) {
// boolean isSorted = false;
// int buffer;

// while (!isSorted) {
// isSorted = true;
// for (int i = 0; i < mas.length - 1; i++) {
// if (mas[i] > mas[i + 1]) {
// isSorted = false;

// buffer = mas[i];
// mas[i] = mas[i + 1];
// mas[i + 1] = buffer;
// }
// }
// log(Arrays.toString(mas));
// }
// return mas;
// }

// static void log(String note) {
// try {
// SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
// String timestamp = dateFormat.format(new Date());
// fileWriter.write(timestamp + " " + note + "\n");
// fileWriter.flush();
// } catch (IOException e) {
// e.printStackTrace();
// }
// }
// }