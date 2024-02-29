package com.example.Book.Management.System;

import org.springframework.stereotype.Component;

@Component
public class BookRepository {

    public BookRepository() {
        System.out.println("Book repository object created");
    }
}
