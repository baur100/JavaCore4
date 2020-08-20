package apiTests;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class petStore {
    @Test
    public void getPetById(){
        Response response =
                given()
                    .baseUri("https://www.udemy.com/")
                    .basePath("api-2.0/search-suggestions")
                    .queryParam("q","ja")
                .when()
                    .get()
                .then()
                    .statusCode(200)
                    .extract()
                    .response();


        String res = response.asString();
        System.out.println(res);
    }
}
