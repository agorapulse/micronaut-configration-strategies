package com.agorapulse.micronaut.configuration.strategies.simple.application;

import com.agorapulse.micronaut.configuration.strategies.simple.one.SimpleConfigurationOne;
import com.agorapulse.micronaut.configuration.strategies.simple.two.SimpleConfigurationTwo;
import io.micronaut.core.util.CollectionUtils;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.Map;

@Controller("/simple")
public class SimpleController {

    private final SimpleConfigurationOne one;
    private final SimpleConfigurationTwo two;

    public SimpleController(SimpleConfigurationOne one, SimpleConfigurationTwo two) {
        this.one = one;
        this.two = two;
    }

    @Get("/")
    Map renderConfiguration() {
        return CollectionUtils.mapOf("one", one, "two", two);
    }

}
