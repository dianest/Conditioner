package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    void setCurrentTemperatureMoreThenMax(){
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(-10);
        conditioner.setCurrentTemperature(31);
        assertEquals(0,conditioner.getCurrentTemperature());
    }

    @Test
    void setCurrentTemperatureLessThenMin(){
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(-10);
        conditioner.setCurrentTemperature(-11);
        assertEquals(0,conditioner.getCurrentTemperature());
    }

    @Test
    void setCurrentTemperatureInsideRange(){
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(-10);
        conditioner.setCurrentTemperature(15);
        assertEquals(15,conditioner.getCurrentTemperature());
    }

    @Test
    void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(-10);
        conditioner.setCurrentTemperature(15);
        conditioner.increaseCurrentTemperature();
        assertEquals(16, conditioner.getCurrentTemperature());
    }

    @Test
    void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(-10);
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(29);
        conditioner.decreaseCurrentTemperature();
        assertEquals(28, conditioner.getCurrentTemperature());
    }

    @Test
    void maxCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(-10);
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(30);
        conditioner.increaseCurrentTemperature();
        assertEquals(30, conditioner.getCurrentTemperature());
    }

    @Test
    void minCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(-10);
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(-10);
        conditioner.decreaseCurrentTemperature();
        assertEquals(-10, conditioner.getCurrentTemperature());
    }
}