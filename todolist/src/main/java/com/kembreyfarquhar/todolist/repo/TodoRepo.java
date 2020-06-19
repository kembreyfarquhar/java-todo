package com.kembreyfarquhar.todolist.repo;

import com.kembreyfarquhar.todolist.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo extends JpaRepository <TodoItem, Long> {
}
