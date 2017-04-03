import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
public class Zad4{
    public static void main(String[] args)throws FileNotFoundException{
        File file=new File("napisy.txt");
        Scanner in=new Scanner(file);
        int a=0;
        String b;
        while(in.hasNextLine()){
            b=in.nextLine();
            if(b.length()%2==0)
            a=a+1;
            else ;
            
        }
        PrintWriter liczbysys = new PrintWriter("Zadanie4.txt");
        liczbysys.println("a) "+a);
      liczbysys.close();
    }
}