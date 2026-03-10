import java.util.* ;
class School{
    void stu(){
        System.out.println("Student method!");
    }
    void sta(){
        System.out.println("Staff method");
    }
}
class Student extends School{
    void welcome(){
        System.out.println("Hello");
    }
}
class Staff extends School{
    void Hello(){
        System.out.println("Hi");
    }
}
public class Multiple_Inheritance {
    public static void main(String[] args) {

            System.out.println("Hello world!");
            Student ob1=new Student();
            ob1.welcome();
            ob1.stu();
            Staff ob2=new Staff();
            ob2.Hello();
            ob2.sta();
        }
    }
