package apiTests;


import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.CategoryResponse;
import models.PetResponse;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class petStore {
    @Test
    public void getPetById(){
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


        JsonPath jsonResponse = response.jsonPath();
        PetResponse pet = jsonResponse.getObject("$", PetResponse.class);

        // var list = jsonResponse.getObject("$", PetResponse[].class);
        CategoryResponse category = jsonResponse.getObject("category",CategoryResponse.class);



        Assert.assertEquals(pet.getName(),"CaptainJack");
        String catName = pet.getCategory().getName();
        Assert.assertEquals(catName,"birds");

        Assert.assertEquals(category.getName(),"birds");

    }
}
