package com.tw.puja;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsRoverTest {

        Plateau plateau=new Plateau(5,5);

    @Test
    public void rightOfNorthShouldBeEast() {
        Position position=new Position(1,2,Orientation.N, plateau);
        MarsRover marsRover=new MarsRover(position);
        Position nextPosition=marsRover.getNextPosition('R',position);
        assertEquals(Orientation.E,nextPosition.getOrientation());
    }

   @Test
    public void movingOneStepwhileFacingEastIncreasesXCoordinateByOne() {
        Position position=new Position(1,1,Orientation.E,plateau);
        MarsRover marsRover=new MarsRover(position);
        Position expectedPosition= new Position(2,1,Orientation.E,plateau);
        assertEquals(expectedPosition,marsRover.getNextPosition('M',position));
    }
    @Test
    public void shouldPointToCorrectLocationWhenASeriesOfInstructionsArePased() {
        Position position=new Position(3,3,Orientation.E,plateau);
        String inputString="MMRMMRMRRM";
        MarsRover marsRover=new MarsRover(position);
        Position expectedPosition= new Position(5,1,Orientation.E,plateau);
        assertEquals(expectedPosition,marsRover.getFinalPosition(inputString));

    }

}
