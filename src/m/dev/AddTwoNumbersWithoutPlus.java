package m.dev;

public class AddTwoNumbersWithoutPlus {
    public static void main(String[] args) {
        int num1 = 576;
        int num2 = 781;
        int sum = add(num1, num2);
        //System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
        System.out.println(addLargeNumbers("89","576"));
    }
    //approach 2

    public static String addLargeNumbers(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        // Ensure num1 is the longer one
        if(num1.length()<=num2.length()) {
            String temp=num1;
            num1=num2;
            num2=temp;
        }
        int carry = 0;
        int n1 = num1.length();
        int n2 = num2.length();
        // Add digits from the end to the beginning
        for (int i = 0; i < n1; i++) {
            int digit1 = num1.charAt(n1 - 1 - i) - '0'; // Convert char to int
            int digit2 = (i < n2) ? (num2.charAt(n2 - 1 - i) - '0') : 0; // If num2 is shorter
            int sum = digit1 + digit2 + carry;
            carry = sum / 10; // Calculate carry for the next digit
            result.append(sum % 10); // Append current digit to the result
        }
        // If there is a carry left
        if (carry > 0) {
            result.append(carry);
        }
        // Reverse the result string
        return result.reverse().toString();
    }
    //approach 1
    private static int add(int a, int b) {
            while (b != 0) {
                // Calculate carry
                int carry = a & b;
                // Sum without carry
                a = a ^ b;
                // Shift carry left
                b = carry << 1;
            }
            return a;
        }
    //}
}
