/*Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.*/
import java.util.*;
public class problem205 {
    public static boolean isIsomorphic(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        Map<Character, Character> mapS = new HashMap<>();
        Map<Character, Character> mapT = new HashMap<>();

        for(int i =0; i<s.length();i++){
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            if(mapS.containsKey(ct)){
            if(mapS.get(cs)!= ct){
                return false;
            }
            else{
                mapS.put(cs,ct);
            }
        }

            if(mapT.containsKey(cs)){
                if(mapT.get(ct)!=cs){
                    return false;
                }
                else{
                    mapT.put(ct,cs);
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphic(s, t));
    }
}
