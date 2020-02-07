package com.agorapulse.micronaut.configuration.strategies.sources.application;

import io.micronaut.core.util.CollectionUtils;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import com.agorapulse.micronaut.configration.strategies.sources.one.PropertySourceConfigurationOne;

import java.util.Map;

@Controller("/sources")
public class SourcesController {

    private final PropertySourceConfigurationOne one;

    public SourcesController(PropertySourceConfigurationOne one) {
        this.one = one;
    }

    @Get("/")
    Map renderConfiguration() {
        return CollectionUtils.mapOf("one", one);
    }

}
