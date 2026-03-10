interface Bank{
    void account();
}
interface Trans{
    void pay();
    void send();
}
class Gpay implements Trans,Bank{
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
public class InterfaceClassimple {
    public static void main(String[] args){
        Gpay g=new Gpay();
        Phonpe p=new Phonpe();
        g.pay();
        g.send();
        g.account();
        p.pay();
        p.send();
        p.account();
    }
}
