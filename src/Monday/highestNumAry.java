package Monday;

import java.util.Arrays;

public class highestNumAry {

    public static void main(String[] args) {

        int [] array1 = new int[4];
        array1[0] = 35;
        array1[1] = 43;
        array1[2] = 23;
        array1[3] = 76;


        Arrays.sort(array1);
        System.out.println(array1[3]);

        System.out.println("");

        //print all odd numbers in the array
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 != 0){
                System.out.println(array1[i]);
            }

        }

    }
}
