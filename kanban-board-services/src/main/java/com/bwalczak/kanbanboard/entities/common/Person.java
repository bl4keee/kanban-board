package com.bwalczak.kanbanboard.entities.common;

import lombok.Data;
import javax.persistence.*;

@Data
@MappedSuperclass
public class Person {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;
}
