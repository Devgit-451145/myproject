package m.dev;

import java.util.ArrayList;
import java.util.List;

public class FindMissingElement {
    public static void main(String[] args) {
        int[] kk={2,1,5,4};
        int k=findMiss(kk);
        System.out.println(k);
    }
    private static int findMiss(int[] kk) {
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=kk.length;i++){
            list.add(i);
        }
        for(int i=0;i<kk.length;i++){
            list.remove((Integer)kk[i]);
        }
       return list.get(0);

    }
}
