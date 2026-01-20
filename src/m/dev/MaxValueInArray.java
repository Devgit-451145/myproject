package m.dev;

public class MaxValueInArray {
    public static void main(String[] args) {
        int [] numbers={10,30,5,55,20};
        int maxValue=findMax(numbers);
        System.out.println(maxValue);
    }
    private static int findMax(int[] numbers) {
        if(numbers==null || numbers.length==0) {
            return 0;
        }
        int max=numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(numbers[i]>max){
                max=numbers[i];
            }
        }
        return max;
    }
}
