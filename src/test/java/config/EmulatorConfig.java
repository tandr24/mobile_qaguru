package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:emulator.properties")
public interface EmulatorConfig extends Config {

    @Key("platform.name")
    @DefaultValue("android")
    String platformName();

    @Key("device.name")
    @DefaultValue("Pixel 7")
    String deviceName();

    @Key("app.package")
    @DefaultValue("org.wikipedia")
    String appPackage();

    @Key("app.activity")
    @DefaultValue("org.wikipedia.main.MainActivity")
    String appActivity();

    @Key("device.avd")
    @DefaultValue("http://localhost:4723")
    String deviceAvd();
}
