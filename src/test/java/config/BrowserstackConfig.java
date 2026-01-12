package config;

import org.aeonbits.owner.Config.Sources;
import org.aeonbits.owner.Config;

@Sources("classpath:properties/bs.properties")
public interface BrowserstackConfig extends Config {

    @DefaultValue("android")
    String platform();

    @Key("os_version")
    @DefaultValue("13.0")
    String os_version();

    @Key("device")
    @DefaultValue("Google Pixel 7 Pro")
    String device();

    @Key("userName")
    String userName();

    @Key("accessKey")
    String accessKey();
}