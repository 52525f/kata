package kata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class WordLadder {
    public int ladderLength(String startWord, String endWord, Set<String> wordList) {
        Queue<String> queue = new LinkedList<>();
        Map<String, Integer> distMap = new HashMap<>();
        wordList.add(endWord);
        queue.add(startWord);
        distMap.put(startWord, 1);

        while (!queue.isEmpty()) {
            String current = queue.remove();
            int currentDist = distMap.get(current);

            for (String next : getNeighbors(current, wordList)) {
                if (next.equals(endWord)) {
                    return currentDist + 1;
                }
                if (!distMap.containsKey(next)) {
                    distMap.put(next, currentDist + 1);
                    queue.add(next);
                }
            }
        }
        return 0;
    }

    private List<String> getNeighbors(String s, Set<String> wordList) {
        List<String> neighbors = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char[] word = s.toCharArray();
            for (char c='a'; c < 'z'; c++) {
                word[i] = c;
                String toCheck = new String(word);
                if (!toCheck.equals(s) && wordList.contains(toCheck))
                    neighbors.add(toCheck);
            }
        }
        return neighbors;
    }
}
