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

    public void collectCards(WarCard... cards) {
        System.out.println(this.getName() + " collects cards:");
        for (WarCard card : cards) {
            System.out.println(card);
            hand.add(card);
        }
    }

    public boolean hasCards() {
        return !hand.isEmpty();
    }

    @Override
    public void play() {
        // Implement the player's turn logic here
    }
}