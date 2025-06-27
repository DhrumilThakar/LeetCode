/* Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".*/
public class problem14 {
    public static String longestCommonPrefix(String[] arr)
    {
        if(arr.length==0 || arr==null)
        {
            return"";
        }
        String prefix =arr[0];
        for(int i=1;i<arr.length;i++)
        {
            while(arr[i].indexOf(prefix)!=0)
            {
                prefix = prefix.substring(0,prefix.length()-1);
            }
            if(prefix.isEmpty())
            {
                return "";
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println("Longest common prefix: " + longestCommonPrefix(strs)); // Output: "fl"
    }
}
