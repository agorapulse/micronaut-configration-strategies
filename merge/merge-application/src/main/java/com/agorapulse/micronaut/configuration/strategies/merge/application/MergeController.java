package com.agorapulse.micronaut.configuration.strategies.merge.application;

import com.agorapulse.micronaut.configration.strategies.merge.one.MergeConfigurationOne;
import com.agorapulse.micronaut.configration.strategies.merge.two.MergeConfigurationTwo;
import io.micronaut.context.ApplicationContext;
import io.micronaut.core.util.CollectionUtils;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.Map;

@Controller("/merge")
public class MergeController {

    private final MergeConfigurationOne one;
    private final MergeConfigurationTwo two;
    private final ApplicationContext ctx;

    public MergeController(MergeConfigurationOne one, MergeConfigurationTwo two, ApplicationContext ctx) {
        this.one = one;
        this.two = two;
        this.ctx = ctx;
    }

    @Get("/")
    Map renderConfiguration() {
        return CollectionUtils.mapOf("one", one, "two", two, "envs", ctx.getEnvironment().getActiveNames());
    }

}
