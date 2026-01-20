package m.dev.javastring;

import java.util.Arrays;
public class StringSort {
    public static void main(String[] args) {
        sort("rock");
    }
    private static void sort(String str) {
        //approach 1 -without sort method
        //approach 2
        char [] ss=str.toCharArray();
        Arrays.sort(ss);
        System.out.println(new String(ss));
        //approach 1
        char temp;
        char [] arr=str.toCharArray();
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]>arr[j]) {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(new String(arr));
    }
}
