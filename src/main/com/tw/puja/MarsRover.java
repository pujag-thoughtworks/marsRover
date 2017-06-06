package com.tw.puja;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by pujag on 6/5/17.
 */
public class MarsRover {
    Position position;

    MarsRover(Position initialPosition) {
        position=initialPosition;
    }

    public Orientation changeOrientation(char c) {
        Orientation currentOrientation=position.getOrientation();
        if(!(c=='L' || c=='R'))
            throw new IllegalArgumentException();
        if(c=='L')
            return currentOrientation.left;

        return currentOrientation.right;
    }


    /*public void calculateNextPosition() {
        switch (orientation) {
            case N: {
              yCoordinate++;
              break;
            }
            case S: {
                yCoordinate--;
                break;
            }
            case
        }
    } */

    }




