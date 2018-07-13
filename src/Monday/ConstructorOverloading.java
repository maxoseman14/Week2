package Monday;

public class ConstructorOverloading {

    public void QA () {
        System.out.println("Hello");
    }
    public void QA (int a){
        this.QA();                     //this. calls the QA method which doesn't take any values first, then prints a
        System.out.println(a);
    }
    public void QA (int a, int b){
        System.out.println(a + b);
    }
}
