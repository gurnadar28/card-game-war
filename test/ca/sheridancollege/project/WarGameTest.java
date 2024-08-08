/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ca.sheridancollege.project;

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
public class WarGameTest {

    public WarGameTest() {
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
     * Test of play method, of class WarGame.
     */
//    @Test
//    public void testPlay() {
//        System.out.println("play");
//        WarGame instance = null;
//        instance.play();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of isTie method, of class WarGame.
     */
    @Test
    public void testIsTieGood() {
        System.out.println("isTie Good");
        WarCard card1 = new WarCard(Suit.HEARTS, Rank.ACE);
        WarCard card2 = new WarCard(Suit.SPADES, Rank.ACE);
        boolean expResult = true; // Both cards have the same rank
        boolean result = WarGame.isTie(card1, card2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    @Test
    public void testIsTieBad() {
        System.out.println("isTie Bad");
        WarCard card1 = new WarCard(Suit.HEARTS, Rank.ACE);
        WarCard card2 = new WarCard(Suit.CLUBS, Rank.KING);
        boolean expResult = false; // Cards have different ranks
        boolean result = WarGame.isTie(card1, card2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    @Test
    public void testIsTieBoundary() {
        System.out.println("isTie Boundary");
        WarCard card1 = new WarCard();
        WarCard card2 = new WarCard();
        boolean expResult = false;
        boolean result = WarGame.isTie(card1, card2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of declareWinner method, of class WarGame.
     */
//    @Test
//    public void testDeclareWinner() {
//        System.out.println("declareWinner");
//        WarGame instance = null;
//        instance.declareWinner();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
}
