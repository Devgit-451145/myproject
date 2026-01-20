package m.dev;

public class DevLargeNumberSum {
    public static void main(String[] args) {
        String s1="4676";
        String s2="2131";
        String result=addNumbers(s1,s2);
        System.out.println(result);
    }
    private static String addNumbers(String s1, String s2) {
        StringBuilder stringBuilder=new StringBuilder();
        int i= s1.length()-1;
        int j= s2.length()-1;
        int carry=0;
        while(i>=0 || j>=0 || carry!=0) {
            //System.out.println(s1.charAt(i--) - '0');
            int digit1= i>=0 ? s1.charAt(i--) - '0' : 0;// Convert char to int
            int digit2= j>=0 ? s2.charAt(j--) - '0' : 0;
            int sum=digit1+digit2+carry;
            carry =sum/10;
            stringBuilder.append(sum%10);
        }
        return stringBuilder.reverse().toString();
    }
}
