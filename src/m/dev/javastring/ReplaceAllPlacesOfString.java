package m.dev.javastring;

public class ReplaceAllPlacesOfString {
    public static void main(String[] args) {
        String s=replaceWith("mr john smith    ",13);
        System.out.println(s);
    }
    private static String replaceWith(String st, int count) {
        char [] chars=st.toCharArray();
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0;i<count;i++) {
            if(chars[i]==' ') {
                stringBuilder.append("%20");
            } else {
                stringBuilder.append(chars[i]);
            }
        }
        return stringBuilder.toString();
    }
}
