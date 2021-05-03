package com.bwalczak.kanbanboard.controllers;

import com.bwalczak.kanbanboard.entities.task.Task;
import com.bwalczak.kanbanboard.services.task.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    @GetMapping("/")
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getTaskById(@PathVariable Long id) {

        Optional<Task> optionalTask = taskService.getTaskById(id);

        if (optionalTask.isPresent()) {
            return new ResponseEntity<>(optionalTask.get(), HttpStatus.OK);
        } else {
            return TaskNotFoundResponse(id);
        }
    }

    private ResponseEntity<String> TaskNotFoundResponse(Long id) {
        return new ResponseEntity<>("No task was found with id: " + id , HttpStatus.NOT_FOUND);
    }
}
