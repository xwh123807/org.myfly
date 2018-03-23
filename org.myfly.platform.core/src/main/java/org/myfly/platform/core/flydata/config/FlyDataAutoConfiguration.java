package org.myfly.platform.core.flydata.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(FlyDataProperties.class)
public class FlyDataAutoConfiguration {

}
