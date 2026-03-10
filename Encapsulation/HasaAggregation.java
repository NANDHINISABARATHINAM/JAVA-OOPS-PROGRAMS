class Lib{
    Books ob;
    void collofbook(Books ob){
        this.ob=ob;
        System.out.println("s: "+ob.s+"s1: "+ob.s1);
        System.out.println("s2: "+ob.s2+"s3: "+ob.s3);
    }
}
class Books{
    String s="book1";
    String s1="book2";
    String s2,s3;
    Books(String s2,String s3){
        this.s2=s2;
        this.s3=s3;
    }
}
public class Hasaagg {
    public static void main(String[] args) {
        Books b=new Books("book3","book4");
        Lib l=new Lib();
        System.out.println(b.s);
        l.collofbook(b);
    }
}
