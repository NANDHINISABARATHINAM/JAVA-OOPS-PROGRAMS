import java.util.Arrays;

public class Stringbuffer {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("java");
        sb.append(" program");
        System.out.println(sb);
        System.out.println(sb.length());
        sb=new StringBuffer("welcomme");
        System.out.println(sb);
        System.out.println(sb.length());

        //delete chat at
        sb.deleteCharAt(6);
        System.out.println(sb);

        //delete sequence of char
        sb.delete(0,6);
        System.out.println(sb);

        //insert
        sb.insert(0,"hi ");
        System.out.println(sb);

        //replace
        sb.replace(3,4,"hello");
        System.out.println(sb);

        //reverse
        sb.reverse();
        System.out.println(sb);

        //string buffer to string
        String s[]=sb.toString().split(" ");
        System.out.println(Arrays.toString(s));

        //capacity
        StringBuffer sb1=new StringBuffer();
        System.out.println(sb1.capacity());
        StringBuffer sb2=new StringBuffer("java");
        System.out.println(sb2.capacity());

    }
}

