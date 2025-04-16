import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {

@Test
    void ShouldPostBody() {
    given()
            .baseUri("https://postman-echo.com")
            .contentType("text/plain; charset=UTF-8")
            .body("Фамилия")
            .when()
            .post("/post")
            .then()
            .statusCode(220)
            .body("data", equalTo("Фамилия"))
    ;
}
}
