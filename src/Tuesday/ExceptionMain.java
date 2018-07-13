package Tuesday;

public class ExceptionMain {

    public static void main(String x[]) {      //to run method with values in the string array Alt + Shift + F10, edit configurations

        int result, a, b = 0;

        try{
            a = Integer.parseInt(x[0]);       //first number in the array = a
            b = Integer.parseInt(x[1]);       //second number in the array = b
            result = a / b;
            System.out.println(result);
        }
        catch (ArithmeticException e){
            System.out.println("We can't divide a number by 0");
        }
        catch (NumberFormatException e){
            System.out.println("Please input digits only");
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Invalid number of values in array");
        }

    }
}
