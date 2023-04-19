import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio(10, 0, 9, 6, 0, 100, 55);

    @Test
    public void StationsNumber() {
        radio.getStationsNumber();
        Assertions.assertEquals(10, radio.getStationsNumber());
    }

    @Test
    public void ValidStation() {
        radio.setCurrentStation(6);
        Assertions.assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void InvalidStation1() {
        radio.setCurrentStation(15);
        Assertions.assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void InvalidStation2() {
        radio.setCurrentStation(-9);
        Assertions.assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void LowerLimitStation1() {
        radio.setCurrentStation(-1);
        Assertions.assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void LowerLimitStation2() {
        radio.setCurrentStation(0);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void LowerLimitStation3() {
        radio.setCurrentStation(1);
        Assertions.assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void UpperLimitStation1() {
        radio.setCurrentStation(8);
        Assertions.assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void UpperLimitStation2() {
        radio.setCurrentStation(9);
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void UpperLimitStation3() {
        radio.setCurrentStation(10);
        Assertions.assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void NextStation() {
        radio.setCurrentStation(5);
        radio.nextStation();
        Assertions.assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void NextStationFrom_MinValue() {
        radio.setCurrentStation(0);
        radio.nextStation();
        Assertions.assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void NextStationFrom_AfterMinValue() {
        radio.setCurrentStation(1);
        radio.nextStation();
        Assertions.assertEquals(2, radio.getCurrentStation());
    }


    @Test
    public void NextStationFrom_BeforeMaxValue() {
        radio.setCurrentStation(8);
        radio.nextStation();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void NextStationFrom_MaxValue() {
        radio.setCurrentStation(9);
        radio.nextStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void PrevStation() {
        radio.setCurrentStation(5);
        radio.prevStation();
        Assertions.assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void PrevStationFrom_MinValue() {
        radio.setCurrentStation(0);
        radio.prevStation();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }


    @Test
    public void PrevStationFrom_AfterMinValue() {
        radio.setCurrentStation(1);
        radio.prevStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void PrevStationFrom_MaxValue() {
        radio.setCurrentStation(9);
        radio.prevStation();
        Assertions.assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void PrevStationFrom_BeforeMaxValue() {
        radio.setCurrentStation(8);
        radio.prevStation();
        Assertions.assertEquals(7, radio.getCurrentStation());
    }


    @Test
    public void ValidVolume() {
        radio.setCurrentVolume(55);
        Assertions.assertEquals(55, radio.getCurrentVolume());
    }

    @Test
    public void InValidVolume1() {
        radio.setCurrentVolume(105);
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void InValidVolume2() {
        radio.setCurrentVolume(-5);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void LowerLimitVolume1() {
        radio.setCurrentVolume(-1);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void LowerLimitVolume2() {
        radio.setCurrentVolume(0);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void LowerLimitVolume3() {
        radio.setCurrentVolume(1);
        Assertions.assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void UpperLimitVolume1() {
        radio.setCurrentVolume(99);
        Assertions.assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    public void UpperLimitVolume2() {
        radio.setCurrentVolume(100);
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void UpperLimitVolume3() {
        radio.setCurrentVolume(101);
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void TurnUpTheVolume() {
        radio.setCurrentVolume(55);
        radio.turnUpTheVolume();
        Assertions.assertEquals(56, radio.getCurrentVolume());
    }

    @Test
    public void TurnUpTheVolumeFrom_MinValue() {
        radio.setCurrentVolume(0);
        radio.turnUpTheVolume();
        Assertions.assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void TurnUpTheVolumeFrom_AfterMinValue() {
        radio.setCurrentVolume(1);
        radio.turnUpTheVolume();
        Assertions.assertEquals(2, radio.getCurrentVolume());
    }

    @Test
    public void TurnUpTheVolumeFrom_BeforeMaxValue() {
        radio.setCurrentVolume(99);
        radio.turnUpTheVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void TurnUpTheVolumeFrom_MaxValue() {
        radio.setCurrentVolume(100);
        radio.turnUpTheVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void TurnDownTheVolume() {
        radio.setCurrentVolume(55);
        radio.turnDownTheVolume();
        Assertions.assertEquals(54, radio.getCurrentVolume());
    }

    @Test
    public void TurnDownTheVolumeFrom_MinValue() {
        radio.setCurrentVolume(0);
        radio.turnDownTheVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void TurnDownTheVolumeFrom_AfterMinValue() {
        radio.setCurrentVolume(1);
        radio.turnDownTheVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void TurnDownTheVolumeFrom_BeforeMaxValue() {
        radio.setCurrentVolume(99);
        radio.turnDownTheVolume();
        Assertions.assertEquals(98, radio.getCurrentVolume());
    }

    @Test
    public void TurnDownTheVolumeFrom_MaxValue() {
        radio.setCurrentVolume(100);
        radio.turnDownTheVolume();
        Assertions.assertEquals(99, radio.getCurrentVolume());
    }

}