/*A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.*/
public class problem125 {
    public static boolean isPalindrome(String s){
        StringBuilder sb = new StringBuilder();
        
        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }
        int i = 0;
        int j = sb.length()-1;
        while(i<j){
            if(sb.charAt(i) != sb.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s)); // Output: true
    }
    
}