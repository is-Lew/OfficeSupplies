package com.nology;

import org.junit.Before;

import static org.junit.Assert.*;

public class SuppliesTest {

    private Supplies test;

    @Before
    public void setup() {
        this.test = new Supplies(1000, 200, 8000, 50, 300 );
    }


    @org.junit.Test
    public void remove258pens_checkQuantityLeft() {
        test.takePens(258);
        assertEquals(742, test.getPens(),0);
    }

    @org.junit.Test
    public void issue250StaffMember10Pens_howManyMorePensRequired() {
        test.takePens((250*10));
        String expectedMessage = "1500 more pens required";
        String actualMessage = test.insufficientPens((250*10));
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @org.junit.Test
    public void eachStaplerSupplied92Staples() {
        String expectedMessage = "More staples requires";
        String actualMessage = test.staplesToStaplersCheck(92);
       assertTrue(actualMessage.contains(expectedMessage));
    }

    @org.junit.Test
    public void misplaced63Rulers() {
        test.takeRulers(63);
        assertEquals(-1,test.takeRulers(63), 0);
    }


    @org.junit.Test
    public void newMembersOfStaff5pens1Stapler100Staples3Rulers4A4booklets_howManyCanBeHired() {
        assertEquals(80, test.howManyNewStaff(),0);

    }





}
