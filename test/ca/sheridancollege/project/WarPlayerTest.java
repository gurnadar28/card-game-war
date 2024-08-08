/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class WarPlayerTest {

    public WarPlayerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getHand method, of class WarPlayer.
     */
//    @Test
//    public void testGetHand() {
//        System.out.println("getHand");
//        WarPlayer instance = null;
//        List<WarCard> expResult = null;
//        List<WarCard> result = instance.getHand();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of setHand method, of class WarPlayer.
     */
//    @Test
//    public void testSetHand() {
//        System.out.println("setHand");
//        List<WarCard> hand = null;
//        WarPlayer instance = null;
//        instance.setHand(hand);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of collectCards method, of class WarPlayer.
     */
//    @Test
//    public void testCollectCards() {
//        System.out.println("collectCards");
//        WarCard[] cards = null;
//        WarPlayer instance = null;
//        instance.collectCards(cards);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of hasCards method, of class WarPlayer.
     */
    @Test
    public void testHasCardsGood() {
        System.out.println("hasCards Good");
        List<WarCard> hand = Arrays.asList(new WarCard(Suit.HEARTS, Rank.ACE));
        boolean expResult = true;
        boolean result = WarPlayer.hasCards(hand);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    @Test
    public void testHasCardsBad() {
        System.out.println("hasCards Bad");
        List<WarCard> hand = new ArrayList<>();
        boolean expResult = false;
        boolean result = WarPlayer.hasCards(hand);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    @Test
    public void testHasCardsBoundary() {
        System.out.println("hasCards Boundary");
        List<WarCard> hand = new ArrayList<>();
        boolean expResult = false;
        boolean result = WarPlayer.hasCards(hand);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of play method, of class WarPlayer.
     */
//    @Test
//    public void testPlay() {
//        System.out.println("play");
//        WarPlayer instance = null;
//        instance.play();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
}
