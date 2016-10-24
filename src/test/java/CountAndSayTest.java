import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CountAndSayTest {
    @DataProvider
    public static Object[][] provideArgs() {
        return new Object[][] {
            new Object[] {1, "1"},
            new Object[] {4, "1211"}
        };
    }

    @Test (dataProvider = "provideArgs")
    public void returnsExpectedString(int n, String expected) throws Exception {
        CountAndSay count = new CountAndSay();
        assertEquals(count.countAndSay(n), expected);
    }
}
