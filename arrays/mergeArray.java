package arrays;

import java.util.Arrays;

public class mergeArray {
    public static int[] merged(int[] arr1,int []arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int []mergedArr=new int[arr1.length+arr2.length];
        int i=0,j=0,k=0;
        while(i<arr1.length&&j<arr2.length){
            if(arr1[i]<=arr2[j]){
                mergedArr[k++]=arr1[i++];
            }
            else{
                mergedArr[k++]=arr2[j++];
            }
        }
        //adding remaining elements
        while(i<arr1.length){
            mergedArr[k++]=arr1[i++];
        }
        while(j<arr2.length){
            mergedArr[k++]=arr2[j++];
        }
        return mergedArr;

    }
    public static void main(String[] args) {
        int arr1[]={3,1,5,7,10};
        int arr2[]={2,4,6,8};
        int[]arr=merged(arr1, arr2);
        System.out.println("merged sorted array"+Arrays.toString(arr));
    }
}
