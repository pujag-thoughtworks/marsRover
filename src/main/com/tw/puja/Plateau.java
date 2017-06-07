package com.tw.puja;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by pujag on 6/7/17.
 */
public class Plateau {
    private  int xCoordinateLimit;
    private  int yCoordinateLimit;

    Plateau(int x, int y) {
        xCoordinateLimit=x;
        yCoordinateLimit=y;
    }

    public  int getXCoordinateLimit() {
        return xCoordinateLimit;
    }

    public  int getYCoordinateLimit() {
        return yCoordinateLimit;
    }

}
