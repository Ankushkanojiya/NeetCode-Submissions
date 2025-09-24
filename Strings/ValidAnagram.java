package Strings;

public class ValidAnagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("abcbc", "cbacb"));
    }
    public static boolean isAnagram(String s, String t){
        if(s.length()!=t.length()) return false;

        int count[]=new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for (int counting : count) {
            if (counting !=0 ) {
                return false;
            }
        }
        return true;
    }

}
