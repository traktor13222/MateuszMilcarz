import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
public class Zad4b{
    public static void main(String[] args)throws FileNotFoundException{
        File file=new File("napisy.txt");
        Scanner in=new Scanner(file);
        int d=0,b=0,c=0;
        while(in.hasNextLine()){
            String a=in.nextLine();
            for(int i=a.length()-1; i>=0;i--){
                if(a.charAt(i)==1)
                d=d+1;
                else b=b+1;
            }
            if(d==b)
            c=c+1;
            else ;
            
        }
        System.out.println(c);
    }
}