package fun.bookshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
@SpringBootApplication
public class BookShopApplication {
    public static void main(String[] args) {
        System.out.println("Hello, Good morning");
        SpringApplication.run(BookShopApplication.class, args);
    }
}