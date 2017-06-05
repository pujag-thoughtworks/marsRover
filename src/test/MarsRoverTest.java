import org.junit.Test;

public class MarsRoverTest {

    @Test
    public void RightOfNorthShouldBeEast() {
        MarsRover marsRover=new MarsRover(1,2,'N');
        marsRover.changeOrientation('R');
    }
}
