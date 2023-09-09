import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class WordFrequencyCounter {

    public static void main(String[] args) {
        String filePath = "document.txt";
        try {

            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            StringBuilder text = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                text.append(line).append(" ");
            }
            reader.close();
            String[] words = text.toString().toLowerCase().split("\\s+");

            Map<String, Integer> wordFrequency = new HashMap<>();
            for (String word : words) {
                word = word.replaceAll("[^a-zA-Z]", "");
                if (!word.isEmpty()) {
                    wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
                }
            }

            int numWords = words.length;
            int numCharacters = text.length();
            System.out.println("Total Words: " + numWords);
            System.out.println("Total Characters: " + numCharacters);
            TreeMap<String, Integer> sortedHistogram = new TreeMap<>(wordFrequency);
            System.out.println("Word Frequencies:");
            for (Map.Entry<String, Integer> entry : sortedHistogram.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
