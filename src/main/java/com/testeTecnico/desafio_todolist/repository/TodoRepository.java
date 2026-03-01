package com.testeTecnico.desafio_todolist.repository;

import com.testeTecnico.desafio_todolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
