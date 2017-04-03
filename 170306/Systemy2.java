public class Systemy2{
    double BinToDec(int n){
        String a,b="";
        double c=0,d,e;
      a=Integer.toString(n);
      for(int i=a.length()-1; i>=0; i--){
           b=b+a.charAt(i);
      }
      Integer.parseInt(b);
     for(int j=0;j<=b.length()-1;j++){
         d=Math.pow(2,j);
         e=b.charAt(j);
         c=c+(d*e);
     }
           return c;
    }
    public static void main(String[] args){
        Systemy2 funkcje=new Systemy2();
        System.out.println(funkcje.BinToDec(1010));
    }
}
   
  
    