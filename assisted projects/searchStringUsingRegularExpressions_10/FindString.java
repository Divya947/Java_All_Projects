package searchStringUsingRegularExpressions_10;
import java.util.regex.*;

public class FindString {
	
	public static void main(String args[])
    {
        Pattern p= Pattern.compile("sun");
        Matcher m = p.matcher("sunday is a sunny day");
        while (m.find())
            System.out.println("Pattern found from "+ m.start() + " to "
                    + (m.end()-1));
    }
}
