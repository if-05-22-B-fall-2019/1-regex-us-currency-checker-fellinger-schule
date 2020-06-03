//import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsCurrencyChecker {
    public static Matcher getMatcher(String usCurrencyString) {
        String patternString = "\\$ ?\\d+(\\.\\d{1,2})?";

        Pattern pattern = Pattern.compile(patternString);

        return pattern.matcher(usCurrencyString);
    }
}
