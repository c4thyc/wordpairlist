public class Main {
    public static void main (String[] args) {
        String[] wordNums = {"one", "two", "three"};
        WordPairList one = new WordPairList(wordNums);
        System.out.println(one.getAllPairs());

        String[] moreWords = {"the", "red", "fox", "the", "red"};
        WordPairList two = new WordPairList(moreWords);
        System.out.println(two.numMatches());
    }
}