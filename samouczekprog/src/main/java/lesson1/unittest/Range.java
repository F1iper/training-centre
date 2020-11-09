package lesson1.unittest;

public class Range {
    private final long lowerBound;
    private final long upperBound;

    public Range(long lowerBound, long upperBound) {
        if (lowerBound > upperBound) {
            throw new IllegalArgumentException("LowerBound is bigger then UpperBound!");
        }
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public long getLowerBound() {
        return lowerBound;
    }

    public long getUpperBound() {
        return upperBound;
    }

    public boolean isRange(long number) {
        return number >= lowerBound && number <= upperBound;
    }
}
