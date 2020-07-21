package unitTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import tickets.TicketPrice;

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
