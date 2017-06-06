package com.tw.puja;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by pujag on 6/5/17.
 */
public class MarsRover {
    private int xCoordinate;
    private int yCoordinate;
    private Orientation orientation;

    MarsRover(int x, int y, Orientation orientation) {
        xCoordinate=x;
        yCoordinate=y;
        this.orientation=orientation;
    }

    public void changeOrientation(char c) {
        if(!(c=='L' || c=='R'))
            throw new IllegalArgumentException();
        if(c=='L') {
            orientation = orientation.left;
            return;
        }
        orientation=orientation.right;
    }
     public Orientation getOrientation() {
        return orientation;
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




