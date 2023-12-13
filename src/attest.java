import java.util.HashMap;
import java.util.Map;
public class attest {
    public static void main(String[] args) {
        String sentence = "Напишите программу, которая определяет слова и выводит, их повторения Слова, Повторения повторения слова";
        String[] words = sentence.split("\s+");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll(",", "");
        }
        Map<String, Integer> wordFrequency = new HashMap<>();
        for (String word : words) {
            String lowercaseWord = word.toLowerCase();
            wordFrequency.put(lowercaseWord, wordFrequency.getOrDefault(lowercaseWord, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}


