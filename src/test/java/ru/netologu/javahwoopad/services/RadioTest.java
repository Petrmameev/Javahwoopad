package ru.netologu.javahwoopad.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(5);
        int expected = 5;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolume() {
        Radio rad = new Radio();
        rad.setToMaxVolume();
        int expected = 10;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinVolume() {
        Radio rad = new Radio();
        rad.setToMinVolume();
        int expected = 0;
        int actual = rad.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(120);
        int expected = 0;
        int actual = rad.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelowMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-5);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(5);
        rad.increaseVolume();
        int expected = 6;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        rad.increaseVolume();
        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(5);
        rad.reduceVolume();
        int expected = 4;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotReduceVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-5);
        rad.reduceVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetWave() {
        Radio rad = new Radio(20);
        rad.setCurrentWave(15);
        int expected = 15;
        int actual = rad.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetWaveBelowMin() {
        Radio rad = new Radio();
        rad.setCurrentWave(-5);
        int expected = 0;
        int actual = rad.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetWaveAboveMax() {
        Radio rad = new Radio();
        rad.setCurrentWave(20);
        int expected = 0;
        int actual = rad.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextWaveAfterMaxWave() {
        Radio rad = new Radio();
        rad.setCurrentWave(9);
        rad.nextWave();
        int expected = 0;
        int actual = rad.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextWave() {
        Radio rad = new Radio();
        rad.setCurrentWave(8);
        rad.nextWave();
        int expected = 9;
        int actual = rad.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetNextWave() {
        Radio rad = new Radio();
        rad.setCurrentWave(9);
        rad.nextWave();
        int expected = 0;
        int actual = rad.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevWave() {
        Radio rad = new Radio();
        rad.setCurrentWave(1);
        rad.prevWave();
        int expected = 0;
        int actual = rad.getCurrentWave();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetPrevAfterMinWave() {
        Radio rad = new Radio();
        rad.setCurrentWave(0);
        rad.prevWave();
        int expected = 9;
        int actual = rad.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinWave() {
        Radio rad = new Radio();
        rad.setToMinWave();
        int expected = 0;
        int actual = rad.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxWave() {
        Radio rad = new Radio();
        rad.setToMaxWave();
        int expected = 9;
        int actual = rad.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

}
