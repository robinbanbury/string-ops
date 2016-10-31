package uk.co.robincsmith.stringops;

/**
 * This class acts as a wrapper for some simple string operations.
 * @author Robin Smith
 *
 */
public class StringHelper
{
    /**
     * Remove all instances of a given pattern from a string.
     * @param pattern The pattern to remove
     * @param str The string to remove the pattern from
     * @return The resultant string
     */
    public String removePatternFromString(String pattern, String str)
    {
        return str.replaceAll(pattern, "");
    }
    
    /**
     * Replace all instances of a given pattern with hyphens, using one hyphen
     * per character replaced.
     * @param pattern The pattern to replace
     * @param str The string to replace the pattern in
     * @return The resultant string
     */
    public String replacePatternWithHyphens(String pattern, String str)
    {        
        String replacementPattern = "";
        
        for (int i = 0; i < pattern.length(); i++)
        {
            replacementPattern = replacementPattern.concat("-");
        }
        
        return str.replaceAll(pattern,  replacementPattern);
    }
    
    /**
     * Reverse the order of the string.
     * @param str The string to reverse
     * @return The resultant, reversed string
     */
    public String reverseString(String str)
    {
        return new StringBuilder(str).reverse().toString();
    }
}
