package com.example.application1.service;

import com.example.application1.entity.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    private static List<Book> books;

    static {
        books = new ArrayList<>();
    }

}
