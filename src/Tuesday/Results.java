package Tuesday;

//Java Singleton Class - a class that can have only one object

public class Results {
    static Results x;
    private Results(){}

    static Results CreateObject() {
        if (x == null) {
            x = new Results();
        }
        return x;

        }
    }
