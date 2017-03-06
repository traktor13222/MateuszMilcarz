import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class paryliczb{
    int NWD(int a, int b){
        while(a!=b){
            if(a>b) a=a-b;
            else b=b-a;
        }
        return a;
    }
    int suma(int n){
        int s=0;
        while(n>0){
            s=s+n%10;
            n=n/10;
        }
        return s;
    }
    public static void main(String[] args)throws FileNotFoundException{
        File file=new File("PARY_LICZB.TXT");
        Scanner in=new Scanner(file);
        int liczba1,liczba2;
    
        paryliczb h= new paryliczb();
       
        //System.out.println(h.NWD(25,10));
        //System.out.println(h.suma(234));
        //while(in.hasNextLine()){
            //liczba1=in.nextInt();
           // liczba2=in.nextInt();
           // System.out.println("1|"+liczba1+" "+"2|"+liczba2);
        //}
        while(in.hasNextLine()){
            liczba1=in.nextInt();
            if(liczba1%2==0)
            System.out.println(liczba1);
            else   ;
        }
    }
}