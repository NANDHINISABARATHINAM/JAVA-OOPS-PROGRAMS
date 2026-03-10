import java.util.Arrays;
public class Stringmethods {
    public static void main(String[] args) {
        String s="Java";
        String s1=new String("Program");
        String s3=new String("Java");
        String s4=new String("java");
        System.out.println(s);
        System.out.println(s1);

        //char to string
        char a[]={'a','b','c'};
        String s2=new String(a);
        System.out.println(s2);

        //string length
        System.out.println(s.length());

        //char at in string
        System.out.println(s.charAt(2));
        char c=s.charAt(0);
        System.out.println(c);

        //== ref and value
        System.out.println(s==s3);

        //equals value
        System.out.println(s.equals(s3));

        //ignores case
        System.out.println(s3.equals(s4));
        System.out.println(s3.equalsIgnoreCase(s4));

        //concat
        System.out.println(s.concat(s1));
        System.out.println(s);
        s=s.concat(s1);
        System.out.println(s);

        //upper case
        System.out.println(s.toUpperCase());
        //lower case
        System.out.println(s.toLowerCase());

        //starts with?
        System.out.println(s.startsWith("Java"));
        //ends with?
        System.out.println(s.endsWith("Program"));

        //change chars or replace
        String s5="Java is a prog lang Java";
        System.out.println(s5.replace("Java","JAVA"));
        System.out.println(s5.replace('a','A'));

        //index of char,string
        System.out.println(s5.indexOf('a'));
        System.out.println(s5.indexOf("prog"));

        //index of char,string from position
        System.out.println(s5.indexOf('a',2));
        System.out.println(s5.indexOf('a',4));
        //last index of char,string from back
        System.out.println(s5.lastIndexOf('a'));
        System.out.println(s5.length());

        //last index of char,string from back
        System.out.println(s5.lastIndexOf('a',22));

        //word is there or not
        System.out.println(s5.contains("prog"));

        //string to char array
        char arr[]=s.toCharArray();

        //print array to string
        System.out.println(Arrays.toString(arr));

        //split method
        String arr1[]=s5.split(" ");
        System.out.println(Arrays.toString(arr1));
        String arr2[]=s5.split("a");
        System.out.println(Arrays.toString(arr2));
        String arr3[]=s5.split("is");
        System.out.println(Arrays.toString(arr3));

        //repeat
        System.out.println(s1.repeat(3));

        //compare to equal or not = 0  != +-values comparable interface
        String d="hey";
        String d1="hey";
        System.out.println(d.compareTo(d1));

        //compare to ignore case
        String d2="Hey";
        System.out.println(d.compareTo(d2));
        System.out.println(d.compareToIgnoreCase(d2));
        String aa="";
        String b=" ";

        //is empty is blank
        System.out.println(aa.isEmpty());
        System.out.println(aa.isBlank());
        System.out.println(b.isEmpty());
        System.out.println(b.isBlank());
        String k="hi";
        String k1=new String("hi");
        System.out.println(k==k1);

        //string object to string
        k1=k1.intern();
        System.out.println(k==k1);

        //print substring
        System.out.println(s5.substring(5));
        System.out.println(s5.substring(5,12));

        //trim space
        String f=" space ";
        System.out.println(f.length());
        System.out.println(f.trim());
        System.out.println(s5.trim());    }
}
