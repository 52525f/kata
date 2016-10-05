package kata;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.testng.Assert.assertEquals;

public class WordLadderTest {
    @DataProvider
    public static Object[][] provideArgs() {
        return new Object[][]{
                new Object[]{"hit", "cog", Stream.of("hot").collect(Collectors.toSet()), 0},
                new Object[]{"hit", "cog", Stream.of("hot", "dot", "dog", "lot", "log").collect(Collectors.toSet()), 5}
        };
    }

    @Test(dataProvider = "provideArgs")
    public void findsShortestTransformation(String startWord, String endWord, Set<String> wordList, int expectedLength) throws Exception {
        WordLadder ladder = new WordLadder();
        assertEquals(ladder.ladderLength(startWord, endWord, wordList), expectedLength);
    }
}
