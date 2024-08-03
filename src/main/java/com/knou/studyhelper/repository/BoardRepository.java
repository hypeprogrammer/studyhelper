package com.knou.studyhelper.repository;

import com.knou.studyhelper.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
