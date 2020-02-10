package com.agorapulse.micronaut.configuration.strategies.simple.one;

import io.micronaut.context.annotation.ConfigurationProperties;
import io.micronaut.core.bind.annotation.Bindable;

import javax.validation.constraints.NotBlank;



        @ConfigurationProperties("simple.one")
        public interface SimpleConfigurationOne {

            @NotBlank
            @Bindable(defaultValue = "FOO1")
            String getFoo();

            String getBar();

        }







