package ru.netologu.javahwoopad.services;

public class Radio {
    private int currentVolume;
    private int currentWave;

    private int maxWave;

    public Radio() {
        maxWave = 9;

    }

    public Radio (int waveCount) {
        maxWave = waveCount - 1;

    }

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
        if (CurrentVolume > 100) {
            return;
        }
        currentVolume = CurrentVolume;
    }

    public void setCurrentWave(int CurrentWave) {
        if (CurrentWave < 0) {
            return;
        }
        if (CurrentWave > maxWave) {
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
        currentWave = maxWave;
    }

    public void setToMinWave() {
        currentWave = 0;
    }


    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume >= 100) {
            currentVolume = 100;
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
        if (currentWave < maxWave) {
            currentWave = currentWave + 1;
        } else {
            currentWave = 0;
        }


    }

    public void prevWave() {
        if (currentWave > 0) {
            currentWave = currentWave - 1;
        } else {
            currentWave = maxWave;
        }


    }


}
