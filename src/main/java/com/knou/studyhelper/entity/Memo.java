package com.knou.studyhelper.entity;

import jakarta.persistence.*;

@Entity
public class Memo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;
    @ManyToOne
    private User user;
    // getters and setters
}
