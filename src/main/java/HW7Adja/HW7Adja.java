package HW7Adja;

public class HW7Adja {
    public static void main(String[] args) {
        System.out.println("Question 1");
        int[] tab= {2,3,5,6,7,8};
        int sumtotal=sum(tab);
        System.out.println(sumtotal);
        System.out.println("\nQuestion 2");
        int[] tab2={3,9,1,8,4,8,5};
        sort(tab2);
        for(int z:tab2){
            System.out.println(z);
        }

        System.out.println("\nQuestion 3");
        int[] tab3= {3,9,1,8,4,8,5};
        int y=min(tab3);
        System.out.println(y);

    }
    public static int sum(int[] arr1){
        int total=0;
        for (int v:arr1) {
            total=total+v;
        }
        return total;
    }
    public static void sort(int[] arr2){
        int temp = 0;
        for(int i=0;i<arr2.length;i++){
            for(int j=i+1;j<arr2.length;j++){
                if(arr2[i]>arr2[j]){
                    temp=arr2[i];
                    arr2[i]=arr2[j];
                    arr2[j]=temp;
                }

            }

        }
        /*for(int w=0; w<arr2.length;w++) {
            arr2[w]=sortedarray[w];
        }*/
    }

    public static int min(int[] array3){
        int minimum=array3[0];
        for (int v:array3){
            if (minimum>v){
                minimum=v;
            }


        }
        return minimum;

    }
}


