package Monday;//INHERITANCE

public class Math_Main {
    public static void main(String[] args) {

        Math2 results = new Math2();
        //Monday.Math2 inherits members of Monday.Math class, so will run both Monday.Math and Monday.Math2 methods

        results.Add(7,3);
        results.Subtract(5,1);
        results.Multiply(4,3);

        Math3 allmethods = new Math3();
        //Monday.Math3 inherits all members from Monday.Math2 and Monday.Math

        allmethods.Add(5, 5);
        allmethods.Subtract(4, 1);
        allmethods.Multiply(3, 3);
        allmethods.Division(9, 3);


    }
}
