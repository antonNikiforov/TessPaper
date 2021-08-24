package test_tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class OccurrencesWords {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter text please: ");
        List<String> text = new ArrayList<>();
        String line;
        while ((line = br.readLine()).length() > 0) {
            text.addAll(Arrays.asList(line.split("\\P{L}+")));
        }
        System.out.println("Here is result: ");
        wordsCounter(text).forEach((word, count) -> {
           System.out.printf("Number of occurrences: %d word: %s %n%n", count, word);
        });
    }

    private static Map<String, Integer> wordsCounter(List<String> text) {
        LinkedHashMap<String, Integer> wordGrouper = new LinkedHashMap<>();
        for (int i = 0; i < text.size(); i++) {
            int count = 0;
            String s1 = text.get(i);
            Integer integer = wordGrouper.get(s1);
            if (integer == null) {
                for (String s2 : text) {
                     if (s1.equals(s2)) {
                        count++;
                    }
                }
                wordGrouper.put(s1, count);
            }
        }
        LinkedHashMap<String,Integer> result=new LinkedHashMap<>();
       wordGrouper.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).forEach(e->result.put(e.getKey(), e.getValue()));
        return result;
    }
}
