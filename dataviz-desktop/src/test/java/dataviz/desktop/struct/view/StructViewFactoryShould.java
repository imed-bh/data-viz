package dataviz.desktop.struct.view;

import dataviz.struct.array.Array;
import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StructViewFactoryShould {

    private StructViewFactory factory;

    @Before
    public void setUp() {
        factory = new StructViewFactory();
    }

    @Test public void
    return_empty_for_null_struct() {
        assertThat(factory.get(null), is(Optional.empty()));
    }

    @Test public void
    return_empty_when_struct_type_is_not_registered() {
        assertThat(factory.get(makeArray()), is(Optional.empty()));
    }

    @Test public void
    return_view_registered_for_given_struct_type() {
        factory.register(Array.class, t -> new TestView());

        assertThat(factory.get(makeArray()).get(), is(instanceOf(TestView.class)));
    }

    private Array<Integer> makeArray() {
        return new Array<>(new Integer[10]);
    }

    private class TestView implements StructView {}
}
