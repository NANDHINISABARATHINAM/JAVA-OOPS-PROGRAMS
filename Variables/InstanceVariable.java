public class Main
{
    int a=100;//instance variable
    int b;
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
	}
}
