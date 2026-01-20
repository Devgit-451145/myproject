package m.asked;

public class Block1 {
    public static void main(String[] args) {
        int[] nums={2,1,0,2,2,4,6};
        for(int i=0;i<nums.length;i++) {
            int k=0;
            while(k<nums[i]) {
                System.out.print("|");
                k++;
            }

            //for(int k=0;k<nums[i];k++) {
                //System.out.print("|");
            //}
            System.out.println();
        }
    }
}
