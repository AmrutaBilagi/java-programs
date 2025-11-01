package arrays;

public class counteven{
    public static void main(String[] args){
        int i;
        int[]arr={2,4,5,7,8};
        for(i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]);
            }
        }
    }

}