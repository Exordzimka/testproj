import stringNumberCreators.EnglishStringNumberCreator;
import stringNumberCreators.RussianStringNumberCreator;
import stringNumberCreators.StringNumberCreator;

import java.util.*;

public class Test
{
    private final static Map<String, StringNumberCreator> factoryMap = new HashMap<>(){{
       put("russian", new RussianStringNumberCreator());
       put("english", new EnglishStringNumberCreator());
    }};

    public static void main(String[] args){
        NumberConverter numberConverter = new NumberConverter();
    }
}
