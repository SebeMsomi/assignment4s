package za.ac.cput.dip;

import org.junit.Test;

import static org.junit.Assert.*;

public class ElectricPowerSwitchTest {

    @Test
    public void testPress() throws Exception {
        Switchable switchableBulb=new LightBulb();
        Switch bulbPowerSwitch=new ElectricPowerSwitch((LightBulb) switchableBulb);
        bulbPowerSwitch.press();
        bulbPowerSwitch.press();

        Switchable switchableFan=new Fan();
        Switch fanPowerSwitch=new ElectricPowerSwitch((LightBulb) switchableFan);
        fanPowerSwitch.press();
        fanPowerSwitch.press();
    }

}