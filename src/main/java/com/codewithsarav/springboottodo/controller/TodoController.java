package com.codewithsarav.springboottodo.controller;

import com.codewithsarav.springboottodo.model.Todo;
import com.codewithsarav.springboottodo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
//@RequestMapping("/api")
public class TodoController {
    @Autowired
    TodoRepository todoRepository;

    @GetMapping("/todo/all")
    public List<Todo> getAllTodo(){
        return todoRepository.getAll();
    }
    @GetMapping("/todo/{id}")
    public Todo getTodoById(@PathVariable int id){
        return todoRepository.getTodoById(id);
    }

    @PutMapping("/update")
    public List<Todo> updateTodoById(@RequestBody Todo todo){
        return todoRepository.updateTodoById(todo);
    }

    @PostMapping("/add")
    public List<Todo> addTodo(@RequestBody Todo todo){
        return todoRepository.addItems(todo);
    }

    @DeleteMapping("/delete/{id}")
    public List<Todo> deleteTodo(@PathVariable int id){
        return todoRepository.deleteTodo(id);
    }
}
