package com.example.application1.service;

import com.example.application1.entity.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodoService {

    private static List<Todo> todoItems;
    private static int todoCount;

    static {
        todoItems = new ArrayList<>();

        todoItems.add(new Todo(1, "ajay", "Read a book", new Date(), false));
        todoItems.add(new Todo(2, "rohit", "Watch a movie", new Date(), false));
        todoItems.add(new Todo(3, "ajay", "Play a game", new Date(), false));

        todoCount = todoItems.size();
    }

    public List<Todo> getTodoItems(String user) {
        List<Todo> filteredTodos = new ArrayList<>();

        for(Todo todo : todoItems) {
            if (todo.getUser().equalsIgnoreCase(user)) {
                filteredTodos.add(todo);
            }
        }

        return filteredTodos;
    }

    public void addTodo(String user, String desc, Date date, boolean isDone) {
        todoItems.add(new Todo(++todoCount, "ajay", "Play a game", new Date(), false));
    }
}
