import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MovieTest {
    @Test
    public void can_create_Movie() {
        new Movie();
    }

    @Test
    public void 한번도_rate_되지않으면_평균도_0() {
        Movie movie = new Movie();
        assertThat(movie.getAverage(), is(0));
    }

    @Test
    public void 한번_rate_되었을때_평균은_rate와_같다() {
        Movie movie = new Movie();
        movie.rate(1);
        assertThat(movie.getAverage(),is(1));
    }
}

