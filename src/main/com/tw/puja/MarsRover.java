package com.tw.puja;

/**
 * Created by pujag on 6/5/17.
 */
public class MarsRover {
    private Position position;

    MarsRover(Position initialPosition) {
        position = initialPosition;
    }

    public Position getNextPosition(char c,Position currentPosition) {
        int xCoordinate = currentPosition.getXCoordinate();
        int yCoordinate = currentPosition.getYCoordinate();
        Orientation orientation = currentPosition.getOrientation();

        if (!(c == 'L' || c == 'R' || c == 'M'))
            throw new IllegalArgumentException();

        if (c == 'L')
            orientation = orientation.left;

        if (c == 'R')
            orientation = orientation.right;

        if (c == 'M') {

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
        return new Position(xCoordinate, yCoordinate, orientation);
    }

}




