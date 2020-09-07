package APITestingYK;

import ModelsYK.PetBase;
import ModelsYK.PetResponse;
import ModelsYK.PostPetRequest;
import helpersYK.RandomGenerator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import static io.restassured.RestAssured.given;

public class PetGet {
    private PetBase pet;
    private long petId;

    @BeforeMethod
    public void startUp() {
        PostPetRequest petRequest = RandomGenerator.postPetRequestGenerator();
        pet = petRequest;
        Response response =
                given()
                        .baseUri("https://petstore.swagger.io/v2")
                        .basePath("/pet")
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
        pet = petResponse;
        petId = petResponse.getId();
    }

    @AfterMethod
    public void tearDown() {
                given()
                        .baseUri("https://petstore.swagger.io/v2")
                        .basePath("/pet/"+petId)
                        .when()
                        .delete()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
    }
    @Test
    public void getPetById() {
        Response response =
                given()
                        .baseUri("https://petstore.swagger.io/v2")
                        .basePath("/pet/"+petId)
                        .when()
                        .get()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        JsonPath jsonResponse = response.jsonPath();
        PetResponse petResponse = jsonResponse.getObject("$", PetResponse.class);
        Assert.assertEquals(petResponse.getName(), pet.getName());
        System.out.println(petId);
    }
}
