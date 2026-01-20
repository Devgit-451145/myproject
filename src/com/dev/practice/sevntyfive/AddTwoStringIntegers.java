package com.dev.practice.sevntyfive;

public class AddTwoStringIntegers {
    public static void main(String[] args) {
        System.out.println(sol("456","77"));
    }
    //convert char to integer num.charAt(i)-'0'
    private static String sol(String n1, String n2) {
        int i=n1.length()-1;
        int j=n2.length()-1;    //13%10=3 val  13/10=1 carry
        int carry=0;
        StringBuilder sb=new StringBuilder();
        while(i>=0 || j>=0 || carry!=0){
            int digit1=i>=0 ? n1.charAt(i)-'0': 0;
            int digit2=j>=0 ? n2.charAt(j)-'0': 0;
            int sum=digit1+digit2+carry;
            carry=sum/10;
            sb.append(sum%10);
            i--;
            j--;
        }
        return sb.reverse().toString();
    }
}