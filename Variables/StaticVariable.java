public class Main
{
    int a=100;//instance variable
    int b;
    static String name="java";//static variable
    static String s;
    int v1=1000;
    static int v2=2000;
	void fun(){
        System.out.println(a);
    }
    void fun(int n){
        System.out.println(n);
    }
	public static void main(String[] args) {
		Main ob=new Main();
		System.out.println(ob.a); //100
		System.out.println(ob.b); //0
		ob.fun(); //100
		ob.fun(10); //10
		
		System.out.println(name);//same class java
		System.out.println(s);//null
		System.out.println(Main.name);//diff.class java
		System.out.println(Main.s);//null
		
		System.out.println("Instance Variable : "+ob.v1);//1000
		System.out.println("Static Variable : "+v2);//2000
		System.out.println("Static Variable : "+ob.v2);//2000
		
		ob.v1=111;
		v2=222;
		System.out.println("Instance Variable : "+ob.v1);//111
		System.out.println("Static Variable : "+v2);//222
		System.out.println("Static Variable : "+ob.v2);//222
		
		Main ob1=new Main();
		System.out.println("Instance Variable : "+ob1.v1);//1000
		System.out.println("Static Variable : "+v2);//222
		System.out.println("Static Variable : "+ob1.v2);//222
		
	}
}
