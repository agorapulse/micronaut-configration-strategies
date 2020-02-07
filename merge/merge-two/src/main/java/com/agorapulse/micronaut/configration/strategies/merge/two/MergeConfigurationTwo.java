package com.agorapulse.micronaut.configration.strategies.merge.two;

import io.micronaut.context.annotation.ConfigurationProperties;

@ConfigurationProperties("merge.two")
public interface MergeConfigurationTwo {

    String getFoo();
    String getBar();

}
