class BlockyBaublePattern extends Pattern {
    private static final Stitch[] STITCHES = {
            BLOCK, SHORT_LINE, SHORT_LINE, CIRCLE, SHORT_LINE, SHORT_LINE,
            BLOCK, SHORT_LINE, SHORT_LINE, CIRCLE, SHORT_LINE, SHORT_LINE,
            BLOCK, SHORT_LINE, SHORT_LINE, CIRCLE, SHORT_LINE, SHORT_LINE
    };

    protected double jamRate() {
        return 0.10d;
    }

    public void pattern() {
        printStitches(STITCHES);
    }
}

