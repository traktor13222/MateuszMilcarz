import java.util.Random;
public class Gra{
    public static void main(String[] args){
        if(args.length>1){
        System.out.println("za dużo danych");
        }else
        {
            if(Double.parseDouble(args[0])>1){
                System.out.println("Poza zakresem");
            }else
            {
        int a;
        Random rand= new Random();
        a= rand.nextInt(2)+0;
        if(Double.parseDouble(args[0])==a){
            System.out.println("Wygrałeś!!!!!!");
        }else
        {
            System.out.println("Przegrałeś :((");
        }
            }
        }
        }
    }
