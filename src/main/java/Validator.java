public class Validator {
    boolean wordIsCorrect(String word)
    {
        return wordIsNumber(word) || wordIsStringNumber(word);
    }

    private boolean wordIsNumber(String word)
    {
        return containsOnlyDigit(word);
    }

    private boolean wordIsStringNumber(String word)
    {
        return !containsDigit(word);
    }

    private boolean containsDigit(String word)
    {
        for(int i=0;i<word.length();i++)
        {
            if(Character.isDigit(word.charAt(i)))
                return true;
        }
        return false;
    }

    private boolean containsOnlyDigit(String word)
    {
        for(int i=0;i<word.length();i++)
        {
            if(Character.isDigit(word.charAt(i))==false)
                return false;
        }
        return true;
    }
}
