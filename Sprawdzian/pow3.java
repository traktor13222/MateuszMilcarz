import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
public class pow3{
      String DecToBin(int n){
       String tekst="";
       while(n>0){
           tekst=tekst+(n%2);
           n=n/2;
       }
       String a="";
       for(int i=tekst.length()-1; i>=0; i--)
           a=a+tekst.charAt(i);
       return a;
      }
     public static void main(String[] args)throws FileNotFoundException{
         pow3 funkcje=new pow3();
         PrintWriter liczbysys = new PrintWriter("powt.txt");
          File file=new File("cyfry.txt");
        Scanner in=new Scanner(file);
        int x;
        while(in.hasNextLine()){
            x=in.nextInt();
            if(x<10000){
                liczbysys.println("c) "+ x +" " + funkcje.DecToBin(x) );
      
            System.out.println(funkcje.DecToBin(x));
            }else ;
        }
        liczbysys.close();
     }
}
