package apiTests;

import helpers.RandomGenerator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.PetResponse;
import models.PostPetRequest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class petStore1 {
    private long petId;

    @AfterMethod
    public void tearDown() {
        given()
                .baseUri("https://petstore.swagger.io/v2/")
                .basePath("pet/" + petId)
                .when()
                .delete()
                .then()
                .extract()
                .response();
    }

    @Test
    public void postPet() {
        PostPetRequest petRequest = RandomGenerator.petRequestGenerator();
        Response response =
                given()
                        .baseUri("https://petstore.swagger.io/v2/")
                        .basePath("pet")
                        .header("Content-Type", "application/json")
                        .body(petRequest)
                        .when()
                        .post()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();

        JsonPath jsonPath = response.jsonPath();
        PetResponse petResponse = jsonPath.getObject("$", PetResponse.class);
        petId = petResponse.getId();
        Assert.assertEquals(petRequest.getName(), petResponse.getName());
    }

    @Test
    public void putPet() {
        Response response =
                given()
                        .baseUri("https://petstore.swagger.io/v2/")
                        .basePath("pet/")
                        .header("Content-Type", "application/json")
                        .when()
                        .put()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        JsonPath path = response.jsonPath();
        PetResponse[] pets = path.getObject("$", PetResponse[].class);
        System.out.println(pets.length);
    }

    @Test
    public void getPetbyID() {
        Response response =
                given()
                        .baseUri("https://petstore.swagger.io/v2/")
                        .basePath("pet/100")
                        .when()
                        .get()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        String pet1 = response.asString();
        System.out.println(pet1);
    }

    @Test
    public void getPetByStatus() {
        Response response =
                given()
                        .baseUri("https://petstore.swagger.io/v2/")
                        .basePath("pet/findByStatus")
                        .queryParam("status", "sold")
                        .when()
                        .get()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        String pet2 = response.asString();
        System.out.println(pet2);
    }

    @Test
    public void getOrderByOrderId() {
        Response response =
                given()
                        .baseUri("https://petstore.swagger.io/v2/")
                        .basePath("pet/findByStatus")
                        .queryParam("status", "sold")
                        .when()
                        .get()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        String pet2 = response.asString();
        System.out.println(pet2);
    }

    @Test
    public void deletePetById() {
        Response response =
                given()
                        .baseUri("https://petstore.swagger.io/v2/")
                        .basePath("pet/125")
                        .when()
                        .delete()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        String pet3 = response.asString();
        System.out.println(pet3);
    }

    @Test
    public void postOrderByPetId() {
        Response response =
                given()
                        .baseUri("https://petstore.swagger.io/v2/")
                        .basePath("store/order")
                        .queryParam("status", "placed")
                        .when()
                        .post()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        String pet4 = response.asString();
        System.out.println(pet4);
    }
}



