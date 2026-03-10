abstract class Bank{
    abstract void loan();
    abstract void account();
    void atm(){
        System.out.println("atm");
    }
}
class Car extends Bank{
    Car(){
        System.out.println("constructor");
    }
    void loan(){
        System.out.println("car loan");
    }
    void account(){
        System.out.println("account");
    }
}
public class Abstraction {
    public static void main(String[] args){
        Car c=new Car();
        c.loan();
        c.account();
        c.atm();
    }
}
