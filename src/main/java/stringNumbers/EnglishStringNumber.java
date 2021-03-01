package stringNumbers;

import java.util.HashMap;
import java.util.Map;

public class EnglishStringNumber extends StringNumber {
    public EnglishStringNumber(String number) {
        super(number);
    }

    @Override
    public Map<String, String> getFirstWords() {
        Map<String, String> firstWords = new HashMap<>();
        firstWords.put("one", "1");
        firstWords.put("two", "2");
        firstWords.put("three", "3");
        firstWords.put("four", "4");
        firstWords.put("five", "5");
        firstWords.put("six", "6");
        firstWords.put("seven", "7");
        firstWords.put("eight", "8");
        firstWords.put("nine", "9");
        return firstWords;
    }

    @Override
    public Map<String, String> getStartsOfFirstWords() {
        return new HashMap<>(){{
            put("one", "one");
            put("two", "tw");
            put("three", "th");
            put("four", "four");
            put("five", "fif");
            put("six", "six");
            put("seven", "seven");
            put("eight", "eight");
            put("nine", "nine");
        }};
    }

    @Override
    public Map<String, String> getSecondWords() {
        return new HashMap<>(){{
            put("hundred", "00");
            put("thousand", "000");
            put("million", "000000");
            put("billion", "000000000");
            put("trillion", "000000000000");
        }};
    }

    @Override
    public Map<String, String> getEndsOfWords() {
        return new HashMap<>(){{
            put("teen", "1");
            put("ty", "0");
        }};
    }
    @Override
    public Map<String, String> getExceptions(){
        return new HashMap<>(){{
            put("eleven", "11");
            put("twelve", "12");
        }};
    }

    @Override
    public void addWord(String word) {

    }
}
