import java.util.*;
import java.io.*;
public class FileHand {
    public static void main(String[] args) throws IOException{
        File f=new File("C:\\Users\\nandhinisabarathinam\\Desktop\\Batch");
        //create folder with this name
        f.mkdir();
        File f1=new File("C:\\Users\\nandhinisabarathinam\\Desktop\\Batch\\Folder1\\Folder2");
        f1.mkdirs();
        //create file
        File f2=new File("C:\\Users\\nandhinisabarathinam\\Desktop\\Batch\\File.txt");
        f2.createNewFile();
        File f3=new File("C:\\Users\\nandhinisabarathinam\\Desktop\\Batch\\File1.pdf");
        f3.createNewFile();
        File f4=new File("C:\\Users\\nandhinisabarathinam\\Desktop\\Batch\\File3.doc");
        f4.createNewFile();
        //write file
        FileWriter fw=new FileWriter(f2);
        fw.write("Java program");
        //should close file
        fw.close();
        //file read scanner or filereader
        FileReader fr=new FileReader(f2);
        int a;
        while((a=fr.read())!=-1){
            char b=(char)a;
            System.out.print(b);
        }
        System.out.println();
        Scanner sc=new Scanner(f2);
        while(sc.hasNext()){
            System.out.println(sc.next());
        }
        //file exists
        System.out.println(f2.exists());
        //get file name
        System.out.println(f2.getName());
        System.out.println(f2.getAbsolutePath());
        System.out.println(f2.canExecute());
        System.out.println(f2.canWrite());
        System.out.println(f2.canRead());
        //only deletes when file is empty
        f2.delete();
    }
}
