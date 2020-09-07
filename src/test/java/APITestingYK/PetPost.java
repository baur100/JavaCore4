package APITestingYK;

import ModelsYK.PetResponse;
import ModelsYK.PostPetRequest;
import ModelsYK.Tag;
import helpersYK.RandomGenerator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PetPost {
    private long petId;

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
    public void postPet(){
        PostPetRequest petRequest = RandomGenerator.postPetRequestGenerator();
        Response response =
                given()
                        .baseUri("https://petstore.swagger.io/v2")
                        .basePath("/pet")
                        .header ("Content-Type", "application/json")
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
        Assert.assertEquals(petRequest.getStatus(), petResponse.getStatus());
        Assert.assertEquals("pending", petResponse.getStatus());
        Assert.assertEquals(petRequest.getCategory().getId(), petResponse.getCategory().getId());
        Assert.assertEquals(petRequest.getCategory().getName(), petResponse.getCategory().getName());
        Assert.assertEquals(petRequest.getPhotoUrls(), petResponse.getPhotoUrls());

        String [] arr = petResponse.getPhotoUrls();
        String [] arr2 = petRequest.getPhotoUrls();
        for (int i=0; i< arr.length; i++){
            Assert.assertEquals(arr[i], arr2[i]);
            System.out.println(arr[i] + " and " + arr2[i]);
        }

        Tag[] xx = petResponse.getTags();
        Tag [] xx2 = petRequest.getTags();
        for (int i=0; i<xx.length; i++) {                                    //this option
            Assert.assertEquals(xx[i].getName(), xx2[i].getName());
        }
        for (int i=0; i<petResponse.getTags().length; i++){                  //or this - both are right
            Assert.assertEquals(petResponse.getTags()[i].getName(), petRequest.getTags()[i].getName());
            System.out.println(petResponse.getTags()[i].getName() +" and " + petRequest.getTags()[i].getName());
        }
        System.out.println(response.asString());
    }
}
