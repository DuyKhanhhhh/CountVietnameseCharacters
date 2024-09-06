import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountVietnameseCharacters {
    public int countCharacters(String input) {
        String regex = "aw|aa|dd|ee|oo|ow|w";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        int count = 0;

        while (matcher.find()) {
            count++;
        }

        return count;
    }
}
