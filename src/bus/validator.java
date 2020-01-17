package bus;

import java.util.regex.Pattern;

public class validator {
	public static boolean SerialCheck(String id/*,int size*/)
	{
		return Pattern.matches("\\d{8}", id);/*"+size+"*/
	}
}
