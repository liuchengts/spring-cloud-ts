package com.demo.core.repository;

import com.demo.common.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import java.io.Serializable;

/**
 * db操作
 */
@Repository
public interface TestRepository extends JpaRepository<Test, Serializable>
        , JpaSpecificationExecutor<Test> {


}
