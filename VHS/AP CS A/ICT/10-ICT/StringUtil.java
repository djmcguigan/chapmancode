public class StringUtil
{
    public static void replaceAll(String str)
    {
        str = str.toLowerCase();
        str = convert(str, "and", "&");
        str = convert(str, "to", "2");
        str = convert(str, "for", "4");
        str = convert(str, "you", "U");
        str = shortHand(str, "a");
        System.out.println();
        System.out.println(str);
        str = shortHand(str, "e");
        System.out.println(str);
        str = shortHand(str, "i");
        System.out.println(str);
        str = shortHand(str, "o");
        System.out.println(str);
        str = shortHand(str, "u");
        System.out.println(str);
    }
    private static String convert(String str, String toRemove, String replaceWith)
    {
        str = str.toLowerCase();
        toRemove = toRemove.toLowerCase();
        replaceWith = replaceWith.toLowerCase();
        int num = str.indexOf(toRemove);
        String str1 = null;
        String str2 = null;
        String str3 = null;
        if(num == -1)
            return str;
        else
        {
            str1 = str.substring(0, num);
            str2 = str.substring(num + toRemove.length(), str.length());
            str3 = str1 + replaceWith + str2;
            return convert(str3, toRemove, replaceWith);
        }
    }
      
    private static String shortHand(String str, String remove)
    {
        int num = 0;
        String str1 = null;
        String str2 = null;
        String str3 = null;
        
        num = str.indexOf(remove);
        if (num == -1)
            return str;
        else
        {
            str1 = str.substring(0, num);
            str2 = str.substring(num + 1, str.length());
            str3 = str1 + str2;
            return shortHand(str3, remove);
        }
    }

    public static String reverse(String str)
    {
        System.out.println();
        if(str.length() == 1)
            return str;
        else
            return str.charAt(0) + reverse(str.substring(1));
    }
    
    public static boolean palindrome(String str1)
    {        
        str1 = str1.toLowerCase();
        str1 = noSymbols(str1, 0);       
        str1 = reverse(str1);
        if(str1.equalsIgnoreCase(str1))
            return true;
        else
            return false;
    }
    
    private static String noSymbols(String str, int pos)
    {
        
        if (pos >= str.length())
            return str;
            
            System.out.println(str.charAt(pos));
        if((str.charAt(pos) >= 'a' && str.charAt(pos) <= 'z') || (str.charAt(pos) >= '0' && str.charAt(pos) <= '9'))
          return noSymbols(str, pos + 1);
        else
        {
            String start = str.substring(0,pos);
            String end = str.substring(pos + 1);
            str = start + end;
			return noSymbols(str, pos);
        }
       
    }
    
    public static String pigLatinator(String str2)
    {
        int index = str2.indexOf(" ");
        if (index == -1)
            return latinate(str2);
        String englishWord = str2.substring(0, index);
        return latinate(englishWord) + pigLatinator(str2.substring(index + 1));
    }
    
    private static String latinate(String word)
    {
        String start = null;
        String end = null;
        if(hasNoVowels(word, 0))
            return word + "ay";
        else if(startsWithVowel(word))
            return word + "yay";
        else
        {
            int vowelPos = findFirstVowel(word, 0);
            start = word.substring(0, vowelPos);
            end = word.substring(vowelPos);
            if(startsWithCapital(word))
            {
                start = start.toLowerCase();
                String letter = end.substring(0,1);
                letter = letter.toUpperCase();
                end = letter + end.substring(1);
            }
        }
        return end + start + "ay";
    }
    
    private static boolean hasNoVowels(String word, int pos)
    {
        word = word.toLowerCase();
        if((word.charAt(pos) =='a') || (word.charAt(pos) == 'e') || (word.charAt(pos) == 'i') || (word.charAt(pos) == 'o') || (word.charAt(pos) == 'u'))
            return false;
        else
        {
            hasNoVowels(word, pos + 1);
            return true;
        }
    }
    
    private static boolean startsWithVowel(String word)
    {
        word = word.toLowerCase();
        if((word.charAt(0) == 'a') || (word.charAt(0) == 'e') || (word.charAt(0) == 'i') || (word.charAt(0) == 'o') || (word.charAt(0) == 'u'))
            return true;
        else
            return false;
    }
    
    private static int findFirstVowel(String word, int pos)
    {
        int vowelPos = 0;
        if((word.charAt(pos) =='A') || (word.charAt(pos) == 'E') || (word.charAt(pos) == 'I') || (word.charAt(pos) == 'O') || (word.charAt(pos) == 'U') || (word.charAt(pos) =='a') || (word.charAt(pos) == 'e') || (word.charAt(pos) == 'i') || (word.charAt(pos) == 'o') || (word.charAt(pos) == 'u'))
            return vowelPos;
        else 
            return findFirstVowel(word, vowelPos + 1);
    }
    
    private static boolean startsWithCapital(String word)
    {
        if(word.charAt(0) <= 'A' && word.charAt(0) >= 'Z')
            return true;
        else
            return false;
    }
}