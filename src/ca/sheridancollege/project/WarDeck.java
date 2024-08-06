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
public class WarDeck extends GroupOfCards {

    public WarDeck() {
        super(52);
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                getCards().add(new WarCard(suit, rank));
            }
        }
    }

    /**
     * Deals half the deck to a player.
     *
     * @return a list of WarCard objects representing half the deck.
     */
    public List<WarCard> dealHalf() {
        List<WarCard> halfDeck = new ArrayList<>();
        int halfSize = getCards().size() / 2;
        for (int i = 0; i < halfSize; i++) {
            halfDeck.add((WarCard) getCards().remove(0));
        }
        return halfDeck;
    }
}
