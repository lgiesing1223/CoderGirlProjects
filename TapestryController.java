public class TapestryController {

    private static final Pattern[] PATTERNS = {
            new CrossStitchWigglePattern(),
            new ZigZagLinesPattern(),
            new BaublePattern(),
            new BlockyBaublePattern(),
            new BrokenWigglePattern()
    };

    public static void main(String[] args) {
        for(Pattern pattern : PATTERNS) {
            for(int row = 0; row < 3; row++) {
                for(int col = 0; col < 8; col++) {
                    pattern.pattern();
                }
                System.out.println();
            }
            System.out.println("\n\n");
            for(int row = 0; row < 8; row++) {
                for(int col = 0; col < 6; col++) {
                    pattern.pattern();
                }
                System.out.println();
            }
            System.out.println("\n\n");
        }
    }
}