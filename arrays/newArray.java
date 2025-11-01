package arrays;

public class newArray {
    public static void main(String[] args) {
        int[]a={1,2,3,4,5};
        int[]b=new int[a.length];
        for(int i=0;i<a.length;i++){
            int left=0;
        int right=0;
            if(i-1>=0){
                left=a[i-1];
            }
            if(i+1<a.length){
                right=a[i+1];
            }

            b[i]=left+a[i]+right;
            
        }
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]+" ");
        }
        
    }
}
