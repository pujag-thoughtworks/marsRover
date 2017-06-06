package com.tw.puja;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsRoverTest {

    @Test
    public void rightOfNorthShouldBeEast() {
        MarsRover marsRover=new MarsRover(new Position(1,2,Orientation.N));
        assertEquals(Orientation.E,marsRover.changeOrientation('R'));
    }

  /*  @Test
    public void movingOneStepwhileFacingEastIncreasesXCoordinateByOne() {
        MarsRover marsRover=new MarsRover
    } */
}
