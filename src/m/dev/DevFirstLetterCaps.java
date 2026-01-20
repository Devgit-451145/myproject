package m.dev;

public class DevFirstLetterCaps {
    public static void main(String[] args) {
        String st="hello world";
        String s1="hello";
        System.out.println(s1.substring(3));
        System.out.println(s1.substring(0,2));
        String [] stt=st.split(" ");
        StringBuilder result=new StringBuilder();
        for (String word : stt) {
            if (word.length() > 0) {
                // Capitalize the first letter and append the rest of the word
                result.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1))
                        .append(" ");
            }
        }
        System.out.println(result.toString().trim());
    }


}
