package com.knou.studyhelper.controller;

import com.knou.studyhelper.entity.Comment;
import com.knou.studyhelper.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping("/comment")
    public String createComment(@ModelAttribute Comment comment) {
        commentService.saveComment(comment);
        return "redirect:/board"; // or appropriate redirect depending on the context
    }
}
