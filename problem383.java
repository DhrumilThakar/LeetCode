/*Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
Each letter in magazine can only be used once in ransomNote.*/

import java.util.*;

public class problem383 {
    public static boolean canConstruct(String s, String y){
        Map<Character,Integer> map = new HashMap<>();

        for(char c : y.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(char c: s.toCharArray()){
            if(!map.containsKey(c) || map.get(c)==0){
                return false;
            }
            map.put(c,map.get(c)-1);
        }
        return true;
    }
    public static void main(String[] args) {
        String ransomNote = "a";
        String magazine = "b";
        System.out.println(canConstruct(ransomNote, magazine)); // Output: false
    }
}
