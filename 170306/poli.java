import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
public class poli{
     public static void main(String[] args)throws FileNotFoundException{
         File file=new File("hasla.txt");
        Scanner in=new Scanner(file);
        int c=0,d=0;
        while(in.hasNextLine()){
        String a=in.nextLine(),b="";
        for(int i=a.length()-1; i>=0; i--){
           // String b="";
            b=b+a.charAt(i);
        }
        for(int j=a.length()-1; j>=0; j--){
            if(a.charAt(j) == b.charAt(j))
            c=c+1;
            else ;
        }
        if(c==a.length())
        d=d+1;
        else ;
        System.out.println(d);
        }
        System.out.println(d);
     }
}
