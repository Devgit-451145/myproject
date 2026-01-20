package m.asked;

import java.util.Arrays;

public class Block2 {
    public static void main(String[] args) {
        int[] nums={2,1,3,0};
        for(int i=0;i<nums.length;i++) {
            int k=nums.length-nums[i];
            for(int j=0;j<nums.length;j++) {
                if(j<=k) {
                    System.out.println(".");
                } else{
                    System.out.println("|");
                }
            }
            //System.out.print("-");

        }

    }
}
