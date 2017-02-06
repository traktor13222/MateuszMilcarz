public class BMI2{
    public static void main(String[] args){
        if(args.length >1){
            do{
        double a;
        a=Double.parseDouble(args[0])/(Double.parseDouble(args[1])*Double.parseDouble(args[1])) ;
       if(a<18.5){
        System.out.println("Twoje BMI wynosi: "+a+" Masz niedowage");
        }else if(a>24.9){
        System.out.println("Twoje BMI wynosi: "+a+" Masz nadwage");
        }else
        {
        System.out.println("Twoje BMI wynosi: "+a+" Waga prawidłowa");}
            }while(args.length =0);
        }else{
        System.out.println("Brak danych");
        }
    }
}