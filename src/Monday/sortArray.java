package Monday;

import java.util.Arrays;

public class sortArray {



    public static void main(String[] args) {

        String [] array1 = new String[7];
        array1[0] = "D";
        array1[1] = "B";
        array1[2] = "A";
        array1[3] = "F";
        array1[4] = "G";
        array1[5] = "E";
        array1[6] = "C";

        Arrays.sort(array1);                            //sorts array in alphabetical order

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("");

        for (int i = array1.length - 1; i >= 0 ; i--) { //sorts array in reverse alphabetical order
            System.out.println(array1[i]);
        }
        }

    }

