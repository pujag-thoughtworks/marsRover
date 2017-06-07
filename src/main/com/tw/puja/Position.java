package com.tw.puja;

/**
 * Created by pujag on 6/6/17.
 */
public class Position {

    private Plateau plateau;
    private int xCoordinate;
    private int yCoordinate;
    private Orientation orientation;

    Position(int x,int y,Orientation o,Plateau plateau) {
        this.plateau=plateau;
        if(x>plateau.getXCoordinateLimit() || y>plateau.getYCoordinateLimit())
            throw new IllegalArgumentException();
        xCoordinate=x;
        yCoordinate=y;
        orientation=o;
    }


    public boolean equals(Object obj) {
        Position position=(Position) obj;
        if(!(position instanceof Position))
            return false;
        return((xCoordinate==position.xCoordinate) && (yCoordinate==position.yCoordinate) && (orientation==position.orientation));
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public Orientation getOrientation() {
        return orientation;
    }
    public Plateau getPlateau() {
        return plateau;
    }
    public String toString() {
        String representation=xCoordinate + " " +yCoordinate+ " "+ orientation;
        return representation;
    }
}
