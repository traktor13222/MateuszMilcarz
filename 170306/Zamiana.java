import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
public class Zamiana{
     public static void main(String[] args)throws FileNotFoundException{
         PrintWriter Zamiana = new PrintWriter("Wynik.txt");
         File file=new File("liczby0.txt");
        Scanner in=new Scanner(file);
        int a;
        String b="",c="";
        while(in.hasNextLine()){
            a=in.nextInt();
            while(a>0){
                b=b+(a%4);
                a=a/4;
            }
            for(int i=b.length()-1; i>=0; i--)
           c=c+b.charAt(i);
            Zamiana.println(c);
            c="";
            b="";
        }
        Zamiana.close();
     }
}