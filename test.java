import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        String s1 = "this apple is sweet";
        String s2 = "this apple is sour";

        String s = s1 + " " + s2;

        // Create a map to store the word counts
        Map<String, Integer> wordCount = new HashMap<>();

        // Split the combined string into words
        String[] words = s.split(" ");

        // Count the occurrences of each word
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        // Create a list to store the uncommon words (those with a count of 1)
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() == 1) {
                result.add(entry.getKey());
            }
        }
        System.out.println(result);
    }
}
