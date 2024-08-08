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
public class WarCardTest {

    public WarCardTest() {
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
     * Test of getSuit method, of class WarCard.
     */
//    @Test
//    public void testGetSuit() {
//        System.out.println("getSuit");
//        WarCard instance = null;
//        Suit expResult = null;
//        Suit result = instance.getSuit();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of getRank method, of class WarCard.
     */
//    @Test
//    public void testGetRank() {
//        System.out.println("getRank");
//        WarCard instance = null;
//        Rank expResult = null;
//        Rank result = instance.getRank();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of toString method, of class WarCard.
     */
//    @Test
//    public void testToString() {
//        System.out.println("toString");
//        WarCard instance = null;
//        String expResult = "";
//        String result = instance.toString();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of isHigherRank method, of class WarCard.
     */
    @Test
    public void testIsHigherRankGood() {
        System.out.println("isHigherRank Good");
        WarCard card1 = new WarCard(Suit.HEARTS, Rank.ACE);
        WarCard card2 = new WarCard(Suit.SPADES, Rank.KING);
        boolean expResult = true; // card1 rank is higher than card2 rank
        boolean result = WarCard.isHigherRank(card1, card2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    @Test
    public void testIsHigherRankBad() {
        System.out.println("isHigherRank Bad");
        WarCard card1 = new WarCard(Suit.HEARTS, Rank.KING);
        WarCard card2 = new WarCard(Suit.SPADES, Rank.ACE);
        boolean expResult = false; // card1 rank is lower than card2 rank
        boolean result = WarCard.isHigherRank(card1, card2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    @Test
    public void testIsHigherRankBoundary() {
        System.out.println("isHigherRank Boundary");
        WarCard card1 = new WarCard();
        WarCard card2 = new WarCard();
        boolean expResult = false; // Both cards are simulated empty
        boolean result = WarCard.isHigherRank(card1, card2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

}
