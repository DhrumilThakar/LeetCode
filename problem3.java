/*Given a string s, find the length of the longest substring without duplicate characters.*/
import java.util.*;
public class problem3{
    public static int lengthOfLongestSubstring(String s){
        int left = 0;
        int maxLength = 0;

        Set<Character> seen = new HashSet<>();
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            while(seen.contains(c)){
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(c);

            maxLength = Math.max(maxLength,i-left+1);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}