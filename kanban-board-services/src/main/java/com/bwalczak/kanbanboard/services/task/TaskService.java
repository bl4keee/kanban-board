package com.bwalczak.kanbanboard.services.task;

import com.bwalczak.kanbanboard.entities.task.Task;

import java.util.List;

public interface TaskService {

    List<Task> getAllTasks();
}
