package m.dev.freshstart.twosum;

public class hh {
    public static void main(String[] args) {
        String s="dev marru";
        String ss[] =s.split(" ");

        int k = ss.length - 1;
        StringBuffer buffer=new StringBuffer();
        for(int i=ss.length-1;i>=0;i--) {
         buffer.append(ss[i]+" ");
        }
        System.out.println(buffer.toString());

    }
}
