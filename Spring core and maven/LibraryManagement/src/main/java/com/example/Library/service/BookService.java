package com.example.Library.service;

import com.example.Library.Repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(String bookName) {

        bookRepository.saveBook(bookName);

        System.out.println("Book added successfully!");

    }

}