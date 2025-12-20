package config;

import org.aeonbits.owner.Config.Sources;
import org.aeonbits.owner.Config;

@Sources("classpath:${platform}.properties")
public interface MobileConfig extends Config {

    @Key("platform")
    @DefaultValue("android")
    String platform();

    @Key("os_version")
    @DefaultValue("12.0")
    String os_version();

    @Key("device")
    @DefaultValue("Samsung Galaxy S22 Ultra")
    String device();
}