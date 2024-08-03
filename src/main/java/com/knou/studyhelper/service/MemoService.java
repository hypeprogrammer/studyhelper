package com.knou.studyhelper.service;

import com.knou.studyhelper.entity.Memo;
import com.knou.studyhelper.repository.MemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemoService {

    @Autowired
    private MemoRepository memoRepository;

    public List<Memo> getAllMemos() {
        return memoRepository.findAll();
    }

    public void saveMemo(Memo memo) {
        memoRepository.save(memo);
    }
}
