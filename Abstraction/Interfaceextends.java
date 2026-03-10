interface Bank{
    int a=10;//public static final int a=10;
    void account();
}
interface Trans extends Bank{
    void pay();
    void send();
}
class Data{
    void userData(){
        System.out.println("user data");
    }
}
class Gpay extends Data implements Trans{
    //can use 1 extends,but more implements
    Gpay(){
        System.out.println("constructor");
    }
    public void pay(){
        System.out.println("paying with gpay");
    }
    public void send(){
        System.out.println("sending amount using gpay");
    }
    public void account(){
        System.out.println("gpay account");
    }

}
class Phonpe implements Trans,Bank{
    Phonpe(){
        System.out.println("constructor");
    }
    public void pay(){
        System.out.println("paying with phone pay");
    }
    public void send(){
        System.out.println("sending amount using phone pay");
    }
    public void account(){
        System.out.println("Phone pay account");
    }
}
public class Interfaceexten {
    public static void main(String[] args){
        Gpay g=new Gpay();
        Phonpe p=new Phonpe();
        g.pay();
        g.send();
        g.account();
        g.userData();
        System.out.println(Bank.a);
        System.out.println(Trans.a);
        p.pay();
        p.send();
        p.account();
    }
}

