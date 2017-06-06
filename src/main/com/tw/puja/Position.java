package com.tw.puja;

/**
 * Created by pujag on 6/6/17.
 */
public class Position {
    private int xCoordinate;
    private int yCoordinate;
    private Orientation orientation;

    Position(int x,int y,Orientation o) {
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
}
