package com.tw.puja;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by pujag on 6/6/17.
 */
public class PositionTest {
    Plateau plateau=new Plateau(5,5);
    @Test
    public void shouldReturnProperCorrespondingCoordinatesWhenAskedFor() {
        Position position=new Position(2,3,Orientation.E,plateau);
        assertEquals(2,position.getXCoordinate());
        assertEquals(3,position.getYCoordinate());
        assertEquals(Orientation.E,position.getOrientation());
    }

    @Test
    public void  positionsWithEqualCoordinateAndOrientationShouldBeEqualForSamePlateau() {
        Position p1=new Position(1,2,Orientation.N,plateau);
        Position p2=new Position(1,2,Orientation.N,plateau);
        assertEquals(p1,p2);
    }

    @Test
    public void positionRepresentationShouldBeStringOfItsCoordinatesAndOrientaion() {
        Position position=new Position(4,5,Orientation.W,plateau);
        String expectedRepresentation=4 +" " +5 +" " +Orientation.W;
        String actualRepresentation=position.toString();
        assertEquals(expectedRepresentation,actualRepresentation);
    }
    @Test(expected = IllegalArgumentException.class)
    public void positionCoordinatesCantBeMoreThanPlateauCoordinates() {
        Plateau plt=new Plateau(8,8);
        Position pos=new Position(9,9,Orientation.E,plt);
    }
}
