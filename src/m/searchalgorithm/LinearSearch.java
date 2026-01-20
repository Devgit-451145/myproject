package m.searchalgorithm;

public class LinearSearch {
    public static void main(String[] args) {
        int [] nums={3,2,4,9,1,6};
        int target=9;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==target) {
                System.out.println("found at index::"+i);
                break;
            }
        }
    }
}
