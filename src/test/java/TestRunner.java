import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRunner extends AppLunchSetup {
    @Test
    public void runTest()
    {
        Calculation testCase = new Calculation(driver);
        String result = testCase.doSum();
        Assert.assertEquals(result, "17");
    }
}
