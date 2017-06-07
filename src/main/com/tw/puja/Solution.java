package com.tw.puja;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.InputMismatchException;

/**
 * Created by pujag on 6/7/17.
 */
public class Solution {
    public static void main(String args[]) throws IOException {
        System.out.println("Enter coordinates to st plateau size");
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String Limit=bufferedReader.readLine();
        String[] limit=Limit.split("\\s");
        Plateau marsPlateau=new Plateau(Integer.valueOf(limit[0]),Integer.valueOf(limit[1]));
        HashMap<String,String> roverInitialPositionAndMovementInstruction=new HashMap<>();
        while(true) {
            String line=bufferedReader.readLine();
            if(line.length()==0)
                break;
            String initialPosition=line;
            String movementInstructions=bufferedReader.readLine();
            roverInitialPositionAndMovementInstruction.put(initialPosition,movementInstructions);
        }

        for(String initialPositionString: roverInitialPositionAndMovementInstruction.keySet()) {
            String[] positionString=initialPositionString.split("\\s");
            if(positionString.length<3)
                throw  new InputMismatchException();
            int xCoordinate=Integer.valueOf(positionString[0]);
            int yCoordinate=Integer.valueOf(positionString[1]);
            Orientation orientation=Orientation.getCharEquivalent(positionString[2].charAt(0));
            Position initialPosition=new Position(xCoordinate,yCoordinate,orientation,marsPlateau);
            MarsRover marsRover=new MarsRover(initialPosition);
            String movementInstruction=roverInitialPositionAndMovementInstruction.get(initialPositionString);
            Position finalPosition=marsRover.getFinalPosition(movementInstruction);
            System.out.println(finalPosition);
        }

          /*
           while(true) {
           String line=bufferedReader.readLine();
           if(line.length()==0)
               break;
           String[] positionString=line.split("\\s");
            if(positionString.length<3)
                throw  new InputMismatchException();
            int xCoordinate=Integer.valueOf(positionString[0]);
            int yCoordinate=Integer.valueOf(positionString[1]);
            Orientation orientation=Orientation.getCharEquivalent(positionString[2].charAt(0));
            Position initialPosition=new Position(xCoordinate,yCoordinate,orientation,marsPlateau);
            MarsRover marsRover=new MarsRover(initialPosition);
            String instructions=bufferedReader.readLine().trim();
            Position finalPosition=marsRover.getFinalPosition(instructions);
            System.out.println(finalPosition);
        } */

    }
}
