package io.quarkus.sentry;
public final class SentryConfig$$accessor {
    private SentryConfig$$accessor() {}
    @SuppressWarnings("unchecked")
    public static Object get_dsn(Object __instance) {
        return ((SentryConfig)__instance).dsn;
    }
    @SuppressWarnings("unchecked")
    public static void set_dsn(Object __instance, Object dsn) {
        ((SentryConfig)__instance).dsn = (String)dsn;
    }
    @SuppressWarnings("unchecked")
    public static Object get_packages(Object __instance) {
        return ((SentryConfig)__instance).packages;
    }
    @SuppressWarnings("unchecked")
    public static void set_packages(Object __instance, Object packages) {
        ((SentryConfig)__instance).packages = (String)packages;
    }
    public static Object construct() {
        return new SentryConfig();
    }
}
