public class Movie {

    private int rated = 0;

    public Integer getAverage() {
        return rated;
    }


    public void rate(int rate) {
        this.rated += rate;
    }
}
