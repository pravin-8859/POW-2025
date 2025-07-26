package problem3;
import java.util.*;

public class StepWordsFinder {
    
    public static List<String> findStepWords(String inputWord, List<String> dictionary) {
        int[] inputFreq = getFrequencyArray(inputWord);
        List<String> result = new ArrayList<>();

        for (String word : dictionary) {
            if (word.length() != inputWord.length() + 1) continue;

            int[] wordFreq = getFrequencyArray(word);

            int diffCount = 0;
            for (int i = 0; i < 26; i++) {
                int diff = wordFreq[i] - inputFreq[i];
                if (diff < 0) {
                    diffCount = -1; // means inputWord has more of a char than target — invalid
                    break;
                }
                diffCount += diff;
            }

            if (diffCount == 1) {
                result.add(word);
            }
        }

        Collections.sort(result);
        return result;
    }

    private static int[] getFrequencyArray(String word) {
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputWord = sc.nextLine().trim();
        int n = Integer.parseInt(sc.nextLine().trim());
        List<String> dictionary = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            dictionary.add(sc.nextLine().trim());
        }

        List<String> stepWords = findStepWords(inputWord, dictionary);
        for (String word : stepWords) {
            System.out.println(word);
        }

        sc.close();
    }
}