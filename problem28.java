/*Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack. */

public class problem28 {

    public static int strStr(String haystack,String needle)
    {
        for(int i=0;i<(haystack.length() - needle.length());i++)
        {
            int j;
            for(j=0;j<needle.length();j++)
            {
                if(haystack.charAt(i+j)!=needle.charAt(j))
                {
                    break;
                }
            }
            if(j==needle.length())
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) 
    {
        String haystack = "hello";
        String needle = "ll";
        System.out.println("Index of first occurrence: " + strStr(haystack, needle)); // Output: 2   
    }
}
