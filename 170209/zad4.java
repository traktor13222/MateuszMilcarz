import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
public class wczytywanie{
    int licz(){
        File file=new File("cyfry.txt");
        Scanner in=new Scanner(file);
        for(int i=0;i<A.length;i++){
        
        }
        }
    }
    public static void main(String[] args) throws FileNotFoundException{
         //File file=new File("cyfry.txt");
       // Scanner in=new Scanner(file);
        while(in.hasNextLine()){
            String text=in.nextLine();
            if(Integer.parseInt(text)%2==0){
            System.out.println(text);
            }
        }
    }
}