package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnswerCellTest {

    @Test
    public void testAnswerCell0() {
        assertEquals( true, AnswerCell.answerCall(false, false, false), "Expected value: true");
    }

    @Test
    public void testAnswerCell1() {
        assertEquals( false, AnswerCell.answerCall(false, false, true), "Expected value: false");
    }

    @Test
    public void testAnswerCell2() {
        assertEquals( false, AnswerCell.answerCall(true, false, false), "Expected value: false");
    }

    @Test
    public void testAnswerCell3() {
        assertEquals( true, AnswerCell.answerCall(true, true, false), "Expected value: true");
    }

    @Test
    public void testAnswerCell4() {
        assertEquals( true, AnswerCell.answerCall(false, true, false), "Expected value: true");
    }

    @Test
    public void testAnswerCell5() {
        assertEquals( false, AnswerCell.answerCall(true, true, true), "Expected value: false");
    }

}
