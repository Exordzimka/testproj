package stringNumbers;

import Exceptions.WordIncorrectException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RussianStringNumber extends StringNumber{
    private boolean isFirstWord = true;
    private boolean alreadyAddedSecondWord = false;
    @Override
    public Map<String, String> getFirstWords() {
        Map<String, String> firstWords = new HashMap<>();
        firstWords.put("один", "1");
        firstWords.put("два", "2");
        firstWords.put("три", "3");
        firstWords.put("четыре", "4");
        firstWords.put("пять", "5");
        firstWords.put("шесть", "6");
        firstWords.put("семь", "7");
        firstWords.put("восемь", "8");
        firstWords.put("девять", "9");
        return firstWords;
    }

    @Override
    public Map<String, String> getSecondWords() {
        Map<String, String> secondWords = new HashMap<>();
        secondWords.put("тысяч", "000");
        secondWords.put("миллионов", "000000");
        secondWords.put("миллиардов", "000000000");
        secondWords.put("триллионов", "000000000000");
        return secondWords;
    }

    @Override
    public Map<String, String> getStartsOfFirstWords() {
        Map<String, String> startsOfFirstWords = new HashMap<>();
        startsOfFirstWords.put("один", "один");
        startsOfFirstWords.put("два", "дв");
        startsOfFirstWords.put("три", "тр");
        startsOfFirstWords.put("четыре", "четыр");
        startsOfFirstWords.put("пять", "пят");
        startsOfFirstWords.put("шесть", "шест");
        startsOfFirstWords.put("семь", "сем");
        startsOfFirstWords.put("восемь", "восем");
        startsOfFirstWords.put("девять", "девят");
        return startsOfFirstWords;
    }

    @Override
    public Map<String, String> getEndsOfWords() {
        return new HashMap<>(){{
            put("надцать", "1");
            put("дцать", "0");
            put("сот", "00");
        }};
    }
    @Override
    public Map<String, String> getExceptions(){
        return new HashMap<>(){{
            put("десять", "10");
            put("сорок", "40");
            put("девяносто", "90");
            put("сто", "100");
            put("тысяча", "1000");
        }};
    }

    private List<Map<String, String>> firstWordMaps;

    public RussianStringNumber(String number) {
        super(number);
    }



    @Override
    public void addWord(String word) throws WordIncorrectException {
        if(isFirstWord)
        {
            addFirstWord(word);
        }
        else
        {
            addSecondWord(word);
        }
        changeIsFirstWord();
    }

    private void changeIsFirstWord()
    {
        isFirstWord = !isFirstWord;
    }

    private void addFirstWord(String word) throws WordIncorrectException {
        boolean added = false;
        for(String key : getFirstWords().keySet())
        {
            if(word.equals(key))
            {
                digitNumber+=getFirstWords().get(key);
                added = true;
                break;
            }
        }
        if(added==false)
        {
            for(String key : getStartsOfFirstWords().keySet())
            {
                if(word.contains(key))
                {
                    for(String keyOfEnd : getEndsOfWords().keySet())
                    {
                        if(word.contains(keyOfEnd))
                        {
                            if(getEndsOfWords().get(keyOfEnd).equals(String.valueOf(1)))
                                digitNumber = getEndsOfWords().get(keyOfEnd) + getStartsOfFirstWords().get(key);
                            else
                                digitNumber = getStartsOfFirstWords().get(key) + getEndsOfWords().get(keyOfEnd);
                            added = true;
                            break;
                        }
                    }
                    break;
                }
            }
        }
        if(added==false)
            throw new WordIncorrectException();
    }

    private void addSecondWord(String word) throws WordIncorrectException {
        if(digitNumber.isBlank())
            throw new WordIncorrectException();
        for(String key : getSecondWords().keySet())
        {
            if(word.equals(key))
            {
                if(getSecondWords().get(key).length()>digitNumber.length())
                    throw new WordIncorrectException();
            }
        }
    }
}
