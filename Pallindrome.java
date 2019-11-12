import java.util.*;
import chn.util.*;
import java.lang.String;
/**
 * Write a description of class Palindrome here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pallindrome
{
    public static boolean Loops(String temp)
    {
        boolean goOn = false;
        boolean beGone = false;
        int i,j;
        
        i = 0;
        j = temp.length() - 1;
        
        do
        {
            if (temp.charAt(i) == temp.charAt(j) && i<=j)
            {
                i++;
                j--;
                beGone = true;
            }
            else
            {
                goOn = true;
                if(i<j)
                    beGone = false;
            }
        }
        while (goOn == false);
        
        return beGone;
    }
    
    public static boolean Recurssion(String temp)
    {
    	int length = temp.length();
        char compare[] = temp.toCharArray();
        boolean goAway = false;
        if (length == 1)
            goAway = true;
        else
            if(compare[0] == compare[length-1])
            {
                temp = temp.substring(1, length-1);
                goAway = Recurssion(temp);
            }
            else
                goAway = false;

        return goAway;
    }
    
    public static boolean Reverse(String temp)
    {
        char letter;
        boolean sendBack = false;
        String reverse = "";
        int i, length = temp.length();
        
        for(i = length - 1; i >= 0; i--)
        {
            letter = temp.charAt(i);
            
            reverse += letter;
        }
        
        if(reverse.equals(temp))
        {
           sendBack = true;
        }
        return sendBack;
        
    }
}
    