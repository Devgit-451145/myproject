package m.dev;

public class DevSmallCapsCount {
    public static void main(String[] args) {
        String input="aAbBcCdd";
        int count=countChar(input);
        System.out.println(count);

    }
    private static int countChar(String str) {
        int count=0;
        for(int i=0;i<str.length()-1;i++){
            char first=str.charAt(i);
            char second=str.charAt(i+1);
            if(Character.isLowerCase(first) && Character.toUpperCase(first) == second) {
                count++;

            }
        }

        return count;

    }
}
