package helpers;

import config.BrowserstackConfig;
import org.aeonbits.owner.ConfigFactory;

import static io.restassured.RestAssured.given;

public class Browserstack {

    public static String videoURL(String sessionID) {
        String url = String.format("https://api.browserstack.com/app-automate/sessions/%s.json", sessionID);
        final BrowserstackConfig config = ConfigFactory.create(
                BrowserstackConfig.class, System.getProperties()
        );
        return given()
                .auth().basic(config.userName(), config.accessKey())
                .get(url)
                .then()
                .log().status()
                .log().body()
                .statusCode(200)
                .extract().path("automation_session.video_url");

    }
}
