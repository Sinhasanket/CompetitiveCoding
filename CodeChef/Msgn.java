package Codechef;

import java.util.Scanner;

public class Msgn {
    static int val(char c)
    {
        if (c >= '0' && c <= '9')
            return (int)c - '0';
        else
            return (int)c - 'A' + 10;
    }

    // Function to convert a
// number from given base
// 'b' to decimal
    static int toDeci(String str,
                      int base)
    {
        int len = str.length();
        int power = 1; // Initialize
        // power of base
        int num = 0; // Initialize result
        int i;

        // Decimal equivalent is
        // str[len-1]*1 + str[len-1] *
        // base + str[len-1]*(base^2) + ...
        for (i = len - 1; i >= 0; i--)
        {
            // A digit in input number
            // must be less than
            // number's base
            if (val(str.charAt(i)) >= base)
            {
                System.out.println("Invalid Number");
                return -1;
            }

            num += val(str.charAt(i)) * power;
            power = power * base;
        }

        return num;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        String st = sc.next();
        int ans =0;
        int redBase = base;
        for (int i=0;i<st.length();i++){
            int num = Character.getNumericValue(st.charAt(i));
            ans += (num * ((int)Math.pow(base,redBase)));
            redBase--;
        }
        System.out.println(ans);
    }

}
