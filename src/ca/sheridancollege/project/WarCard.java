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
     * Method to check if the rank of this card is higher than another card.
     *
     * @param other The other card to compare with.
     * @return True if this card's rank is higher, false otherwise.
     */
    public boolean isHigherRank(WarCard other) {
        return this.rank.ordinal() > other.rank.ordinal();
    }

}
