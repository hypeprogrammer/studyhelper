package com.knou.studyhelper.entity;

import jakarta.persistence.*;

@Entity
public class Community {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
    @ManyToOne
    private User user;
    // getters and setters
}
