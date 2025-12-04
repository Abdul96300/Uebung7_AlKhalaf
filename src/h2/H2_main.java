package h2;
import java.util.Arrays;


public class H2_main {
    public static void main(String[] args) {
        int end = 2;
        int start = 3;
        int[] a = {2,7,1,9};
        int[] b = {2,7,1,9};
        
        //System.out.println(Arrays.compare(a,b));
        change(a,b,start,end);
        
        
        //System.out.println(Arrays.toString(a));
        //change(a,b,start,end);
    }

    public static int[] change (int[] a, int [] b, int start, int end ){
        if(end > start && Arrays.compare(a,b) != 0){
            int erst [] = Arrays.copyOf(a, a.length);
            //System.out.println(Arrays.toString(erst));
            return erst;   
        }
        if ( end > start && Arrays.compare(a,b) == 0){
            Arrays.sort(a);
            int zweit [] = Arrays.copyOfRange(a,start,end);
            //System.out.println(Arrays.toString(zweit));
            return zweit;
        }
        if ( end <= start){
            int  dritte [] = new int[0];
            //System.out.println(Arrays.toString(dritte));
            return dritte;
        }
        

        return a;
    }
}
