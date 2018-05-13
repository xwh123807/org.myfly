package org.myfly.platform.metamodel.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(FlyDataProperties.class)
public class FlyDataAutoConfiguration {

}
