package com.example.todobackend;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;


@RestController
@Transactional
@RequestMapping("api/v1")
@RequiredArgsConstructor
public class TaskController {

    private final TaskRepository repository;

    @GetMapping("/tasks")
    List<Task> findAllTask(){
        return repository.findAll();
    }


    @GetMapping("/tasks/{id}")
    Task findTask(@PathVariable int id){
        return repository.findById(id);
    }


    @PostMapping("/tasks")
    void insert(@RequestBody Task task){
        repository.save(task);
    }

    @DeleteMapping("/tasks/{id}")
    void delete(@PathVariable int id){
        repository.deleteById(id);
    }


}
