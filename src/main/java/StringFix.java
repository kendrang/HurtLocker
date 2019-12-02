import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringFix {

    public String seperateLines(String ourText) throws Exception {

        String hashes = "##";
        Pattern pattern = Pattern.compile(hashes);
        Matcher matcher = pattern.matcher(ourText);
        String space = "\n";
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


    public String wordFixer(String ourText){
        ourText = milkFixer(ourText);
        ourText = breadFixer(ourText);
        ourText = cookiesFixer(ourText);
        ourText = appleFixer(ourText);
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

    public Integer countingErrors(String ourText){
        return null;
    }
}
