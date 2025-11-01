package arrays;

import java.util.Arrays;

public class splitString {
    public static void main(String[] args) {
        String sent="The quick brown fox jumps over the lazy dog.";
        String word="JUMPS";

        String []words=sent.split(" ");
        System.out.println("original words"+Arrays.toString(words));

        for(int i=0;i<words.length;i++){
            
            String mod=words[i].toUpperCase();
            

            if(mod.equals(word)){
                System.out.println("Found the target word"+word+"at inddex "+i+" ");
            }
        }
  
    }
}
