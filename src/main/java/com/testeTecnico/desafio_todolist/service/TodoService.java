package com.testeTecnico.desafio_todolist.service;

import com.testeTecnico.desafio_todolist.entity.Todo;
import com.testeTecnico.desafio_todolist.repository.TodoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

  private TodoRepository todoRepository;
  public TodoService(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public List<Todo> create(Todo todo) {
    todoRepository.save(todo);
    return list();
  }
  public List<Todo> list() {
    // Filtra por prioridade e depois por nome.
    Sort sort = Sort.by(Sort.Direction.ASC, "prioridade").descending().and(
            Sort.by(Sort.Direction.ASC, "name").ascending()
    );
    return todoRepository.findAll(sort);
  }
  public List<Todo> update(Todo todo) {
    todoRepository.save(todo);
    return list();
  }
  public List<Todo> delete(Long id) {
    todoRepository.deleteById(id);
    return list();
  }

}
