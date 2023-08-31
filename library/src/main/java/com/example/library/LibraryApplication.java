package com.example.library;

import com.example.library.entity.Author;
import com.example.library.entity.Book;
import com.example.library.entity.Category;
import com.example.library.entity.Publisher;
import com.example.library.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LibraryApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibraryApplication.class, args);
    }

    //    runs when the application first runs
    @Bean
    public CommandLineRunner initialCreate(BookService bookService) {
        return (args -> {
            Book book1 = new Book("A", "Book name 1", "First book");
            Author author1 = new Author("Author name 1", "First author");
            Category category1 = new Category("Business1");
            Publisher publisher1 = new Publisher("Publisher name 1");
            book1.addAuthor(author1);
            book1.addCategory(category1);
            book1.addPublisher(publisher1);
            bookService.addBook(book1);

            Book book2 = new Book("B", "Book name 2", "second book");
            Author author2 = new Author("Author name 2", "second author");
            Category category2 = new Category("Business2");
            Publisher publisher2 = new Publisher("Publisher name 2");
            book2.addAuthor(author2);
            book2.addCategory(category2);
            book2.addPublisher(publisher2);
            bookService.addBook(book2);

            Book book3 = new Book("C", "Book name 3", "Third book");
            Author author3 = new Author("Author name 3", "Third author");
            Category category3 = new Category("Business3");
            Publisher publisher3 = new Publisher("Publisher name 3");
            book3.addAuthor(author3);
            book3.addCategory(category3);
            book3.addPublisher(publisher3);
            bookService.addBook(book3);
        });
    }
}
