package m.dev;

public class DevNumletterCount {
    public static void main(String[] args) {
        int letters=0;
        int numbers=0;
        String ss="de34r28u91";
        char [] cc=ss.toCharArray();
        for(char ch: cc) {
            if(Character.isDigit(ch)) {
                numbers++;
            }
            if(Character.isLetter(ch)) {
                letters++;
            }
        }
        System.out.println("letters:"+letters+"numbers:"+numbers);
    }
}
