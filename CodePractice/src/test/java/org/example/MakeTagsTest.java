package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MakeTagsTest {
    @Test
    public void testMakeTags() {
        assertEquals("<i>Yay</i>", MakeTags.makeTags("i", "Yay"), "Expected value: <i>Yay</i>" );
    }

    @Test
    public void testMakeTags1() {
        assertEquals("<i>Hello</i>", MakeTags.makeTags("i", "Hello"), "Expected value: <i>Hello</i>" );
    }

    @Test
    public void testMakeTags2() {
        assertEquals("<city>Yay</city>", MakeTags.makeTags("city", "Yay"), "Expected value: <city>Yay</city>" );
    }

    @Test
    public void testMakeTags3() {
        assertEquals("<address>here</address>", MakeTags.makeTags("address", "here"), "Expected value: <address>here</address>" );
    }

    @Test
    public void testMakeTags4() {
        assertEquals("<body>Heart</body>", MakeTags.makeTags("body", "Heart"), "Expected value: <body>Heart</body>" );
    }


    @Test
    public void testMakeTags5() {
        assertEquals("<i>i</i>", MakeTags.makeTags("i", "i"), "Expected value: <i>i</i>" );
    }
    @Test
    public void testMakeTags6() {
        assertEquals("<i></i>", MakeTags.makeTags("i", ""), "Expected value: <i></i>" );
    }

}
