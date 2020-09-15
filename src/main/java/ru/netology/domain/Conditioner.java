package ru.netology.domain;

public class Conditioner {
    private String name;
    private int maxTemperature;
    private int minTemperature;
    private int currentTemperature;
    private boolean on;

    public void increaseCurrentTemperature(){
        if (currentTemperature < maxTemperature){
            ++currentTemperature;
        }
    }

    public void decreaseCurrentTemperature(){
        if (currentTemperature > minTemperature){
            --currentTemperature;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
        //this.name = name;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        if (currentTemperature > maxTemperature){
            return;
        }
        if (currentTemperature < minTemperature){
            return;
        }
        this.currentTemperature = currentTemperature;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }
}

