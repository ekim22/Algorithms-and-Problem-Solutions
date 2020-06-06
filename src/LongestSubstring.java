public class LongestSubstring {

    public static void printLongestSubstring(String s) {
        String temp;
        String longestSub = "";
        int length = 1;
        int longestLength = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            temp = String.valueOf(s.charAt(i));
            for (int j = i + 1; j < s.length(); j++) {
                if (longestSub.contains(String.valueOf(s.charAt(j)))) {
                    break;
                }
                if (!(temp.contains(String.valueOf(s.charAt(j))))) {
                    temp = s.substring(i, j + 1);
                    length = temp.length();
                }
                if (length > longestLength){
                    longestSub = temp;
                    longestLength = length;
                }
            }
        }
        System.out.println(longestSub);
        System.out.println(longestLength);
    }

    public static void main(String[] args) {
        String word = "abcabcbb";
        printLongestSubstring(word);
    }

}