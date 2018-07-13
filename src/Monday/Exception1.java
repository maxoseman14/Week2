package Monday;

public class Exception1 {

    public static void main(String[] args) {


     /*   int c = 0;
        c = 4 / 0;

        System.out.println(c);
        System.out.println("bye");                              //running this code will give an error (cannot divide by 0)
                                                                //'ArithmeticException' error
    }
    */

        int c = 0;

        try {                                                   //use try catch block
            c = 4 / 0;
        } catch (ArithmeticException e) {                       //catches object of exception and stores it in variable 'e'
            System.out.println("Cannot divide a number by 0");
        }
        System.out.println(c);                                  //variable c is set to 0
        System.out.println("bye");
    }
}

