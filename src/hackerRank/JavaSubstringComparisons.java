package hackerRank;

public class JavaSubstringComparisons {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        java.util.List<String> words = new java.util.ArrayList<>();

        for(int i = 0; i<s.length()-k+1;i++){
            words.add(s.substring(i,i+k));
        }

        java.util.Collections.sort(words);

        smallest = words.get(0);
        largest = words.get(words.size()-1);



        return smallest + "\n" + largest;
    }
}
