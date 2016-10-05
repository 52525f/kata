package kata;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CheckingGroupsTest {

    @DataProvider
    public Object[][] provideArgs() {
        return new Object[][] {
                new Object[] {"{}", true},
                new Object[] {"({", false},
                new Object[] {"({})", true},
                new Object[] {"[[]()]", true},
                new Object[] {"[{()}]", true},
                new Object[] {"{(})", false},
                new Object[] {"([]", false},
                new Object[] {"[])", false},
        };
    }

    @Test(dataProvider = "provideArgs")
    public void checksGroupMatches(String str, boolean expectedResult) throws Exception {
        assertEquals(CheckingGroups.groupCheck(str), expectedResult);
    }
}
