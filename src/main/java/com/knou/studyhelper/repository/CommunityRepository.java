package com.knou.studyhelper.repository;

import com.knou.studyhelper.entity.Community;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommunityRepository extends JpaRepository<Community, Long> {
    List<Community> findByUserId(Long userId);
}
