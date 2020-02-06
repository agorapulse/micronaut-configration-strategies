package com.agorapulse.micronaut.configuration.strategies.simple.two;

import io.micronaut.context.annotation.ConfigurationProperties;

import javax.validation.constraints.NotBlank;

@ConfigurationProperties("simple.two")
public class SimpleConfigurationTwo {

    public String getFoo() {
        return foo;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }

    public String getBar() {
        return bar;
    }

    public void setBar(String bar) {
        this.bar = bar;
    }

    @NotBlank
    private String foo = "FOO2";
    private String bar;

}
