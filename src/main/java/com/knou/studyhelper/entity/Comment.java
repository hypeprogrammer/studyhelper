package com.knou.studyhelper.entity;

import jakarta.persistence.*;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;
    @ManyToOne
    private User user;
    @ManyToOne
    private Board board;
    // or for Memo or Community, use @ManyToOne
    // getters and setters
}
