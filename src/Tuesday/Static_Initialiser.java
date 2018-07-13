package Tuesday;

public class Static_Initialiser {

    static int x;

    static{                         //code in the static initializer is executed first, followed by the code in the constructor
        x = 20;                     //x is initialised to 20 once, it is then updated in following methods
    }

    Static_Initialiser(){
        System.out.println(x);

    }
    public void setX(int x){
        this.x = x;
    }
}
