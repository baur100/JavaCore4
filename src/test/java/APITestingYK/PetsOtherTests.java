package APITestingYK;

import ModelsYK.PetBase;
import ModelsYK.PetResponse;
import ModelsYK.PostPetRequest;
import helpersYK.RandomGenerator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PetsOtherTests {
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
    @Test
    public void getPetByStatus() {
        Response response =
                given()
                        .baseUri("https://petstore.swagger.io/v2")
                        .basePath("/pet/findByStatus")
                        .header("Content-Type", "application/json")
                        .queryParam("status", "available")
                        .when()
                        .get()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        System.out.println(response.asString());
        JsonPath jsonResponse = response.jsonPath();
        PetResponse[] petResponse = jsonResponse.getObject("$", PetResponse[].class);
        for (int i=0; i<petResponse.length; i++){
            for (int l=0; l<petResponse[i].getTags().length; l++)
                System.out.println(petResponse[i].getTags()[l].getId());
        }
        System.out.println(petResponse.length);
        Assert.assertEquals(petResponse.length, 258);
    }

    @Test
    public void deletePet(){
        Response response =
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
}

