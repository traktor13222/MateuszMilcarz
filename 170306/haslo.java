import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
public class haslo{
     public static void main(String[] args)throws FileNotFoundException{
         File file=new File("hasla.txt");
        Scanner in=new Scanner(file);
        int c=0,b=0;
        while(in.hasNextLine()){
         String a=in.nextLine();
         if(a.length()%2==0)
         c=c+1;
         else
      b=b+1;
            
        }
      System.out.println("liczb parzystych jest "+c);
      System.out.println("liczb nieparzystych jest "+b);
     }
}