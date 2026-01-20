package m.dev;

import java.math.BigDecimal;

public class SumLargeDecimals {
    public static void main(String[] args) {
        String num1 = "123456789012345678901234567890.12345678901234567890";
        String num2 = "98765432109876543210987654321.98765432109876543210";
        BigDecimal result = sumLargeDecimals(num1, num2);
        System.out.println("Sum: " + result);
    }
    //approach 1
    public static BigDecimal sumLargeDecimals(String num1, String num2) {
        BigDecimal decimal1 = new BigDecimal(num1);
        BigDecimal decimal2 = new BigDecimal(num2);
        return decimal1.add(decimal2);
    }
}
