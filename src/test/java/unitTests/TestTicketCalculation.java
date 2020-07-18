package unitTests;

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
import org.testng.annotations.Test;
import tickets.TicketPrice;

public class TestTicketCalculation {

    @Test // @Test is just a method that contains 3 parts Arrange, Act, Assert
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
    public void testTicketCalculation_adult_priceIs50percent_Pstv(){
//        Arrange
        TicketPrice ticketPrice = new TicketPrice(1000);

//        Act
        double result = ticketPrice.getPrice(30);

//        Assert
        Assert.assertEquals(result,1000.0);

    }

    @Test
//    negative3
    public void testTicketCalculation_adult_priceIs50percent_Neg(){
//        Arrange
        TicketPrice ticketPrice = new TicketPrice(1000);

//        Act
        double result = ticketPrice.getPrice(30);

//        Assert
        Assert.assertEquals(result,5000.0);

    }

    @Test
//    positive4
    public void testTicketCalculation_seniors_priceIs50percent_Pstv(){
//        Arrange
        TicketPrice ticketPrice = new TicketPrice(1000);

//        Act
        double result = ticketPrice.getPrice(70);

//        Assert
        Assert.assertEquals(result,800.0);

    }

    @Test
//    negative4
    public void testTicketCalculation_seniors_priceIs50percent_Neg(){
//        Arrange
        TicketPrice ticketPrice = new TicketPrice(1000);

//        Act
        double result = ticketPrice.getPrice(70);

//        Assert
        Assert.assertEquals(result,4000.0);

    }



}
