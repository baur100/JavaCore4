package apiTests;

import io.restassured.internal.RestAssuredResponseOptionsGroovyImpl;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.Category;
import models.PetResponse;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class HW18 {
    @Test
    public void getPetById() {
        Response response =
                given()
                        .baseUri("https://petstore.swagger.io/v2/")
                        .basePath("pet/150")
                        .when()
                        .get()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
    }

}
