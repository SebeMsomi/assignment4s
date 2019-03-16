package nmj;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {
    Horse an = new Horse("Jelly",5);

    @Test
    public void getName() {
        an.getName();
    }

    @Test
    public void getAge() {
        an.getAge();
    }

    @Test
    public void sound() {
        an.sound();
    }


}