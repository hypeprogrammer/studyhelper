package com.knou.studyhelper.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "users") // 테이블 이름을 "users"로 변경
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;

    // 기본 생성자
    public User() {
    }

    // 매개변수를 받는 생성자 (선택 사항)
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getter와 Setter 메서드
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
