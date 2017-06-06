import java.util.HashMap;
import java.util.Map;

/**
 * Created by pujag on 6/5/17.
 */
public class MarsRover {
    private int xCoordinate;
    private int yCoordinate;
    private char orientation;
    Map<OrientationDirectionPairs,Character> currentOrientationToNextOrientationMap;
    MarsRover(int xCoordinate,int yCoordinate, char orientation) {
        this.xCoordinate=xCoordinate;
        this.yCoordinate=yCoordinate;
        this.orientation=orientation;
        currentOrientationToNextOrientationMap=new HashMap<>();
        currentOrientationToNextOrientationMap.put(new OrientationDirectionPairs('N','R'),'E');
        currentOrientationToNextOrientationMap.put(new OrientationDirectionPairs('N','L'),'W');
        currentOrientationToNextOrientationMap.put(new OrientationDirectionPairs('S','R'),'W');
        currentOrientationToNextOrientationMap.put(new OrientationDirectionPairs('S','L'),'E');
        currentOrientationToNextOrientationMap.put(new OrientationDirectionPairs('E','R'),'S');
        currentOrientationToNextOrientationMap.put(new OrientationDirectionPairs('E','L'),'N');
        currentOrientationToNextOrientationMap.put(new OrientationDirectionPairs('W','R'),'N');
        currentOrientationToNextOrientationMap.put(new OrientationDirectionPairs('W','L'),'S');
    }


    public char changeOrientation(char direction) {
        System.out.println(currentOrientationToNextOrientationMap);
        OrientationDirectionPairs pair= new OrientationDirectionPairs(orientation,direction);
        System.out.println(pair);
        System.out.println(currentOrientationToNextOrientationMap.containsKey(pair));
         char newOrientation=currentOrientationToNextOrientationMap.get(pair);
         System.out.print(newOrientation);
        return  orientation;
    }
}
