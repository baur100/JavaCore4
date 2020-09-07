package APITestingYK;

import ModelsYK.PetBase;
import ModelsYK.PetResponse;
import ModelsYK.PostPetRequest;
import ModelsYK.PutPetRequest;
import helpersYK.RandomGenerator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PetUpdate {
    private long petId;

    @BeforeMethod
    public void startUp() {
        PostPetRequest petRequest = RandomGenerator.postPetRequestGenerator();
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
        petId = petResponse.getId();
    }

    @AfterMethod
    public void tearDown() {
        given()
                .baseUri("https://petstore.swagger.io/v2")
                .basePath("/pet/" + petId)
                .when()
                .delete()
                .then()
                .statusCode(200)
                .extract()
                .response();
    }

    @Test
    public void updatePet() {
        PutPetRequest petRequest = RandomGenerator.putPetRequestGenerator();
        petRequest.setId(petId);
        Response response =
                given()
                        .baseUri("https://petstore.swagger.io/v2")
                        .basePath("/pet")
                        .header("Content-Type", "application/json")
                        .body(petRequest)
                        .when()
                        .put()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        JsonPath jsonPath = response.jsonPath();
        PetResponse petResponse = jsonPath.getObject("$", PetResponse.class);
        Assert.assertEquals(petRequest.getName(), petResponse.getName());
    }
}
