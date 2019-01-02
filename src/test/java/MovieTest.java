import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MovieTest {

    private Movie movie;

    @Before
    public void setUp() throws Exception {
        movie = new Movie();
    }

    @Test
    public void can_create_Movie() {
        new Movie();
    }

    @Test
    public void 한번도_rate_되지않으면_평균도_0() {
        assertThat(movie.getAverage(), is(0));
    }

    @Test
    public void 한번_rate_되었을때_평균은_rate와_같다() {
        Movie movie = new Movie();
        movie.rate(1);
        assertThat(movie.getAverage(),is(1));
    }

    @Test
    public void 두번_rate_되었을때_평균은_rate의_합을_count로_나눈값(){
        Movie movie = new Movie();
        movie.rate(1);
        movie.rate(3);
        assertThat(movie.getAverage(),is(2));
    }
}

