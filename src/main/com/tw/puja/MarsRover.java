package com.tw.puja;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by pujag on 6/5/17.
 */
public class MarsRover {
    private Position position;
     int xCoordinate=position.getXCoordinate();
     int yCoordinate=position.getYCoordinate();
      Orientation orientation=position.getOrientation();


    MarsRover(Position initialPosition) {
        position=initialPosition;
    }

    public void changeOrientation(char c) {
        if(!(c=='L' || c=='R'))
            throw new IllegalArgumentException();
        if(c=='L') {
            orientation= orientation.left;
            return; }

        orientation=orientation.right;
    }

    public void moveForward() {
        switch (orientation) {
            case N: {
                yCoordinate++;
                break;
            }
            case S: {
                yCoordinate--;
                break;
            }
            case E: {
                xCoordinate++;
                break;
            }
            case W: {
                xCoordinate--;
                break;
            }
        }

    }


    public Position getFinalPosition() {
        return new Position(xCoordinate,yCoordinate,orientation);
    }
}




