public class Encapsulation {
    private int password;
    private String username;
    Encapsulation(int password,String username){
        this.password=password;
        this.username=username;
    }
    public int getpassword() {
        return password;
    }
    public String getusername() {
        return username;
    }
    public void setpassword(int password) {
        this.password=password;
    }
    public void setusername(String username) {
        this.username=username;
    }
    public static void main(String[] args) {
        Encapsulation e=new Encapsulation(123,"user1");
        System.out.println("Password: "+e.getpassword());
        System.out.println("User Name: "+e.getusername());
        e.setpassword(456);
        e.setusername("user2");
        System.out.println("Password: "+e.getpassword());
        System.out.println("User Name: "+e.getusername());
    }
}

