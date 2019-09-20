package io.quarkus.sentry;

import io.quarkus.runtime.annotations.ConfigItem;
import io.quarkus.runtime.annotations.ConfigPhase;
import io.quarkus.runtime.annotations.ConfigRoot;

@ConfigRoot(phase = ConfigPhase.RUN_TIME)
public class SentryConfig {

    /**
     * Sentry DSN
     */
    @ConfigItem
    public String dsn;

    /**
     *  This option is highly recommended as it affects stacktrace grouping and display on Sentry. See documentation: https://docs.sentry.io/clients/java/config/#in-application-stack-frames
     */
    @ConfigItem
    public String packages;
}
