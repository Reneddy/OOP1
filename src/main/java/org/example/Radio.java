package org.example;

public class Radio {
    private int stationsNumber=10;
    private int minStation=0;
    private int maxStation= stationsNumber-1;
    private int currentStation=minStation;
    private int minVolume=0;
    private int maxVolume=100;
    private int currentVolume=minVolume;

    public Radio(int stationsNumber, int minStation, int minVolume, int maxVolume) {
        this.stationsNumber=stationsNumber;
    }

    public int getStationsNumber() {
        return stationsNumber;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            currentVolume = minVolume;
        }
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
        this.currentVolume = currentVolume;
    }


    public void nextStation() {
        if (currentStation != maxStation) {
            currentStation++;
        } else {
            currentStation = minStation;
        }
    }

    public void prevStation() {
        if (currentStation != minStation) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public void turnUpTheVolume() {
        if (currentVolume != maxVolume) {
            currentVolume++;
        }
    }

    public void turnDownTheVolume() {
        if (currentVolume != minVolume) {
            currentVolume--;
        }
    }
}