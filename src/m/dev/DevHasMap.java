package m.dev;

import java.util.HashMap;
import java.util.HashSet;

public class DevHasMap {
    public static void main(String[] args) {
        HashMap<String,String> hashMap=new HashMap<>();
        hashMap.put(null,"dev");
        hashMap.put("sa1",null);
        hashMap.put("sa1",null);
        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("dev");
        hashSet.add(null);
        hashSet.add(null);
        System.out.println("---"+hashSet);
        System.out.println(hashMap);

        String s1="abc";
        String s2=new String("abc");
        String s3=s2;
        System.out.println(s3);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        String sn=null;
        String sw=null;
       // System.out.println(sw.equals(sn));




    }
}
