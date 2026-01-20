package m.dev.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1900);
        list.add(19100);
        list.add(12900);
        list.add(18900);

        Long ss=list.stream().filter((Integer val) -> val>1900).count();
        System.out.println(ss);

        Integer[] integers={123,345,3333};
        Stream integerStream= (Stream) Arrays.stream(integers);






    }
}
