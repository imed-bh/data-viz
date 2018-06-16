package dataviz.struct;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DummyShould {

    @Test public void
    do_nothing() {
        assertThat(new Dummy().doNothing(), is(true));
    }
}
