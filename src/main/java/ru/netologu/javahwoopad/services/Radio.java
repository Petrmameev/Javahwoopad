package ru.netologu.javahwoopad.services;

public class Radio {
    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setToMaxVolume() {
        currentVolume = 10;
    }

    public void setToMinVolume() {
        currentVolume = 0;
    }

    public int currentWave;

    public int getCurrentWave() {
        return currentWave;
    }

    public void nextWave() {
        if (currentWave < 9) {
            currentWave = currentWave + 1;
        }
        if (currentWave == 9) {
            currentWave = 0;
        }
    }

    public void prevWave() {
        if (currentWave > 0) {
            currentWave = currentWave - 1;
        }
        if (currentWave == 0) {
            currentWave = 9;
        }
    }

    public void setCurrentWave(int newCurrentWave) {
        if (newCurrentWave > 9) {
            return;
        }
        if (newCurrentWave < 0) {
            return;
        }
        currentWave = newCurrentWave;
    }

    public void setToMaxWave() {
        currentWave = 9;
    }

    public void setToMinWave() {
        currentWave = 0;
    }
}
