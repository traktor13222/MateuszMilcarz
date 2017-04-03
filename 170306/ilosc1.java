public class ilosc1{
    int a(int s){
        int b=0;
        while(s>0){
            if(s%2==1)
            b=b+1;
            else ;
        }
        return b;
    }
     public static void main(String[] args){
         ilosc1 funkcje=new ilosc1();
         System.out.println(funkcje.a(3600));
     }
     
}