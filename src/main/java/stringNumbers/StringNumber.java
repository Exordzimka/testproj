package stringNumbers;

import Exceptions.WordIncorrectException;

import java.util.Map;

public abstract class StringNumber {
    protected String number;
    protected String digitNumber;
    protected int rank;
    public StringNumber(String number)
    {
        this.number = number;
        this.rank = defineRank(this.number);
        this.digitNumber = "";
    }

    private int defineRank(String number)
    {
        return 1;
    }

    public abstract Map<String, String> getFirstWords();
    public abstract Map<String, String> getSecondWords();
    public abstract Map<String, String> getStartsOfFirstWords();
    public abstract Map<String, String> getEndsOfWords();
    public abstract Map<String, String> getExceptions();
    public abstract void addWord(String word) throws WordIncorrectException;
}
