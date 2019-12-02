import org.apache.commons.io.IOUtils;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public String readRawDataToString() throws Exception{
        ClassLoader classLoader = getClass().getClassLoader();
        String result = IOUtils.toString(classLoader.getResourceAsStream("RawData.txt"));
        return result;
    }


    public static void main(String[] args) throws Exception{

        String output = (new Main()).readRawDataToString();
        StringFix fix = new StringFix();
        String newOutput = fix.seperateLines(output);
        fix.foodSemicolonFix(newOutput);

        System.out.println(fix.wordFixer(newOutput));

    }
}
