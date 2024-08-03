package com.knou.studyhelper.repository;

import com.knou.studyhelper.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByBoardId(Long boardId);
    List<Comment> findByUserId(Long userId);
}
