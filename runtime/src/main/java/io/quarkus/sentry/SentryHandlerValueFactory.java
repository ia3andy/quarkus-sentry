package io.quarkus.sentry;

import io.quarkus.runtime.RuntimeValue;
import io.quarkus.runtime.annotations.Recorder;
import io.sentry.Sentry;
import io.sentry.jul.SentryHandler;

import java.util.Optional;
import java.util.logging.Handler;
import java.util.logging.Level;

@Recorder
public class SentryHandlerValueFactory {

    public RuntimeValue<Optional<Handler>> create(final SentryConfig config) {
        System.setProperty("sentry.stacktrace.app.packages", config.packages);
        Sentry.init(config.dsn);
        SentryHandler handler = new SentryHandler();
        handler.setLevel(Level.WARNING);
        return new RuntimeValue<>(Optional.of(handler));
    }
}
