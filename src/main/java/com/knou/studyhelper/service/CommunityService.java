package com.knou.studyhelper.service;

import com.knou.studyhelper.entity.Community;
import com.knou.studyhelper.repository.CommunityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommunityService {

    @Autowired
    private CommunityRepository communityRepository;

    public List<Community> getAllPosts() {
        return communityRepository.findAll();
    }

    public void savePost(Community community) {
        communityRepository.save(community);
    }
}
