package com.knou.studyhelper.repository;

import com.knou.studyhelper.entity.Memo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemoRepository extends JpaRepository<Memo, Long> {
    List<Memo> findByUserId(Long userId);
}
