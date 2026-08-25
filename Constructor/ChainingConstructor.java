class Student{
    int mark=90;
    Student(){
        this("hello");
        System.out.println("Student class constructor");
    }
    Student(String s){
        this(3);
        System.out.println(s);
    }
    Student(int a){
        System.out.println(a+" rd constructor");
    }
    void data(){
        System.out.println("I am a student");
    }
}
class School extends Student{
    School(){
        //super("Parameterized constructor");
        //super();//by default in first statement, 'super()' must be first statement in constructor body, can use only one super() or this()
        System.out.println("School class constructor");
    }
    void studentdata(){
        data();
    }
}

public class ChainingConstructor {
    public static void main(String[] args) {
        School ob=new School();
        ob.studentdata();
        System.out.println(ob.mark);
    }
}