import java.util.Random;
public class Losowanie{
    public static void main(String[] args){
        int a;
        if(Double.parseDouble(args[0])>Double.parseDouble(args[1])){
            System.out.println("Podaj liczy od mniejszej do większej");
        }else{
        if(args.length>2){
            System.out.println("Błąd danych");
        }else{
            Random rand= new Random();
            a=rand.nextInt(Integer.parseInt(args[1])- Integer.parseInt(args[0])+Integer.parseInt(args[0]));
            System.out.println(a);
            
        }
        }
    }
}