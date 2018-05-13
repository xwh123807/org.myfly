package org.myfly.platform.metamodel.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(FlyVPProperties.class)
public class FlyVPAutoConfiguration {

}
