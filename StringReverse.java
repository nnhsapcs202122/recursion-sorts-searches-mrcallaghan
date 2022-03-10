
/**
 * Write a description of class StringReverse here.
 *
 * @author mrcallaghan
 * @version 10mar2022
 */
public class StringReverse
{
    
    public static String reverse(String str)
    {
    
        // must have a terminating case
        if(str.equals(""))
        {
            return str;
        }
        
        String firstChar = str.substring(0,1);
        String restOfString = str.substring(1);
        
        // recurse - call this method with the simpler problem
        String restOfStringReversed = reverse(restOfString);
        
        String stringReversed = restOfStringReversed + firstChar;
        
        return stringReversed;
    
    }
}
