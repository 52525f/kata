import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.testng.Assert.assertEquals;

public class WordBreakTest {
    @DataProvider
    public static Object[][] getParams() {
        return new Object[][] {
            new Object[] {"leetcode", Stream.of("leet", "code").collect(Collectors.toSet()), true},
            new Object[] {"a", Stream.of("b").collect(Collectors.toSet()), false},
            new Object[] {"aaaa", Stream.of("a", "aa").collect(Collectors.toSet()), true},
            new Object[] {"a", new HashSet<>(), false},
            new Object[] {"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab",
                           Stream.of("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa").collect(Collectors.toSet()), true},
        };
    }

    @Test(dataProvider = "getParams")
    public void determinesIfWordBreakPossible(String s, Set<String> dict, boolean expected) throws Exception {
        WordBreak wordBreak = new WordBreak();
        assertEquals(wordBreak.wordBreak(s, dict), expected);
    }
}
