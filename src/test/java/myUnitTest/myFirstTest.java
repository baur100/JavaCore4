package myUnitTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class myFirstTest {
    @Test
    public void firstTest(){
        int x = 5+10;
        Assert.assertEquals(x,15);
    }

}
