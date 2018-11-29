class CrossStitchWigglePattern extends Pattern {

    private static final Stitch[] STITCHES = {
        SMALL_CROSS, LARGE_CROSS, SMALL_CROSS, LARGE_CROSS, SMALL_CROSS,
        LARGE_CROSS, SMALL_CROSS, LARGE_CROSS, SMALL_CROSS, LARGE_CROSS
    };

    protected double jamRate()
    {
        return 0.05d;
    }

    public void pattern()
    {
        printStitches(STITCHES);
    }
}
