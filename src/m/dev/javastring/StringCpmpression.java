package m.dev.javastring;

public class StringCpmpression {
    public static void main(String[] args) {
        String str=getCompressedString("aabcccccaaa");
        System.out.println(str);
    }
    private static String getCompressedString(String str) {
        StringBuilder builder=new StringBuilder();
        int count=0;
        for(int i=0;i<str.length();i++) {
            count++;
            if(i+1>=str.length() || str.charAt(i)!= str.charAt(i+1)) {
                builder.append(str.charAt(i));
                builder.append(count);
                count=0;
            }
        }
        return builder.toString();
    }
}