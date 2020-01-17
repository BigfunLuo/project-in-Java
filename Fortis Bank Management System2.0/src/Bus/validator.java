package Bus;

import java.util.regex.Pattern;

public class validator {
    public static boolean SerialCheck(String id,int size)
    {
        return Pattern.matches("\\d{"+size+"}", id);
    }

}
