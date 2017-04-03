import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
public class liczbysys{
     public static void main(String[] args)throws FileNotFoundException{
         File file=new File("liczby0.txt");
        Scanner in=new Scanner(file);
        int a,b=0,c=0;
        while(in.hasNextLine()){
         a=in.nextInt();
         while(a>0){
             b=b+(a%10);
             a=a/10;
         }
         if(b>c)
         c=b;
         else ;
         b=0;
        }
        PrintWriter liczbysys = new PrintWriter("Wynik.txt");
        liczbysys.println(c);
      liczbysys.close();
     }
}