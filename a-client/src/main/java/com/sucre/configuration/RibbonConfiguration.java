package com.sucre.configuration;

import com.netflix.loadbalancer.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ribbon负载均衡策略配置
 * RoundRobinRule 轮询策略
 * RandomRule 随机策略
 * RetryRule 重试策略(直到找到一个可用的server)
 * BestAvailableRule  最低并发策略(跳过断路器，并找到并发量最低的server)
 * AvailabilityFilteringRule 可用过滤策略
 * WeightedResponseTimeRule 响应时间加权策略
 * ZoneAvoidanceRule 区域权衡策略
 */
@Configuration
public class RibbonConfiguration {

    @Bean
    public IRule ribbonRule(){
        return new ZoneAvoidanceRule();
    }
}
