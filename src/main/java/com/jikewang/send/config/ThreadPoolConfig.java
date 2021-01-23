package com.jikewang.send.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @ProjectName: send
 * @Package: com.jikewang.send.config
 * @ClassName: ThreadPoolConfig
 * @Author: wangyaqiang
 * @Description:
 * @Date: 2021/1/13 11:43
 * @Version: 1.0
 */
@Configuration
@EnableAsync
public class ThreadPoolConfig
{
    @Bean
    public TaskExecutor taskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        // 线程池维护线程的最少数量
        executor.setCorePoolSize(5);
        // 线程池维护线程的最大数量
        executor.setMaxPoolSize(5);
        // 缓存队列
        executor.setQueueCapacity(200);
        // 允许的空闲时间
        executor.setKeepAliveSeconds(120);

        executor.setThreadNamePrefix("async-service-");
        // 对拒绝task的处理策略
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());

        executor.setWaitForTasksToCompleteOnShutdown(true);
        return executor;
    }
}
