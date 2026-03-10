class LimitReachedException extends Exception{
    LimitReachedException(){
        super();
    }
    LimitReachedException(String s){
        super(s);
    }
}
public class Userdefinedexception {
        int balance=100000;
        int limit=50000;
        void withdraw(int withdrawamt) throws LimitReachedException{
            if(withdrawamt>limit){
                throw new LimitReachedException("Limit Reached");
            }
            else{
                balance=balance-withdrawamt;
                System.out.println("Withdrawal success");
            }
        }
        public static void main(String[] args) throws LimitReachedException{
            Userdefinedexception u=new Userdefinedexception();
            u.withdraw(70000);
            System.out.println("Thank you");
    }
}
