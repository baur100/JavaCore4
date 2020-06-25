package HW;

import java.util.Arrays;

public class June24 {

public static void main(String[] args) {
  int[] myArray ={2,3,5,6,7,8};
  System.out.println(sum(myArray));
  System.out.println("*****************");

  int[] myArray2 ={3,9,1,8,4,8,5};
  sortArray(myArray2);
  System.out.println(Arrays.toString(myArray2));
  System.out.println("*****************");

  int[] myArray3 = {3,9,1,8,4,8,5};
  int min = getMin(myArray3);
  System.out.println("Minimum value from my array is " + min);
}

  public static int sum(int myArray[]){
    int myTotal = 0;
    for(int i = 0; i<myArray.length; i++){
      myTotal+=myArray[i];
    }
    return myTotal;
  }

  public static void sortArray(int myArray[]){
    Arrays.sort(myArray);
  }

//3. Create a function  which takes int[] as a param and returns min of the array
// invoke it from main() - pass {3,9,1,8,4,8,5} as a param
  public static int getMin(int myArray[]){
  int min = myArray[0];
  for(int i=0; i<myArray.length; i++){
    if(min > myArray[i]){
      min = myArray[i];
    }
  }
  return min;
  }

}
