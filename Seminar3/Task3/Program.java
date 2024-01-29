package IntroductionToJava.Seminar3.Task3;

import java.util.ArrayList;
import java.util.List;

// Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так, 
// что на 0й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях - названия книг. 
// Напишите метод для заполнения данной структуры.

public class Program {
    public static void main(String[] args) {
        List <List<String>> shopBook = new ArrayList<>();
        addBook(shopBook, "Сказка", "Золотой ключик");
        addBook(shopBook, "Роман", "Мастер и Маргарита");
        addBook(shopBook, "Сказка", "Репка");
        addBook(shopBook, "Фентези", "Гарри Поттер");
        addBook(shopBook, "Роман", "Война и Мир");
        addBook(shopBook, "Фентези", "Ночной дозор");
        System.out.println(shopBook);
    }
    static void addBook(List<List<String>> shopBook, String genre, String nameBook){
        for (int i = 0; i < shopBook.size(); i++) {
            List<String> bookShelf = shopBook.get(i);
            if (bookShelf.get(0).equals(genre)) {
                bookShelf.add(nameBook);
                return;                
            }
        }
        List<String> newBookShelf = new ArrayList<>();
        newBookShelf.add(genre);
        newBookShelf.add(nameBook);
        shopBook.add(newBookShelf);
    }
}
