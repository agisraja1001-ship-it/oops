import java.util.HashMap;
import java.util.Map;

class BannerCharacterArray {
    String[] pattern;

    BannerCharacterArray(String[] pattern) {
        this.pattern = pattern;
    }

    String[] getPattern() {
        return pattern;
    }
}

public class OOPSBANNERUC8
 {

    static Map<Character, BannerCharacterArray> buildCharacterPatternMap() {

        Map<Character, BannerCharacterArray> map = new HashMap<>();

        map.put('O', new BannerCharacterArray(new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        }));

        map.put('P', new BannerCharacterArray(new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        }));

        map.put('S', new BannerCharacterArray(new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        }));

        return map;
    }

    static void displayBanner(String word, Map<Character, BannerCharacterArray> map) {

        int height = 5;

        for (int row = 0; row < height; row++) {

            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {
                BannerCharacterArray charPattern = map.get(c);
                if (charPattern != null) {
                    line.append(charPattern.getPattern()[row]).append(" ");
                }
            }

            System.out.println(line.toString());
        }
    }

    public static void main(String[] args) {

        Map<Character, BannerCharacterArray> patternMap = buildCharacterPatternMap();

        String word = "OOPS";

        displayBanner(word, patternMap);
    }
}