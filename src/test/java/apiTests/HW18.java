package apiTests;


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

        String res = response.asString();
        System.out.println(res);
    }

    @Test
    public void getPetById1() {
        Response response1 =
                given()
                        .baseUri("https://petstore.swagger.io/v2/")
                        .basePath("pet/250")
                        .when()
                        .get()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();

        String res1 = response1.asString();
        System.out.println(res1);


    }

    @Test
    public void getPetById2() {
        Response response2 =
                given()
                        .baseUri("https://petstore.swagger.io/v2/")
                        .basePath("pet/275")
                        .when()
                        .get()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();

        String res2 = response2.asString();
        System.out.println(res2);

    }

    @Test
    public void getPetById3() {
        Response response3 =
                given()
                        .baseUri("https://petstore.swagger.io/v2/")
                        .basePath("pet/275")
                        .when()
                        .get()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();

        String res3 = response3.asString();
        System.out.println(res3);
    }
    @Test
    public void getPetById4() {
        Response response4 =
                given()
                        .baseUri("https://petstore.swagger.io/v2/")
                        .basePath("pet/300")
                        .when()
                        .get()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();

        String res4 = response4.asString();
        System.out.println(res4);
    }

}