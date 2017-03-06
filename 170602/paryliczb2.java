import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class paryliczb2{
    public static void main(String[] args)throws FileNotFoundException{
        File file=new File("PARY_LICZB.TXT");
        Scanner in=new Scanner(file);
        int liczba1,liczba2;
        while(in.hasNextLine()){
        liczba1=in.nextInt();
        liczba2=in.nextInt();
        if(liczba1%liczba2==0)
        System.out.println(liczba1+" "+liczba2);
        else ;
        }
        
        
    }
}
    