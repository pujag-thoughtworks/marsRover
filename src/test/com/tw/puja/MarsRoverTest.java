package com.tw.puja;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsRoverTest {

    @Test
    public void rightOfNorthShouldBeEast() {
        Position position=new Position(1,2,Orientation.N);
        MarsRover marsRover=new MarsRover(position);
        Position nextPosition=marsRover.getNextPosition('R',position);
        assertEquals(Orientation.E,nextPosition.getOrientation());
    }

   @Test
    public void movingOneStepwhileFacingEastIncreasesXCoordinateByOne() {
        Position position=new Position(1,1,Orientation.E);
        MarsRover marsRover=new MarsRover(position);
        Position expectedPosition= new Position(2,1,Orientation.E);
        assertEquals(expectedPosition,marsRover.getNextPosition('M',position));
    }


}
