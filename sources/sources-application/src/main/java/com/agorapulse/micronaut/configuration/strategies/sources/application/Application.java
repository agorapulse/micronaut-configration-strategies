package com.agorapulse.micronaut.configuration.strategies.sources.application;

import com.agorapulse.micronaut.configration.strategies.sources.one.PropertySourceConfigurationOne;
import io.micronaut.runtime.Micronaut;

public class Application {

    public static void main(String[] args) {
        Micronaut.build(args)
            .propertySources(PropertySourceConfigurationOne.defaults())
            .classes(Application.class)
            .start();
    }
}
