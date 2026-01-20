package m.dev.sortalgorithm;

import java.util.Hashtable;

public class HashTableEx {
    public static void main(String[] args) {
        Hashtable<Integer,String> table=new Hashtable<>(10);
        table.put(100,"Dev");
        table.put(200,"Mar");
        table.put(300,"Lio");
        table.put(400,"Deo");
        //table.put(null,null);
        //table.put(null,null);
        for(Integer key:table.keySet()) {
            System.out.println(key.hashCode()%10);
            System.out.println(key.hashCode() % 10 + "--"+key+"--"+table.get(key));
        }

    }
}
