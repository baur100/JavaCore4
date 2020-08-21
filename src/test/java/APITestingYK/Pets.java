package APITestingYK;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Pets {
    @Test
    public void getPetById(){
        Response response =
                given()
                    .baseUri("https://petstore.swagger.io/v2")
                    .basePath("/pet/20200995")
                .when()
                    .get()
                .then()
                    .statusCode(200)
                    .extract()
                    .response();
        String result = response.asString();
        System.out.println(result);
    }

    @Test
    public void deletePet(){
        Response response =
                given()
                        .baseUri("https://petstore.swagger.io/v2")
                        .basePath("/pet/20200995")
                        .when()
                        .delete()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        String result = response.asString();
        System.out.println(result);
    }

    @Test
    public void getDataKoel(){
        Response response =
                given()
                        .baseUri("https://koelapp.testpro.io/")
                        .basePath("/api/data")
                        .when()
                        .get()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        String result = response.asString();
        System.out.println(result);
    }

    @Test
    public void createPet(){
        Response response =
                given()
                        .baseUri("https://petstore.swagger.io/v2")
                        .basePath("/pet")
                        .when()
                        .post()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        String result = response.asString();
        System.out.println(result);
    }

}
