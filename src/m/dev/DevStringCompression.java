package m.dev;

public class DevStringCompression {
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder();
        String str="aabccccaaa";
        int count=0;
        for(int i=0;i<str.length();i++){
            count++;
            if(i+1>=str.length() || str.charAt(i) !=str.charAt(i+1)){
                stringBuilder.append(str.charAt(i));
                stringBuilder.append(count);
                count=0;
            }

        }
        System.out.println(stringBuilder.toString());
    }
}
