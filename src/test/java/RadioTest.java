import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    Radio radio = new Radio();
    Radio Radio = new Radio(15);

    @Test
    public void StationsNumberIsNotGiven() {
        radio.setStationsNumber(0);
        Assertions.assertEquals(10, radio.getStationsNumber());
    }

    @Test
    public void MaxStationWhenStationsNumberIsNotGiven() {
        radio.setStationsNumber(0);
        Assertions.assertEquals(9, radio.getMaxStation());
    }

    @Test
    public void ValidStation() {
        radio.setStationsNumber(0);
        radio.setCurrentStation(6);
        Assertions.assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void InvalidStation1() {
        radio.setCurrentStation(15);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void InvalidStation2() {
        radio.setCurrentStation(-9);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void LowerLimitStation1() {
        radio.setCurrentStation(radio.getMinStation() - 1);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void LowerLimitStation2() {
        radio.setCurrentStation(radio.getMinStation());
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void LowerLimitStation3() {
        radio.setCurrentStation(radio.getMinStation() + 1);
        Assertions.assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void UpperLimitStation1() {
        radio.setCurrentStation(radio.getMaxStation() - 1);
        Assertions.assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void UpperLimitStation2() {
        radio.setCurrentStation(radio.getMaxStation());
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void UpperLimitStation3() {
        radio.setCurrentStation(radio.getMaxStation() + 1);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }


    @Test
    public void NextStation() {
        radio.setCurrentStation(5);
        radio.nextStation();
        Assertions.assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void NextStationFrom_MinValue() {
        radio.setCurrentStation(radio.getMinStation());
        radio.nextStation();
        Assertions.assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void NextStationFrom_AfterMinValue() {
        radio.setCurrentStation(radio.getMinStation() + 1);
        radio.nextStation();
        Assertions.assertEquals(2, radio.getCurrentStation());
    }


    @Test
    public void NextStationFrom_BeforeMaxValue() {
        radio.setCurrentStation(radio.getMaxStation() - 1);
        radio.nextStation();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void NextStationFrom_MaxValue() {
        radio.setCurrentStation(radio.getMaxStation());
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
        radio.setCurrentStation(radio.getMinStation());
        radio.prevStation();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }


    @Test
    public void PrevStationFrom_AfterMinValue() {
        radio.setCurrentStation(radio.getMinStation() + 1);
        radio.prevStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }


    @Test
    public void PrevStationFrom_MaxValue() {
        radio.setCurrentStation(radio.getMaxStation());
        radio.prevStation();
        Assertions.assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void PrevStationFrom_BeforeMaxValue() {
        radio.setCurrentStation(radio.getMaxStation() - 1);
        radio.prevStation();
        Assertions.assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public void StationsNumberIsGiven() {
        Assertions.assertEquals(15, Radio.getStationsNumber());
    }

    @Test
    public void MaxStationWhenStationsNumberIsGiven() {
        Assertions.assertEquals(14, Radio.getMaxStation());
    }

    @Test
    public void ValidStation_WhenStationsNumberIsGiven() {
        Radio.setCurrentStation(10);
        Assertions.assertEquals(10, Radio.getCurrentStation());
    }

    @Test
    public void InvalidStation_WhenStationsNumberIsGiven_1() {
        Radio.setCurrentStation(16);
        Assertions.assertEquals(0, Radio.getCurrentStation());
    }

    @Test
    public void InvalidStation_WhenStationsNumberIsGiven_2() {
        radio.setCurrentStation(-9);
        Assertions.assertEquals(0, Radio.getCurrentStation());
    }

    @Test
    public void LowerLimitStation_WhenStationsNumberIsGiven_1() {
        radio.setCurrentStation(radio.getMinStation() - 1);
        Assertions.assertEquals(0, Radio.getCurrentStation());
    }

    @Test
    public void LowerLimitStation_WhenStationsNumberIsGiven_2() {
        Radio.setCurrentStation(Radio.getMinStation());
        Assertions.assertEquals(0, Radio.getCurrentStation());
    }

    @Test
    public void LowerLimitStation_WhenStationsNumberIsGiven_3() {
        Radio.setCurrentStation(Radio.getMinStation() + 1);
        Assertions.assertEquals(1, Radio.getCurrentStation());
    }

    @Test
    public void UpperLimitStation_WhenStationNumberIsGiven_1() {
        Radio.setCurrentStation(Radio.getMaxStation() - 1);
        Assertions.assertEquals(13, Radio.getCurrentStation());
    }

    @Test
    public void UpperLimitStation_WhenStationNumberIsGiven_2() {
        Radio.setCurrentStation(Radio.getMaxStation());
        Assertions.assertEquals(14, Radio.getCurrentStation());
    }

    @Test
    public void UpperLimitStation_WhenStationNumberIsGiven_3() {
        Radio.setCurrentStation(Radio.getMaxStation() + 1);
        Assertions.assertEquals(0, Radio.getCurrentStation());
    }

    @Test
    public void NextStationFrom_BeforeMaxValue_WhenStationsNumberIsGiven() {
        Radio.setCurrentStation(Radio.getMaxStation() - 1);
        Radio.nextStation();
        Assertions.assertEquals(14, Radio.getCurrentStation());
    }


    @Test
    public void NextStationFrom_MaxValue_WhenStationsNumberIsGiven() {
        Radio.setCurrentStation(Radio.getMaxStation());
        Radio.nextStation();
        Assertions.assertEquals(0, Radio.getCurrentStation());
    }

    @Test
    public void PrevStation_WhenStationsNumberIsGiven() {
        Radio.setCurrentStation(11);
        Radio.prevStation();
        Assertions.assertEquals(10, Radio.getCurrentStation());
    }

    @Test
    public void PrevStationFrom_MinValue_WhenStationsNumberIsGiven() {
        Radio.setCurrentStation(radio.getMinStation());
        Radio.prevStation();
        Assertions.assertEquals(14, Radio.getCurrentStation());
    }

    @Test
    public void PrevStationFrom_MaxValue_WhenStationsNumberIsGiven() {
        Radio.setCurrentStation(Radio.getMaxStation());
        Radio.prevStation();
        Assertions.assertEquals(13, Radio.getCurrentStation());
    }

    @Test
    public void PrevStationFrom_BeforeMaxValue_WhenStationsNumberIsGiven() {
        Radio.setCurrentStation(Radio.getMaxStation() - 1);
        Radio.prevStation();
        Assertions.assertEquals(12, Radio.getCurrentStation());
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
        radio.setCurrentVolume(radio.getMinVolume() - 1);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void LowerLimitVolume2() {
        radio.setCurrentVolume(radio.getMinVolume());
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void LowerLimitVolume3() {
        radio.setCurrentVolume(radio.getMinVolume() + 1);
        Assertions.assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void UpperLimitVolume1() {
        radio.setCurrentVolume(radio.getMaxVolume() - 1);
        Assertions.assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    public void UpperLimitVolume2() {
        radio.setCurrentVolume(radio.getMaxVolume());
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void UpperLimitVolume3() {
        radio.setCurrentVolume(radio.getMaxVolume() + 1);
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
        radio.setCurrentVolume(radio.getMinVolume());
        radio.turnUpTheVolume();
        Assertions.assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void TurnUpTheVolumeFrom_AfterMinValue() {
        radio.setCurrentVolume(radio.getMinVolume() + 1);
        radio.turnUpTheVolume();
        Assertions.assertEquals(2, radio.getCurrentVolume());
    }

    @Test
    public void TurnUpTheVolumeFrom_BeforeMaxValue() {
        radio.setCurrentVolume(radio.getMaxVolume() - 1);
        radio.turnUpTheVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void TurnUpTheVolumeFrom_MaxValue() {
        radio.setCurrentVolume(radio.getMaxVolume());
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
        radio.setCurrentVolume(radio.getMinVolume());
        radio.turnDownTheVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void TurnDownTheVolumeFrom_AfterMinValue() {
        radio.setCurrentVolume(radio.getMinVolume() + 1);
        radio.turnDownTheVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void TurnDownTheVolumeFrom_BeforeMaxValue() {
        radio.setCurrentVolume(radio.getMaxVolume() - 1);
        radio.turnDownTheVolume();
        Assertions.assertEquals(98, radio.getCurrentVolume());
    }

    @Test
    public void TurnDownTheVolumeFrom_MaxValue() {
        radio.setCurrentVolume(radio.getMaxVolume());
        radio.turnDownTheVolume();
        Assertions.assertEquals(99, radio.getCurrentVolume());
    }
}