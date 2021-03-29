package by.me.service;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class NodeBuilderTest {

    @Test
    public void build() {
    }

    @Test
    public void parseName() {
        //Given
        String input = "<number>1231234</number><name>Neo</name>";
        int start = 24;
        NodeBuilder nb = new NodeBuilder();
        //When
        String result = nb.parseName(input, start);
        //Then
        assertEquals("name", result);
    }

    @Test
    public void parseAttributes() {
        //Given
        String string =
                "<number id=\"12321\" potential='to say \"HIGH\" is to say nothing'>1231234</number><name>Neo</name>";
        int start = 0;
        int finish = 63;
//        System.out.println(string.substring(start, finish) + "|");
        NodeBuilder nb = new NodeBuilder();
        Map<String, String> expected = new HashMap<>();
        expected.put("id", "12321");
        expected.put("potential", "to say \"HIGH\" is to say nothing");
        //When
        Map<String, String> result = nb.parseAttributes(string, start, finish);

        //Then
        assertEquals(expected, result);
    }
}