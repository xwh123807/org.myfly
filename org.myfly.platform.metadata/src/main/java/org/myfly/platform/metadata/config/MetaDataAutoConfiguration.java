package org.myfly.platform.metadata.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(MetaDataProperties.class)
public class MetaDataAutoConfiguration {

}
