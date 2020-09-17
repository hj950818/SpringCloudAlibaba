package com.hujian.common.swagger.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Swagger 配置信息
 */
@Component
@Data
@ConfigurationProperties(prefix = "swagger")
public class SwaggerInfo {
    private String groupName;

    private String basePackage;

    private String title;

    private String host;
}
