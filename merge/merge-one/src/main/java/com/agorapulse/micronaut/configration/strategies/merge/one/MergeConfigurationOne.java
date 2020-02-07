package com.agorapulse.micronaut.configration.strategies.merge.one;

import io.micronaut.context.annotation.ConfigurationProperties;

@ConfigurationProperties("merge.one")
public interface MergeConfigurationOne {

    String getFoo();
    String getBar();

}
