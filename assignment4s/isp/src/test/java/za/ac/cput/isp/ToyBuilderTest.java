package za.ac.cput.isp;

import org.junit.Test;

import static org.junit.Assert.*;

public class ToyBuilderTest {
    @Test
    public void testBuildToyHouse() throws Exception {
        ToyHouse toyHouse=ToyBuilder.buildToyHouse();
        System.out.println(toyHouse);
    }
}