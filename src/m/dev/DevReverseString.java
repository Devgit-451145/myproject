package m.dev;

public class DevReverseString {
    public static void main(String[] args) {
        String revStr=reverse("dev");
    }

    private static String reverse(String dev) {
        int l=dev.length();
        for(int i=l-1;i>=0;i--){
            System.out.print(i);
            System.out.print(dev.charAt(i));
        }
        return null;
    }

}
