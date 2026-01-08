package config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources("classpath:emulator.properties")
public interface EmulatorConfig extends Config {

    @Key("platform.name")
    @DefaultValue("android")
    String platformName();

    @Key("device.name")
    @DefaultValue("Pixel 7")
    String deviceName();

    @Key("device.avd")
    @DefaultValue("Pixel_7")
    String deviceAvd();
}
