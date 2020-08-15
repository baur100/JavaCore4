package mUnitTests;

/*
* Unit Tests are testing methods (only method level testing) in the class
* While intergration test is what people calling -- Testing of the API
* Unit Test using TestNG
* Test NG is not connected to Selenium
* Test NG is used by developers for Developers for Unit Testing
* Unit Testing are very fast
* eg. 6000 Unit Test cases takes only 60 seconds
* While 200 Integrated Test cases consumes about hours to complete the cases
*  */

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tickets.TicketPrice;

public class TestTicketCalculation {


    /* DataProvider - used for multiple inputs for the same test - reduces code
    * Otherwise ~ multiple inputs can be also be fed from testng.xml file
    * Array of Arrays
    * Square of Arrays ~ Kind of square objects
    * Objects is the base class of any object in java
    * Here the data is provided in the following order:
    * input- {age, fixed full price} , result - discounted price*/
    @DataProvider(name="Ages")
    public Object[][] createData(){
        return new Object[][]{
            {1,1000,0.0},
                /*border conditions: age = 2 and 3*/
                {2,1000,0.0},
                {3,1000,500.0},
            {10,1000,500.0},
            {20,1000,1000.0},
            {70,1000,800.0}
        };
    }

    @Test(dataProvider = "Ages")
    public void testTicketPrice(int age, int price, double fare){
//        Arrange
        TicketPrice ticketPrice = new TicketPrice(price);

//        Action
        double result = ticketPrice.getPrice(age);

//        Assert
        Assert.assertEquals(result,fare);

    }


    @Test /* @Test is just a method that contains 3 parts Arrange, Act, Assert*/
//    positive1
    public void testTicketCalculation_infant_priceIsZero(){
//        Arrange
        TicketPrice ticketPrice = new TicketPrice(1000);

//        Action
        double result = ticketPrice.getPrice(1);

//        Assert
        Assert.assertEquals(result,0.0);
    }


    @Test
//    Negative2
    public void testTicketCalculation_infant_priceIsZero_Neg(){
//        Arrange
        TicketPrice ticketPrice = new TicketPrice(1000);

//        Act
        double result = ticketPrice.getPrice(1);

//        Assert
        Assert.assertEquals(result,1000.0);

    }


    @Test
//    positive2
    public void testTicketCalculation_child_priceIs50percent_Pstv(){
//        Arrange
        TicketPrice ticketPrice = new TicketPrice(1000);

//        Act
        double result = ticketPrice.getPrice(10);

//        Assert
        Assert.assertEquals(result,500.0);

    }

    @Test
//    Negative2
    public void testTicketCalculation_child_priceIs50percent_Neg(){
//        Arrange
        TicketPrice ticketPrice = new TicketPrice(1000);

//        Act
        double result = ticketPrice.getPrice(10);

//        Assert
        Assert.assertEquals(result,1500.0);

    }

    @Test
//    positive3
    public void testTicketCalculation_adult_priceIsFull_Pstv(){
//        Arrange
        TicketPrice ticketPrice = new TicketPrice(1000);

//        Act
        double result = ticketPrice.getPrice(30);

//        Assert
        Assert.assertEquals(result,1000.0);

    }

    @Test
//    negative3
    public void testTicketCalculation_adult_priceIsFull_Neg(){
//        Arrange
        TicketPrice ticketPrice = new TicketPrice(1000);

//        Act
        double result = ticketPrice.getPrice(30);

//        Assert
        Assert.assertEquals(result,5000.0);

    }

    @Test
//    positive4
    public void testTicketCalculation_seniors_priceIs80percent_Pstv(){
//        Arrange
        TicketPrice ticketPrice = new TicketPrice(1000);

//        Act
        double result = ticketPrice.getPrice(70);

//        Assert
        Assert.assertEquals(result,800.0);

    }

    @Test
//    negative4
    public void testTicketCalculation_seniors_priceIs80percent_Neg(){
//        Arrange
        TicketPrice ticketPrice = new TicketPrice(1000);

//        Act
        double result = ticketPrice.getPrice(70);

//        Assert
        Assert.assertEquals(result,4000.0);

    }



}
/*
*
public class TestTicketCalculation {
   @Test
   public void testTicketCalculation_infant_priceIsZero(){
       // Arrange
       TicketPrice ticketPrice = new TicketPrice(1000);

       // Act
       double result = ticketPrice.getPrice(1);

       // Assert
       Assert.assertEquals(result,0.0);
   }

   @Test
   public void testTicketCalculation_child_priceIsHalf(){
       // Arrange
       TicketPrice ticketPrice = new TicketPrice(1000);

       // Act
       double result = ticketPrice.getPrice(10);

       // Assert
       Assert.assertEquals(result,500.0);
   }

   @Test
   public void testTicketCalculation_adult_priceIsFull(){
       // Arrange
       TicketPrice ticketPrice = new TicketPrice(1000);

       // Act
       double result = ticketPrice.getPrice(20);

       // Assert
       Assert.assertEquals(result,1000.0);
   }

   @Test
   public void testTicketCalculation_senior_priceIs80percent(){
       // Arrange
       TicketPrice ticketPrice = new TicketPrice(1000);

       // Act
       double result = ticketPrice.getPrice(70);

       // Assert
       Assert.assertEquals(result,800.0);
   }
}

* */