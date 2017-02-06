public class iloczyn{
    public static void main(String[] args){
           double a=1;
          if(args.length !=0)
          {
              for(int i=0;i<args.length;i++)
              {
              a=a*Double.parseDouble(args[i]);
              }
              System.out.println(a);
              
          }else
          System.out.println("brak danych");
        
    }
}