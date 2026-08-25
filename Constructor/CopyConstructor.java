class Demo{
    int a=10;
    void method(){
        System.out.println("demo class");
    }
}
class Sample{
    Demo ob;
    Sample(Demo ob){
    this.ob=ob;
    }
    void method2(){
        System.out.println(ob.a);
        ob.method();
    }
}
public class CopyConstructor{
    public static void main(String[] args) {
        Demo ob=new Demo();
        Sample obj=new Sample(ob);
        obj.method2();
    }
}
