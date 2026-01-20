package m.dev.string;

public class LongestCommonPrefixInStringArray {
    public static void main(String[] args) {
        String [] values={"flower","flow","flight"};
        String s=longestCommonPrefix(values);
        System.out.println(s);
    }
    private static String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0) return "";
        //start with the first string in the array as the initial prefix
        String prefix=strs[0];
        //compare current prefix with each string in the array
        for(int i=1;i<strs.length;i++) {
            //System.out.println(strs[i]);
           // narrow down the prefix with each comparism
            while(strs[i].indexOf(prefix)!=0) {
                //shorten the prefix by one character from the end
                //System.out.println("1---"+prefix);
                prefix=prefix.substring(0,prefix.length()-1);
                //System.out.println("2---"+prefix);
                //if ther is no common prefix
                if(prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}
