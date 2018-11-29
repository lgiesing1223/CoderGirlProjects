class ZigZagLinesPattern extends Pattern{
    private static final Stitch STITCHES[] = {
            ZIG_ZAG, ZIG_ZAG, ZIG_ZAG, FILL, FILL, FILL,
            ZIG_ZAG, ZIG_ZAG, ZIG_ZAG, FILL, FILL, FILL
    };

    public void pattern() {
        printStitches(STITCHES);
    }
}
