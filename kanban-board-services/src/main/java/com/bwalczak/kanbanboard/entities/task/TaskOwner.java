package com.bwalczak.kanbanboard.entities.task;

import com.bwalczak.kanbanboard.entities.common.Person;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "task_owners")
public class TaskOwner extends Person {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private Set<Task> tasks = new HashSet<>();

}
