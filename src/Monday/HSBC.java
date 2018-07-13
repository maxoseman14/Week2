package Monday;
//ABSTRACTION

class HSBC extends Bank {


    public void Deposit(int a){
        balance += a;
    }

    public void Withdraw(int b) {
        balance -= b;

    }
    public void Total(){
        total += balance;
    }
}







