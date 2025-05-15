package TsStuff;

import java.util.ArrayList;
import java.util.List;

public class PalabrasList {
    private List<String> words;

    public PalabrasList() {
        words = new ArrayList<>();
        WordsAndStuff();
    }

    public void WordsAndStuff() {
        words.add("audio");
        words.add("virus");
        words.add("smile");
        words.add("clock");
        words.add("quiet");
        words.add("noise");
        words.add("ratio");
        words.add("delay");
        words.add("wrote");
        words.add("track");
        words.add("craft");
        words.add("place");
        words.add("sight");
        words.add("heart");
        words.add("there");
        words.add("photo");
        words.add("agree");
        words.add("fight");
        words.add("cause");
        words.add("twice");
        words.add("shell");
    }

    public String getRanWords() {
        int index = (int) (Math.random() * words.size());
        return words.get(index);
    }
}
