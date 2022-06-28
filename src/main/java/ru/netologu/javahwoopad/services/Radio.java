package ru.netologu.javahwoopad.services;

public class Radio {
    private int currentVolume;
    private int currentWave;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentWave() {
        return currentWave;
    }


    public void setCurrentVolume(int CurrentVolume) {
        if (CurrentVolume < 0) {
            return;
        }
        if (CurrentVolume > 10) {
            return;
        }
        currentVolume = CurrentVolume;
    }

    public void setCurrentWave(int CurrentWave) {
        if (CurrentWave < 0) {
            return;
        }
        if (CurrentWave > 9) {
            return;
        }
        currentWave = CurrentWave;
    }


    public void setToMaxVolume() {
        currentVolume = 10;
    }

    public void setToMinVolume() {
        currentVolume = 0;
    }

    public void setToMaxWave() {
        currentWave = 9;
    }

    public void setToMinWave() {
        currentWave = 0;
    }


    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume >= 10) {
            currentVolume = 10;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume <= 0) {
            currentVolume = 0;
        }
    }

    public void nextWave() {
        if (currentWave < 9) {
            currentWave = currentWave + 1;
        } else {
            currentWave = 0;
        }


    }

    public void prevWave() {
        if (currentWave > 0) {
            currentWave = currentWave - 1;
        } else {
            currentWave = 9;
        }


    }


}
