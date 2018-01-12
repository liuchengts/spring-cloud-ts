package com.demo.core.repository.secondary;

import com.demo.common.secondary.Stest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * db操作
 */
public interface StestRepository extends JpaRepository<Stest, Serializable>
        , JpaSpecificationExecutor<Stest> {


}
