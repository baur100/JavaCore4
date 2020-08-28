package API;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static io.restassured.RestAssured.given;


public class petStore {
  @Test
  public void getPetByID() {
      Response response =
              given()
                .baseUri("https://petstore.swagger.io/v2")
                .basePath("/pet/8150")
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
    public void getPetByStatus(){
    Response response =
             given()
              .baseUri("https://petstore.swagger.io/v2")
              .basePath("pet/findByStatus")
              .queryParam("status", "pending")

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
  public void getOrderByOrderID(){
    Response response =
            given()
                      .baseUri("https://petstore.swagger.io/v2")
                      .basePath("store/order/8")
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
    public void getInventory(){
      Response response =
              given()
                      .baseUri("https://petstore.swagger.io/v2")
                      .basePath("store/inventory")
              .when()
                    .get()
              .then()
                    .statusCode(200)
                    .extract()
                    .response();
  }

  @Test
  public void getUserByUsername(){
    Response response =
            given()
                    .baseUri("https://petstore.swagger.io/v2")
                    .basePath("/user/apark03")
                    .when()
                      .get()
                    .then()
                      .statusCode(200)
                      .extract()
                      .response();
  }
}
