/*Given an integer, convert it to a Roman numeral.*/

public class problem12 
{
    public static String intToRoman(int num)
    {
        int[] values = {100,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] symbol = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder number = new StringBuilder(); // Here We use StringBuilder because we have to do concatenation and it is more efficient than String
        for(int i =0;i<values.length && num>0;i++)
        {
            while(num>=values[i])
            {
                num = num-values[i];
                number.append(symbol[i]);
            }
        }
        return number.toString();
    }

    public static void main(String[] args) {
        int num = 58; // Example input
        String result = intToRoman(num);
        System.out.println("The Roman numeral for" + num + " is: " + result);
    }
}
