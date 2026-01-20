package m.dev;

public class SwaoCapSmallLetter {
    public static void main(String[] args) {
        String str="HeLLo D";
        StringBuilder builder=new StringBuilder();
        char [] ch=str.toCharArray();
        for(char chr:ch) {
            if(Character.isUpperCase(chr)) {
                builder.append(Character.toLowerCase(chr));
            } else {
                builder.append(Character.toUpperCase(chr));
            }
        }
        System.out.println(builder.toString());

    }
}
