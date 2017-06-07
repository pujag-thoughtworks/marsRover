package com.tw.puja;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by pujag on 6/7/17.
 */
public class OrientationTest {
    @Test
    public void orientationShouldReturnValueCorrespondingToAChar(){
        char testChar='N';
        assertEquals(Orientation.N,Orientation.getCharEquivalent(testChar));
    }
    @Test(expected = IllegalArgumentException.class)
    public void orientationShouldTwrowExceptionWhileGettingCharEquivalentOfOutOfScopeValues() {
        Orientation.getCharEquivalent('C');
    }
}
