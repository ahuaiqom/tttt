import java.util.*;

public class p {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] titles = input.split(",\\s*");

        if (allTitlesOccurOnce(titles)) {
            System.out.println("All titles occur once.");
        } else {
            String mostFrequent = findMostFrequentTitle(titles);
            String leastFrequent = findLeastFrequentTitle(titles);

            int mostFrequency = countFrequency(titles, mostFrequent);
            int leastFrequency = countFrequency(titles, leastFrequent);

            System.out.println("Most song titles: " + mostFrequent + " with total: " + mostFrequency);
            System.out.println("Fewest song titles: " + leastFrequent + " with total: " + leastFrequency);
        }

        scanner.close();
    }

    private static String findMostFrequentTitle(String[] titles) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String title : titles) {
            String lowercaseTitle = title.trim().toLowerCase();
            frequencyMap.put(lowercaseTitle, frequencyMap.getOrDefault(lowercaseTitle, 0) + 1);
        }

        int maxFrequency = Collections.max(frequencyMap.values());
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                return entry.getKey();
            }
        }
        return "";
    }

    private static String findLeastFrequentTitle(String[] titles) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String title : titles) {
            String lowercaseTitle = title.trim().toLowerCase();
            frequencyMap.put(lowercaseTitle, frequencyMap.getOrDefault(lowercaseTitle, 0) + 1);
        }

        int minFrequency = Collections.min(frequencyMap.values());
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == minFrequency) {
                return entry.getKey();
            }
        }
        return "";
    }

    private static int countFrequency(String[] titles, String title) {
        int count = 0;
        for (String t : titles) {
            if (t.trim().equalsIgnoreCase(title)) {
                count++;
            }
        }
        return count;
    }

    private static boolean allTitlesOccurOnce(String[] titles) {
        Set<String> uniqueTitles = new HashSet<>();
        for (String title : titles) {
            if (!uniqueTitles.add(title.trim().toLowerCase())) {
                return false;
            }
        }
        return true;
    }
}




