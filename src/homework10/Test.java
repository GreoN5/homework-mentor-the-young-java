package homework10;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine().toLowerCase();

        HashMap<Character, Integer> letterCounts = new HashMap<>();

        for(char c : text.toCharArray()) {
            if(Character.isLetter(c)) {
                letterCounts.put(c, letterCounts.getOrDefault(c,0) + 1);
            }
        }
        Map<Character, Integer> sortedLetterCounts = letterCounts.entrySet().stream().sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue())).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println("Most common letters: ");
        for(Map.Entry<Character, Integer> entry : sortedLetterCounts.entrySet()) {
            char letter = entry.getKey();
            int count = entry.getValue();
            String graph = "#####".repeat(count);
            System.out.printf("%c: %d %s%n", letter, count, graph);
        }
    }
}
