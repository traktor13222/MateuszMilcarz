public class Systemy{
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
    
    
    
    
    
    public static void main(String[] args){
        Systemy funkcje=new Systemy();
        System.out.println(funkcje.DecToBin(12345));
    }
    }
    