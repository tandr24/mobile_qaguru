package config;

import org.aeonbits.owner.Config.Sources;
import org.aeonbits.owner.Config;

@Sources("classpath:${platform}.properties")
public interface MobileConfig extends Config {

    @Key("platform")
    @DefaultValue("android")
   // @DefaultValue("ios")
    String platform();

    @Key("os_version")
    @DefaultValue("13.0")
   // @DefaultValue("16")
    String os_version();

    @Key("device")
    @DefaultValue("Google Pixel 7 Pro")
   // @DefaultValue("iPhone 14 Pro Max")
    String device();
}