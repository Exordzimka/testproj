package stringNumberCreators;

import stringNumbers.EnglishStringNumber;
import stringNumbers.StringNumber;

public class EnglishStringNumberCreator extends StringNumberCreator {

    @Override
    public StringNumber createNumber(String number) {
        return new EnglishStringNumber(number);
    }
}
