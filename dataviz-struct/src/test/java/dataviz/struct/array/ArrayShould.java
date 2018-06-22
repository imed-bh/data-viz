package dataviz.struct.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ArrayShould {

    @Test public void
    wrap_java_array() {
        var array = new Array<>(new Integer[10]);
        assertThat(array.as().length, is(10));
    }
}
