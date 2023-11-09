package com.codewithsarav.springboottodo.repository;

import com.codewithsarav.springboottodo.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class TodoRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Todo> getAll(){
        return jdbcTemplate.query("SELECT id,item,created_at,updated_at FROM todo_db",new BeanPropertyRowMapper<>(Todo.class));
    }

    public Todo getTodoById(int id) {
        return jdbcTemplate.queryForObject("SELECT id,item FROM todo_db WHERE id=?", new Object[]{id},new BeanPropertyRowMapper<>(Todo.class));
    }

    public List<Todo> updateTodoById(Todo todo) {
        jdbcTemplate.update("UPDATE todo_db SET item=? WHERE id=?", new Object[]{todo.getItem(),todo.getId()});
        return getAll();
    }

    public List<Todo> addItems(Todo todo) {
        jdbcTemplate.update("INSERT INTO todo_db (item) VALUES(?)", new Object[]{todo.getItem()});
        return getAll();
    }

    public List<Todo> deleteTodo(int id) {
        jdbcTemplate.update("DELETE FROM todo_db WHERE id=?",new Object[]{id});
        return getAll();
    }
}
