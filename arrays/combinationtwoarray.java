package arrays;
import java .util.*;
public class combinationtwoarray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        List<Integer>evenlist=new ArrayList<>();
        List<Integer>oddlist=new ArrayList<>();

        for(int number:arr){
            if (number%2==0) {
               evenlist.add(number); 
            }
            else{
                oddlist.add(number);
            }
        }
        List<Integer>comblist=new ArrayList<>();
        comblist.addAll(oddlist);
        comblist.addAll(evenlist);
        System.out.println(comblist);

    }
}
