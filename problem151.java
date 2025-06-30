/*Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.*/
public class problem151 
{
    public static String reverseWords(String s)
    {
        String[] words = s.trim().split("\\s+");

        StringBuilder reverse = new StringBuilder();
        for(int i = words.length-1;i>=0;i--)
        {
            reverse.append(words[i]);
            if(i>0)
            {
                reverse.append(" ");
            }
        }
        return reverse.toString();
    }
    public static void main(String[] args) {
        String s = "  Hello World!  This is a test.  "; // Example input
        String result = reverseWords(s);
        System.out.println("Reversed words: '" + result + "'");
    }
}