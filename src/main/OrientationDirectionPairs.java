/**
 * Created by pujag on 6/5/17.
 */
public class OrientationDirectionPairs {
    private char currentOrientation;
    private char givenDirection;

    OrientationDirectionPairs(char currentOrientation, char givenDirection) {
        this.currentOrientation=currentOrientation;
        this.givenDirection=givenDirection;
    }
    public boolean equals(Object obj) {
        OrientationDirectionPairs pair=(OrientationDirectionPairs)obj;
        return(currentOrientation==pair.currentOrientation && givenDirection==pair.givenDirection);
    }
    public String toString() {
        return "" +currentOrientation + givenDirection;
    }
}
