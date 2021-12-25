package src.list.arraylist;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


import static org.junit.Assert.*;

public class CheckerAhdGetterTest {
    @Test
    public void whenGetNUll() {
        List<String> list = new ArrayList<String>();
        String rsl = CheckerAhdGetter.getElement(list);
        String expected = " ";
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenGetFirsElement() {
        List<String> list = new ArrayList<String>();
        list.add("first");
        list.add("second");
        list.add("third");
        String rsl = CheckerAhdGetter.getElement(list);
        String expected = "first";
        assertThat(rsl, is(expected));
    }
}