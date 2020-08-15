package mUnitTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {
    @Test
    public void firstTest(){

        int x = 4+10;

        Assert.assertEquals(x,14);
    }

}

