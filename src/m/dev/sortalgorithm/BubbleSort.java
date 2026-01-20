package m.dev.sortalgorithm;

public class BubbleSort {
    //elements are compared and the elements swapped if they are not in order
    //small data set ok
    //large dat set bad
    //O(N^2)
    public static void main(String[] args) {
        int [] array={6,3,4,2,1,9};
        sort(array);
        for(int i:array) {
            System.out.print(i+" ");
        }
    }
    private static void sort(int[] array) {
        for(int i=0;i<array.length-1;i++) {
            for(int j=0;j<array.length-i-1;j++) {
                //asc >  desc <
                if(array[j]>array[j+1]) {
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
}
