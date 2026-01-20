package m.sortalgorthms;

public class BubbleSort {
    public static void main(String[] args) {
        int nums[] ={6,5,2,9,4};
        int size=nums.length;
        int temp=0;
        System.out.println("Before sorting");
        for(int num:nums) {
            System.out.print(num+ " ");
        }
        System.out.println("Before sorting");
        for(int i=0;i<size;i++) {
            for(int j=0;j<size-i-1;j++) {
                if(nums[j]>nums[j+1]) {
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
       for (int n:nums){
           System.out.print(n+ " ");
       }

    }
}
