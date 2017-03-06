import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class cyfry{
    public static void main(String[] args)throws FileNotFoundException{
        File file=new File("cyfry.txt");
        Scanner in=new Scanner(file);
        int a,b=0;
        while(in.hasNextLine()){
            a=in.nextInt();
            for(int i=0;i<Integer.parseInt(a).length;i++){
               b=b+a/10;
               System.out.println(b);
            }
        }
    }
}