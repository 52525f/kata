import java.util.*;
import java.util.stream.Collectors;

public class WordBreak {
    private Set<String> badBreaks = new HashSet<>();

    public boolean wordBreak(String s, Set<String> dict) {
        if (s == null || s.isEmpty()) {
            return false;
        }
        for (int i = 1; i <= s.length(); i++) {
            if (dict.contains(s.substring(0, i))) {
                String remainder = s.substring(i);
                if (remainder.isEmpty() || (!badBreaks.contains(remainder) && wordBreak(remainder, dict))) {
                    return true;
                } else {
                    badBreaks.add(remainder);
                }
            }
        }
        return false;
    }

//    public boolean wordBreak(String s, Set<String> wordDict) {
//        if(s == null || s.isEmpty() || wordDict == null || wordDict.isEmpty())
//            return false;
//        Map<Character, List<String>> wordMap = wordDict.stream().collect(Collectors.groupingBy(w -> w.charAt(0)));
//        List<String> frontier = getWords(s, wordMap);
//        List<String> remaining = getRemaining(s, frontier);
//        while (!frontier.isEmpty()) {
//            List<String> next = new ArrayList<>();
//            List<String> nextRemaining = new ArrayList<>();
//            for (int i = 0; i < frontier.size(); i++) {
//                String rest = remaining.get(i);
//                if (rest.isEmpty()) {
//                    return true;
//                } else {
//                    List<String> words = getWords(rest, wordMap);
//                    next.addAll(words);
//                    nextRemaining.addAll(getRemaining(rest, words));
//                }
//            }
//            frontier = next;
//            remaining = nextRemaining;
//        }
//
//        return false;
//    }
//
//    private List<String> getRemaining(String s, List<String> frontier) {
//        return frontier.stream().map(w -> s.substring(w.length())).collect(Collectors.toList());
//    }
//
//    private List<String> getWords(String s, Map<Character, List<String>> wordsByFirstLetter) {
//        return wordsByFirstLetter.getOrDefault(s.charAt(0), new ArrayList<>()).stream()
//                .filter(word -> word.length() <= s.length() && s.startsWith(word))
//                .collect(Collectors.toList());
//    }
}
