package com.example.todobackend;

import org.springframework.data.jpa.repository.JpaRepository;


public interface TaskRepository extends JpaRepository<Task,Integer> {
    Task findById(int id);
}
