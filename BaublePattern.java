class BaublePattern extends Pattern {
    private static final Stitch[] STITCHES = {
            SHORT_LINE, SHORT_LINE, CIRCLE, SHORT_LINE, SHORT_LINE, CIRCLE,
            SHORT_LINE, SHORT_LINE, CIRCLE, SHORT_LINE, SHORT_LINE, CIRCLE,
            SHORT_LINE, SHORT_LINE, CIRCLE
    };

    public void pattern()
    {
        printStitches(STITCHES);
    }
}

