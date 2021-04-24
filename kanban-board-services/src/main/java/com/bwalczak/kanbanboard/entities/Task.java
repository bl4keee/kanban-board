package com.bwalczak.kanbanboard.entities;

import lombok.Data;
import java.util.Date;
import javax.persistence.*;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.CreationTimestamp;

@Data
@Entity
@Table(name = "task")
public class Task {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "color")
    private String color;

    @Column(name = "title")
    private String title;

    @Column(name = "assignee")
    private Person assignee;

    @Column(name = "assignor")
    private Person assignor;

    @UpdateTimestamp
    @Column(name = "lastUpdated")
    private Date lastUpdated;

    @CreationTimestamp
    @Column(name = "dateCreated")
    private Date dateCreated;

    @Column(name = "status")
    private TaskStatus status;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private TaskCategory category;

}
