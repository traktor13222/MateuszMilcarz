import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
public class pow2{
     public static void main(String[] args)throws FileNotFoundException{
          File file=new File("cyfry.txt");
        Scanner in=new Scanner(file);
        int a,b=0;
        while(in.hasNextLine()){
            a=in.nextInt();
            if(a>b)
            b=a;
            else ;
     }
     PrintWriter liczbysys = new PrintWriter("powt.txt");
        liczbysys.println("b) "+b);
      liczbysys.close();
    }
}