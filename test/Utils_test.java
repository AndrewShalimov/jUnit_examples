import example.Utils;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class Utils_test {

    @Test
    public void isNumeric_test() throws IOException {
        String testString = "some_string";
        String testNumeric = "445";
        boolean result = Utils.isStringNumeric(testString);
        Assert.assertEquals(result, false);

        result = Utils.isStringNumeric(testNumeric);
        Assert.assertEquals(result, true);
    }

}
