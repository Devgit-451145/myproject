package m.dev.datastructure;

import java.util.Hashtable;

public class HashTableEx {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht=new Hashtable<>(5);
        ht.put(1,"dev");
        ht.put(2,"dev1");
        ht.put(3,"dev2");
        for(Integer i: ht.keySet()) {
            System.out.println(i.hashCode()% ht.size()+"--"+i+"--"+ht.get(i));
        }

        Hashtable<String,String> ht1=new Hashtable<>(5);
        ht1.put("1","dev");
        ht1.put("2","dev1");
        ht1.put("3","dev2");
        for(String j: ht1.keySet()) {
            System.out.println(j.hashCode()% ht1.size()+"--"+j+"--"+ht1.get(j));
        }
    }

}
