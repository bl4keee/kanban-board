package com.bwalczak.kanbanboard.dto.issue;

import com.bwalczak.kanbanboard.entities.task.Task;
import com.bwalczak.kanbanboard.entities.task.TaskAssignee;
import com.bwalczak.kanbanboard.entities.task.TaskCategory;
import com.bwalczak.kanbanboard.entities.task.TaskOwner;
import lombok.Data;

import java.util.Set;

@Data
public class Issue {

    private Task task;
    private TaskOwner taskOwner;
    private TaskCategory taskCategory;
    private Set<TaskAssignee> taskAssignees;
}
