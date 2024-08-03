package com.knou.studyhelper.service;

import com.knou.studyhelper.entity.Board;
import com.knou.studyhelper.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    public List<Board> getAllPosts() {
        return boardRepository.findAll();
    }

    public void savePost(Board board) {
        boardRepository.save(board);
    }
}
