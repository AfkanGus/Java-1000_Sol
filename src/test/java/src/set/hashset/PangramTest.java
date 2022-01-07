package src.set.hashset;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PangramTest {
    @Test
    public void checkString() {
            String str = "Jackdaws love my big sphinx of quartz";
            boolean b = Pangram.checkString(str);
            assertThat(b, is(true));

        }
    }