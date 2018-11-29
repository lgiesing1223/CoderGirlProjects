import java.util.Arrays;

abstract class Pattern {
    static final ShortLineStitch SHORT_LINE = new ShortLineStitch();
    static final SmallCrossStitch SMALL_CROSS = new SmallCrossStitch();
    static final LargeCrossStitch LARGE_CROSS = new LargeCrossStitch();
    static final CircleStitch CIRCLE = new CircleStitch();
    static final FillStitch FILL = new FillStitch();
    static final BlockStitch BLOCK = new BlockStitch();
    static final ZigZagStitch ZIG_ZAG = new ZigZagStitch();

    abstract public void pattern();

    void printStitches(Stitch[] stitches)
    {
        if(needleJam())
        {
            stitches = Arrays.copyOfRange(stitches, 0, (stitches.length-1) / 2);
        }
        for(Stitch stitch : stitches)
        {
            stitch.sew();
        }
    }

    protected double jamRate() {
        return 0.0d;
    }

    private boolean needleJam() {
        return (Math.random() < jamRate());
    }
}




