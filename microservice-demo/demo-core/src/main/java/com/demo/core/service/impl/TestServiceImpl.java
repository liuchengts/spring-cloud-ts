package com.demo.core.service.impl;
import com.demo.core.repository.TestRepository;
import com.demo.core.service.TestService;
import com.demo.common.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 实现db的业务接口
 */
@Service
public class TestServiceImpl implements TestService {
    private final TestRepository testRepository;

    @Autowired
    public TestServiceImpl(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

}
