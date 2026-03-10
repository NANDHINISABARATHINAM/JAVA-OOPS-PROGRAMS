class Student{
    String name;
    Address a;
    Student(String name,Address a){
        this.name=name;
        this.a=a;
    }
    void details(){
        System.out.println("Student name: "+name);
        System.out.println("Address: "+a.no+" "+a.street+" "+a.city);
    }
}
class Address{
    int no;
    String street;
    String city;
    Address(int no,String street,String city){
        this.no=no;
        this.street=street;
        this.city=city;
    }
}
public class Hasacom {
    public static void main(String[] args) {

        Student s=new Student("abc",new Address(1,"a","b"));
        s.details();
    }
}
