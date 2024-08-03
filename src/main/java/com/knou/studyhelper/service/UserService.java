package com.knou.studyhelper.service;

import com.knou.studyhelper.entity.User;
import com.knou.studyhelper.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void saveUser(User user) {
        log.info("saveUser id: {}, username: {}, password: {}", user.getId(), user.getUsername() ,user.getPassword());
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        log.info("saveUser id: {}, username: {}, password: {}", user.getId(), user.getUsername() ,user.getPassword());
        userRepository.save(user);
        User findUser = userRepository.findByUsername(user.getUsername());
        log.info("username: {}", findUser.getUsername());


    }
}
