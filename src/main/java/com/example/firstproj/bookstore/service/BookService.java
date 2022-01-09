package com.example.firstproj.bookstore.service;

import com.example.firstproj.bookstore.model.Book;

import java.util.List;


public interface BookService {
    Book getBookById(Long id);
    List<Book> getAllBooks();
    List<Book> findByAuthor(String author);
    void addBook(Book book);
    void editBook(Book book);
}
