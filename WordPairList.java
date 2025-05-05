import java.util.ArrayList;
public class WordPairList
{
    /** The list of word pairs, initialized by the constructor. */
    private ArrayList<WordPair> allPairs;

    /** Constructs a WordPairList object as described in part (a).
    * Precondition: words.length >= 2
    */
    public WordPairList(String[] words)
    {
        allPairs = new ArrayList<WordPair>();
        for (int i = 0; i < words.length; i++) {
            for (int f = i + 1; f < words.length; f++) {
                WordPair w = new WordPair(words[i], words[f]);
                allPairs.add(w);
            }
        }
    }

    public ArrayList<WordPair> getAllPairs() {
        return allPairs;
    }

    /** Returns the number of matches as described in part (b).
    */
    public int numMatches()
    {
        int count = 0;
        for (WordPair s : allPairs) {
            if (s.getFirst() == s.getSecond()) count++;
        }
        return count;
    }
}