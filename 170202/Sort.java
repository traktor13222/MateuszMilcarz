import java.util.Random;
import java.util.Arrays;
public class Sort{
 int[] losuj(){
    int [] T= new int[10];
    Random rand= new Random();
    for(int i=0; i<10;i++){
        T[i]= rand.nextInt(100-0+1)+0;
    }
    return T;
}

    void wypisz (int[] T){
        Arrays.sort(T);
        for(int j=0;j<T.length;j++){
            System.out.println(T[j]+" ,");
            
        }
    }
    public static void main(String[] args){
        Sort tab=new Sort();
        tab.wypisz(tab.losuj());
}}