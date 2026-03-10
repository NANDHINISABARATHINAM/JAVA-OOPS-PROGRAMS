import java.util.*;
public class Excep {
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int n=10/a;
            System.out.println(n);
            int arr[]={1,2,3};
            System.out.println(arr[4]);
        }
        catch(ArithmeticException e){
            System.out.println("give numerical value,value should be greater than 0");
        }
        catch(InputMismatchException e){
            System.out.println("give valid input and input should be numeric");
        }
        catch(Exception r){
            System.out.println("Exception handled");
        }
        finally{
            System.out.println("Closing...");
        }
        System.out.println("Hello");
        System.out.println("Exception class");
    }
}
