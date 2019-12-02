import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringFix {

    public String seperateLines(String ourText) throws Exception {

        String hashes = "##";
        Pattern pattern = Pattern.compile(hashes);
        Matcher matcher = pattern.matcher(ourText);
        String space = "\n";
        ourText = matcher.replaceAll(space);
        System.out.println("SAMPLE \t" + ourText);
        return ourText;


    }
}
