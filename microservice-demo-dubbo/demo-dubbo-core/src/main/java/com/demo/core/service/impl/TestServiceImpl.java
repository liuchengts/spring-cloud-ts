package com.demo.core.service.impl;

import com.demo.common.primary.Test;
import com.demo.common.secondary.Stest;
import com.demo.core.repository.primary.TestRepository;
import com.demo.core.repository.secondary.StestRepository;
import com.demo.core.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 实现db的业务接口
 */
@Service
public class TestServiceImpl implements TestService {
    private final TestRepository testRepository;
    private final StestRepository stestRepository;

    @Autowired
    @SuppressWarnings("all")
    public TestServiceImpl(TestRepository testRepository, StestRepository stestRepository) {
        this.testRepository = testRepository;
        this.stestRepository = stestRepository;
    }

    @Transactional
    @Override
    public boolean add(Test test, Stest stest) {
        testRepository.save(test);
//        if (1 == 1) {
//            throw new RuntimeException("自定义异常");
//        }
        stestRepository.save(stest);
        return true;
    }
}
