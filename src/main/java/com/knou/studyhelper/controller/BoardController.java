package com.knou.studyhelper.controller;

import com.knou.studyhelper.entity.Board;
import com.knou.studyhelper.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/board")
    public String showBoardPage(Model model) {
        model.addAttribute("posts", boardService.getAllPosts());
        return "board";
    }

    @PostMapping("/board")
    public String createPost(@ModelAttribute Board board) {
        boardService.savePost(board);
        return "redirect:/board";
    }
}
