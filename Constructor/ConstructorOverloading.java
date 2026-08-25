class Student{
    int mark=90;
    Student(){
        System.out.println("Student class constructor");
    }
    Student(String s){
        System.out.println(s);
    }
    void data(){
        System.out.println("I am a student");
    }
}
class School extends Student{
    School(){
        super("Parameterized constructor");
        //super();//by default in first statement, 'super()' must be first statement in constructor body, can use only one super() or this()
        System.out.println("School class constructor");
    }
    void studentdata(){
        data();
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        School ob=new School();
        ob.studentdata();
        System.out.println(ob.mark);
    }
}
