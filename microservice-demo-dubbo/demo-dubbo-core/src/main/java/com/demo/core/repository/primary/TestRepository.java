package com.demo.core.repository.primary;

import com.demo.common.primary.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import java.io.Serializable;

/**
 * db操作
 */
public interface TestRepository extends JpaRepository<Test, Serializable>
        , JpaSpecificationExecutor<Test> {


}
