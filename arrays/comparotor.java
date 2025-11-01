package arrays;


import java.util.Arrays;
import java.util.Comparator;
public class comparotor{
    public static void main(String[] args) {
        String[] strings={"apple","banana","kiwi","orange"};
        System.out.println("original array "+ Arrays.toString(strings));
        Arrays.sort(strings,new StringLengthComparator());
        System.out.println("Sorted Array "+Arrays.toString(strings));
    }


}
class StringLengthComparator implements Comparator <String>{
    public int compare(String s1,String s2){
        return Integer.compare(s1.length(), s2.length());
    }
}
