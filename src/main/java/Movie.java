public class Movie {

    private int rated = 0;
    private int rateCount = 0;

    public Integer getAverage() {
        return rateCount == 0 ? 0 : rated / rateCount;
    }

    public void rate(int rate) {
        this.rated += rate;
        rateCount++;
    }
}
