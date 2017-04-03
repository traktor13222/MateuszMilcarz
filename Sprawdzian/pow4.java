import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
public class pow4{
     public static void main(String[] args)throws FileNotFoundException{
         File file=new File("cyfry.txt");
        Scanner in=new Scanner(file);
        PrintWriter liczbysys = new PrintWriter("powt.txt");
        String a;
        int b=0;
        while(in.hasNextLine()){
            a=in.nextLine();
            for(int i=1; i<a.length()-1 ;i++){
                if(a.charAt(i)>a.charAt(i+1))
                b=b+1;
                else ;
            }
            if(b==a.length()){
            liczbysys.println("d) "+a);
     liczbysys.close();
    System.out.println(a);
            }
            else ;
        }
     }
}