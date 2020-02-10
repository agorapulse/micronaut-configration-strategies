package com.agorapulse.micronaut.configration.strategies.sources.one;

import io.micronaut.context.annotation.ConfigurationProperties;
import io.micronaut.context.env.PropertySource;
import io.micronaut.core.order.Ordered;
import io.micronaut.core.util.CollectionUtils;

import javax.annotation.MatchesPattern;
import javax.validation.constraints.NotBlank;
import java.util.Map;

@ConfigurationProperties("sources.one")
public interface PropertySourceConfigurationOne {

    String getFoo();
    String getBar();

    /**
     * Not used in runtime.
     *
     * This is a signal property which verifies
     * that the defaults has been set properly.
     *
     * <code>
     * Micronaut.build(args)
     *     .propertySources(
     *         PropertySourceConfigurationOne.defaults()
     *     )
     *     .classes(Application.class)
     *     .start();
     * </code>
     *
     * @return literally "cafebabe"
     */
    @NotBlank @MatchesPattern("cafebabe") String getCafebabe();

    static PropertySource defaults() {
        Map<String, Object> defaults = CollectionUtils.mapOf(
            "sources.one.foo", "DEFAULT_FOO",
            "sources.one.bar", "DEFAULT_BAR",
            "sources.one.cafebabe", "cafebabe"
        );
        return PropertySource.of(
            "property-source-one",
            defaults,
            -10000
        );
    }

}
