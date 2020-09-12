import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NinaExercise {
    @Test
    public void testArray(){
        int[] arr = {3,4,5,6,8,9};
        List<Integer> arrList =new  ArrayList<Integer>(Arrays.asList(12,3,4,5,6,7,8,72));
        int num = 80;

        boolean xx = checkArray(arrList,num);
        Assert.assertTrue(xx);
    }

    private boolean checkArray(List<Integer> arr, int num) {
        for (int v :arr) {
            boolean zz = arr.contains(num-v);
            if(zz){
                return true;
            }
        }
        return false;
    }
}
