package com.demo.common;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

/**
 * Created by apple on 2018/1/18.
 * 将配送状态实时加入redis
 */
@RedisHash("distributionCache")
@Data
@Builder
public class TestCache {
    /**
     * 订单状态
     */
    @Id
    private String orderNo;
    /**
     * 配送状态
     */
    @Indexed
    private Integer distributionStatus;
    /**
     * 商家ID
     */
    @Indexed
    private Long sellerAccountId;
}
