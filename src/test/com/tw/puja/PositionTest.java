package com.tw.puja;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by pujag on 6/6/17.
 */
public class PositionTest {
    @Test
    public void shouldReturnProperCorrespondingCoordinatesWhenAskedFor() {
        Position position=new Position(2,3,Orientation.E);
        assertEquals(2,position.getXCoordinate());
        assertEquals(3,position.getYCoordinate());
        assertEquals(Orientation.E,position.getOrientation());
    }

    @Test
    public void  positionsWithEqualCoordinateAndOrientationShouldBeEqual() {
        Position p1=new Position(1,2,Orientation.N);
        Position p2=new Position(1,2,Orientation.N);
        assertEquals(p1,p2);
    }
}