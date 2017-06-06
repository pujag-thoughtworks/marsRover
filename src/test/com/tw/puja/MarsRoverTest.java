package com.tw.puja;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsRoverTest {

    @Test
    public void rightOfNorthShouldBeEast() {
        MarsRover marsRover=new MarsRover(1,2,Orientation.N);
        marsRover.changeOrientation('R');
        assertEquals(Orientation.E,marsRover.getOrientation());
    }
}
