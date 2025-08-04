package com.fitness.aiservice.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.commons.util.InetUtils;
import org.springframework.cloud.netflix.eureka.EurekaInstanceConfigBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EurekaClientConfig {
	@Value("${server.port}")
    private int port;

    @Bean
    public EurekaInstanceConfigBean eurekaInstanceConfig(InetUtils inetUtils) {
        EurekaInstanceConfigBean config = new EurekaInstanceConfigBean(inetUtils);
        config.setHostname("localhost");
        config.setIpAddress("127.0.0.1");
        config.setNonSecurePort(port);
        config.setPreferIpAddress(false);
        return config;
    }
}
