package com.example.application1.controller;

import com.example.application1.entity.Todo;
import com.example.application1.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TodoController {

    @Autowired
    TodoService todoService;

    @RequestMapping("/list-todo")
    public String listTodo(ModelMap map) {
        List<Todo> todos = todoService.getTodoItems("ajay");
        System.out.println(todos);
        map.put("todos", todos);
        return "list-todo";
    }

}
