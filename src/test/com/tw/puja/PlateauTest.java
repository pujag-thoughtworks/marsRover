package com.tw.puja;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by pujag on 6/7/17.
 */
public class PlateauTest {
    @Test
    public void shouldReturnCorrectPlateauXCooreinateLimit() {
        Plateau pltu=new Plateau(5,6);
        assertEquals(5,pltu.getXCoordinateLimit());
    }

    @Test
    public void shouldReturnCorrectPlateauYCooreinateLimit() {
        Plateau pltu=new Plateau(5,6);
        assertEquals(6,pltu.getYCoordinateLimit());
    }


}
