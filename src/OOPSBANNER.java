public class OOPSBannerUC7 {

    /**
     * Inner Static Class to store Character and Pattern
     */
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        /**
         * Constructor
         * @param character character to store
         * @param pattern banner pattern
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         * @return pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to build banner line
     */
    static String buildLine(String... parts) {
        StringBuilder sb = new StringBuilder();
        for (String p : parts) {
            sb.append(p).append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        CharacterPatternMap o = new CharacterPatternMap('O', new String[]{
                "  *****  ",
                " *     * ",
                "*       *",
                "*       *",
                "*       *",
                " *     * ",
                "  *****  "
        });

        CharacterPatternMap p = new CharacterPatternMap('P', new String[]{
                " ********",
                " *      *",
                " *      *",
                " ********",
                " *       ",
                " *       ",
                " *       "
        });

        CharacterPatternMap s = new CharacterPatternMap('S', new String[]{
                " ********",
                " *       ",
                " *       ",
                "  *****  ",
                "       * ",
                " *     * ",
                "  *****  "
        });

        CharacterPatternMap[] letters = {o, o, p, s};

        for (int i = 0; i < 7; i++) {

            StringBuilder row = new StringBuilder();

            for (CharacterPatternMap letter : letters) {
                row.append(letter.getPattern()[i]).append(" ");
            }

            System.out.println(row.toString());
        }
    }
}