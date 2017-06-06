import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by pujag on 6/6/17.
 */
public class OrientationDirectionPairsTest {
    @Test
    public void pairsWithSameValuesShouldBeEqual() {
        OrientationDirectionPairs pairs=new OrientationDirectionPairs('N','R');
        OrientationDirectionPairs pairs2=new OrientationDirectionPairs('N','R');
        assertEquals(pairs,pairs2);
    }
}
