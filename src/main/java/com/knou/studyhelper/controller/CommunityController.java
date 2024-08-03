package com.knou.studyhelper.controller;

import com.knou.studyhelper.entity.Community;
import com.knou.studyhelper.service.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CommunityController {

    @Autowired
    private CommunityService communityService;

    @GetMapping("/community")
    public String showCommunityPage(Model model) {
        model.addAttribute("posts", communityService.getAllPosts());
        return "community";
    }

    @PostMapping("/community")
    public String createPost(@ModelAttribute Community community) {
        communityService.savePost(community);
        return "redirect:/community";
    }
}
