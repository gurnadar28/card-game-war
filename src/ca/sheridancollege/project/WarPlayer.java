/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
/**
 * Class representing a player in the War game.
 */
public class WarPlayer extends Player {

    private List<WarCard> hand;

    public WarPlayer(String name) {
        super(name);
        hand = new ArrayList<>();
    }

    public List<WarCard> getHand() {
        return hand;
    }

    public void setHand(List<WarCard> hand) {
        this.hand = hand;
    }

    /**
     * Method to collect cards won in a round.
     *
     * @param cards The cards to be collected.
     */
    public void collectCards(WarCard... cards) {
        System.out.println(this.getName() + " collects cards:");
        for (WarCard card : cards) {
            System.out.println(card);
            hand.add(card);
        }
    }

    /**
     * Method to check if the player has cards left.
     *
     * @param hand
     * @return True if the player has cards, false otherwise.
     */
    public static boolean hasCards(List<WarCard> hand) {
        return !hand.isEmpty();
    }

    @Override
    public void play() {
        // Implement the player's turn logic here
    }
}
