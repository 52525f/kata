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
}
