package com.knou.studyhelper.controller;

import com.knou.studyhelper.entity.Memo;
import com.knou.studyhelper.service.MemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemoController {

    @Autowired
    private MemoService memoService;

    @GetMapping("/memo")
    public String showMemoPage(Model model) {
        model.addAttribute("memos", memoService.getAllMemos());
        return "memo";
    }

    @PostMapping("/memo")
    public String createMemo(@ModelAttribute Memo memo) {
        memoService.saveMemo(memo);
        return "redirect:/memo";
    }
}
