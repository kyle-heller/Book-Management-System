package com.example.Book.Management.System;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LibraryService {

    private BookRepository bookRepository;
    private BookService bookService;

    @Autowired
    public LibraryService(BookRepository bookRepository, BookService bookService) {
        System.out.println("Library service object created");
        this.bookRepository = bookRepository;
        this.bookService = bookService;
    }
}
