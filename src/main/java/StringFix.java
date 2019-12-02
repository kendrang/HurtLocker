import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringFix {

    public String seperateLines(String ourText) throws Exception {

        String hashes = "##";
        Pattern pattern = Pattern.compile(hashes);
        Matcher matcher = pattern.matcher(ourText);
        String space = "\n\n";
        ourText = matcher.replaceAll(space);
        return ourText;

    }

    public String foodSemicolonFix(String ourText){

        String food = "Food";
        Pattern pattern = Pattern.compile("(Food).");
        Matcher matcher = pattern.matcher(ourText);
        String trueFood = "Food;";
        ourText = matcher.replaceAll(trueFood);
        return ourText;

    }


    public String foodFixer(String ourText){
        ourText = milkFixer(ourText);
        ourText = breadFixer(ourText);
        ourText = cookiesFixer(ourText);
        ourText = appleFixer(ourText);
        return ourText;
    }

    public String keyFixer(String ourText){
        ourText = nameFixer(ourText);
        ourText = priceFixer(ourText);
        return ourText;

    }

    public String milkFixer(String ourText){
        Pattern pattern = Pattern.compile("(:M)...");
        Matcher matcher = pattern.matcher(ourText);
        String trueMilk = ":Milk";
        ourText = matcher.replaceAll(trueMilk);
        return ourText;
    }

    public String breadFixer(String ourText){
        Pattern pattern = Pattern.compile("(:B)....");
        Matcher matcher = pattern.matcher(ourText);
        String trueBread = ":Bread";
        ourText = matcher.replaceAll(trueBread);
        return ourText;
    }

    public String cookiesFixer(String ourText){

        Pattern pattern = Pattern.compile("(:C)......");
        Matcher matcher = pattern.matcher(ourText);
        String trueCookie = ":Cookies";
        ourText = matcher.replaceAll(trueCookie);
        return ourText;

    }

    public String appleFixer(String ourText){
        Pattern pattern = Pattern.compile("(:a).....");
        Matcher matcher = pattern.matcher(ourText);
        String trueApples = ":Apples";
        ourText = matcher.replaceAll(trueApples);
        return ourText;
    }

    public String nameFixer(String ourText){
        Pattern pattern = Pattern.compile("(n|N)...");
        Matcher matcher = pattern.matcher(ourText);
        String trueName = "name";
        ourText = matcher.replaceAll(trueName);
        return ourText;
    }
    public String priceFixer(String ourText){
        Pattern pattern = Pattern.compile("(;p)....");
        Matcher matcher = pattern.matcher(ourText);
        String truePrice = ";Price";
        ourText = matcher.replaceAll(truePrice);
        return ourText;
    }


    public static long errorCounter(String ourText)
    {
        Matcher matcher
                = Pattern.compile(String.valueOf(":;"))
                .matcher(ourText);
        int errorCount = 0;

        while (matcher.find()) {
            errorCount++;
        }
        return errorCount;
    }

}
