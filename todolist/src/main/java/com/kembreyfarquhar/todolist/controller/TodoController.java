package com.kembreyfarquhar.todolist.controller;

import com.kembreyfarquhar.todolist.model.TodoItem;
import com.kembreyfarquhar.todolist.repo.TodoRepo;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/todo")
public class TodoController {

    @Autowired
    private TodoRepo todoRepo;

    @GetMapping
    public List<TodoItem> findAll(){
        return todoRepo.findAll();
    }

    @PostMapping
    public TodoItem save(@RequestBody @NotNull TodoItem todoItem){
        return todoRepo.save(todoItem);
    }
}
