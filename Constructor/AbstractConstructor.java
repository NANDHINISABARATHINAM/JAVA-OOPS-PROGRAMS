abstract class Demo{
    Demo(){
        System.out.println("constructor inside the abstract class");
    }
}
public class AbstractConstructor extends Demo{
    public static void main(String[] args) {
        AbstractConstructor ob=new AbstractConstructor();
    }
}
