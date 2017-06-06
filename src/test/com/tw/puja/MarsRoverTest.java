package com.tw.puja;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsRoverTest {

    @Test
    public void rightOfNorthShouldBeEast() {
        MarsRover marsRover=new MarsRover(new Position(1,2,Orientation.N));
        marsRover.changeOrientation('R');
        Position finalPosition=marsRover.getFinalPosition();
        assertEquals(Orientation.E,finalPosition.getOrientation());
    }

   @Test
    public void movingOneStepwhileFacingEastIncreasesXCoordinateByOne() {
        MarsRover marsRover=new MarsRover(new Position(1,1,Orientation.E));
        Position expectedPosition= new Position(2,1,Orientation.E);
        marsRover.moveForward();
        assertEquals(expectedPosition,marsRover.getFinalPosition());
    }
}
