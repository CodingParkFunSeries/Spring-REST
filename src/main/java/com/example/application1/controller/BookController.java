package com.example.application1.controller;

import com.example.application1.entity.Book;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BookController {

    @RequestMapping("/books")
    public List<Book> getAllBooks() {

        return Arrays.asList(new Book(1, "My first book", "Ajay"));


    }

}
