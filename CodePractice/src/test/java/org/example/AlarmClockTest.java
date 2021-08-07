package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlarmClockTest {

    @Test
    public void testAlarmClock0() {
        assertEquals( "7:00", AlarmClock.alarmClock(1, false), "Expected value: 7:00");
    }

    @Test
    public void testAlarmClock1() {
        assertEquals( "7:00", AlarmClock.alarmClock(5, false), "Expected value: 7:00");
    }

    @Test
    public void testAlarmClock2() {
        assertEquals( "10:00", AlarmClock.alarmClock(0, false), "Expected value: 10:00");
    }

    @Test
    public void testAlarmClock3() {
        assertEquals( "10:00", AlarmClock.alarmClock(6, false), "Expected value: 10:00");
    }

    @Test
    public void testAlarmClock4() {
        assertEquals( "off", AlarmClock.alarmClock(0, true), "Expected value: off");
    }

    @Test
    public void testAlarmClock5() {
        assertEquals( "off", AlarmClock.alarmClock(6, true), "Expected value: off");
    }

    @Test
    public void testAlarmClock6() {
        assertEquals( "10:00", AlarmClock.alarmClock(1, true), "Expected value: 10:00");
    }

    @Test
    public void testAlarmClock7() {
        assertEquals( "10:00", AlarmClock.alarmClock(3, true), "Expected value: 10:00");
    }

    @Test
    public void testAlarmClock8() {
        assertEquals( "10:00", AlarmClock.alarmClock(5, true), "Expected value: 10:00");
    }
}
