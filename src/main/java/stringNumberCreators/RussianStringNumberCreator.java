package stringNumberCreators;

import stringNumbers.RussianStringNumber;
import stringNumbers.StringNumber;

public class RussianStringNumberCreator extends StringNumberCreator {
    @Override
    public StringNumber createNumber(String number) {
        return new RussianStringNumber(number);
    }
}
