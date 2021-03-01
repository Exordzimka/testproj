import Exceptions.WordIncorrectException;
import stringNumbers.StringNumber;

import java.util.ArrayList;
import java.util.List;

public class NumberConverter {
    private final Validator validator = new Validator();
    public String parseInputString(String input) throws WordIncorrectException {
        String[] words = input.replaceAll("[ |\r|\n]*  *", " ").trim().split(" ");
        for(String word : words)
        {
            if(validator.wordIsCorrect(word)==false)
                throw new WordIncorrectException();
            
        }

        return null;
    }
}
