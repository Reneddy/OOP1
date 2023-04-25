package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Radio {
    private int stationsNumber = 10;
    private int minStation = 0;
    private int maxStation = stationsNumber - 1;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentStation;
    private int currentVolume;


    public Radio(int stationsNumber) {
        this.stationsNumber = stationsNumber;
        maxStation = stationsNumber - 1;
    }

    public void setStationsNumber(int stationsNumber) {
        if (stationsNumber == 0) {
            stationsNumber = 10;
        }
        this.stationsNumber = stationsNumber;
        this.maxStation = stationsNumber - 1;
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