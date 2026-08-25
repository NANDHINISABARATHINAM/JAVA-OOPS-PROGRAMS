abstract class Demo{
    Demo(){
        System.out.println("constructor inside the abstract class");
    }
}
public class FinalConstructor extends Demo{
    final int a;
    FinalConstructor(){
        a=100;
        System.out.println(a);
    }
    FinalConstructor(int a1){
        a=a1;
        System.out.println(a);
    }
    public static void main(String[] args) {
        FinalConstructor ob=new FinalConstructor();
        FinalConstructor ob1=new FinalConstructor(200);
    }
}
