/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author user
 */
/**
 * Class representing a card in the War game.
 */
public class WarCard extends Card {

    private final Suit suit;
    private final Rank rank;

    public WarCard() {
        this.suit = null;
        this.rank = null;
    }

    public WarCard(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }

    /**
     * Static method to check if the rank of the first card is higher than
     * another card.
     *
     * @param card1 The first card.
     * @param card2 The second card.
     * @return True if the first card's rank is higher, false otherwise.
     */
    public static boolean isHigherRank(WarCard card1, WarCard card2) {
        if (card1 == null || card2 == null || card1.getRank() == null || card2.getRank() == null) {
            return false;
        }
        return card1.getRank().ordinal() > card2.getRank().ordinal();
    }
}
