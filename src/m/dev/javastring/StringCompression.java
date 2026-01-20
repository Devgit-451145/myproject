package m.dev.javastring;

public class StringCompression {
    public static void main(String[] args) {
        String input = "aaabbccccb";
        String compressed = compressString(input);
        System.out.println("Compressed string: " + compressed);
    }
    private static String compressString(String str) {
        if(str==null || str.isEmpty()) {
            return "";
        }
        StringBuilder compressed = new StringBuilder();
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++; // Increase count if the same character is found
            } else {
                compressed.append(str.charAt(i - 1)); // Append the character
                compressed.append(count); // Append the count
                count = 1; // Reset count for the new character
            }
        }
     // Handle the last character and its count
        compressed.append(str.charAt(str.length() - 1));
        compressed.append(count);
        // Return the compressed string only if it's shorter than the original
        return compressed.length() < str.length() ? compressed.toString() : str;
    }
}
