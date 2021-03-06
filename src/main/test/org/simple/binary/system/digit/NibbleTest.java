package org.simple.binary.system.digit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.simple.binary.system.value.BinaryValue;
import org.simple.binary.system.value.NilValue;

public class NibbleTest {

    @Test
    public void testConstructor() {
        assertEquals(4, (new Nibble<BinaryValue>()).getValue().length);
    }

    @Test
    public void testConstructor2() {
        NilValue.NIL nil = new NilValue.NIL();
        NilValue.NIL nil1 = new NilValue.NIL();
        assertEquals(3, (new Nibble<BinaryValue>(nil, nil1, new NilValue.NIL())).getValue().length);
    }
}

