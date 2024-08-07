/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package ca.sheridancollege.project;

/**
 *
 * @author user
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Class representing the War game.
 */
public class WarGame extends Game {
    private WarDeck deck;
    private WarPlayer player1;
    private WarPlayer player2;
    private int roundNumber;

    public WarGame(String name, WarPlayer player1, WarPlayer player2) {
        super(name);
        this.player1 = player1;
        this.player2 = player2;
        this.deck = new WarDeck();
        this.roundNumber = 0;
    }

    @Override
    public void play() {
        deck.shuffle();
        List<WarCard> halfDeck = deck.dealHalf();
        player1.setHand(halfDeck);

        // Convert remaining cards to WarCard and assign to player2
        List<WarCard> remainingCards = new ArrayList<>();
        for (Card card : deck.getCards()) {
            remainingCards.add((WarCard) card);
        }
        player2.setHand(remainingCards);
        deck.getCards().clear();  // Clear the deck

        // Debugging information
        System.out.println("Deck size after dealing: " + deck.getCards().size());
        System.out.println("User initial hand size: " + player1.getHand().size());
        System.out.println("Computer initial hand size: " + player2.getHand().size());

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Welcome to the War card game!");
        System.out.println("You will play against the computer.");
        System.out.println("Press Enter to start the game.");
        scanner.nextLine();

        while (!player1.getHand().isEmpty() && !player2.getHand().isEmpty()) {
            if (roundNumber > 0) {
                System.out.println("Press Enter to play the next round...");
            } else {
                System.out.println("Press Enter to play the round...");
            }
            scanner.nextLine();
            playRound(scanner);
        }
        declareWinner();
    }

    private void playRound(Scanner scanner) {
        roundNumber++;

        System.out.println("Round " + roundNumber);

        WarCard card1 = getUserCard(scanner, player1);
        WarCard card2 = player2.getHand().remove(0);

        System.out.println(player1.getName() + " plays " + card1);
        System.out.println(player2.getName() + " plays " + card2);
        System.out.println();

        if (card1.isHigherRank(card2)) {
            System.out.println(player1.getName() + " wins the round.");
            player1.collectCards(card1, card2);
        } else if (card2.isHigherRank(card1)) {
            System.out.println(player2.getName() + " wins the round.");
            player2.collectCards(card1, card2);
        } else {
            System.out.println("It's a tie! War!");
            handleWar(card1, card2, scanner);
        }

        // Display round summary
        System.out.println();
        System.out.println("Round Summary:");
        System.out.println(player1.getName() + "'s score: " + player1.getHand().size());
        System.out.println(player2.getName() + "'s score: " + player2.getHand().size());
        System.out.println();
    }

    private WarCard getUserCard(Scanner scanner, WarPlayer player) {
        System.out.println(player.getName() + ", choose a card to play:");
        for (int i = 0; i < player.getHand().size(); i++) {
            System.out.println((i + 1) + ": " + player.getHand().get(i));
        }
        int choice;
        while (true) {
            System.out.print("Enter the number of the card you want to play: ");
            choice = scanner.nextInt() - 1;
            if (choice >= 0 && choice < player.getHand().size()) {
                break;
            }
            System.out.println("Invalid choice. Please try again.");
        }
        scanner.nextLine();  // Consume the newline left-over
        return player.getHand().remove(choice);
    }

    private void handleWar(WarCard card1, WarCard card2, Scanner scanner) {
        List<WarCard> warPile = new ArrayList<>();
        warPile.add(card1);
        warPile.add(card2);

        while (true) {
            if (player1.getHand().size() < 4) {
                player2.collectCards(warPile.toArray(new WarCard[0]));
                player2.collectCards(player1.getHand().toArray(new WarCard[0]));
                player1.getHand().clear();
                System.out.println(player2.getName() + " wins the war and the game!");
                return;
            }

            if (player2.getHand().size() < 4) {
                player1.collectCards(warPile.toArray(new WarCard[0]));
                player1.collectCards(player2.getHand().toArray(new WarCard[0]));
                player2.getHand().clear();
                System.out.println(player1.getName() + " wins the war and the game!");
                return;
            }

            // User places three cards face down
            System.out.println(player1.getName() + ", place three cards face down:");
            for (int i = 0; i < 3; i++) {
                WarCard faceDownCard = getUserCard(scanner, player1);
                warPile.add(faceDownCard);
                WarCard opponentFaceDownCard = player2.getHand().remove(0);
                warPile.add(opponentFaceDownCard);
            }

            WarCard warCard1 = getUserCard(scanner, player1);
            WarCard warCard2 = player2.getHand().remove(0);

            System.out.println();
            System.out.println(player1.getName() + " plays " + warCard1 + " in war");
            System.out.println(player2.getName() + " plays " + warCard2 + " in war");
            System.out.println();

            if (warCard1.isHigherRank(warCard2)) {
                System.out.println(player1.getName() + " wins the war.");
                player1.collectCards(warPile.toArray(new WarCard[0]));
                player1.collectCards(warCard1, warCard2);
                return;
            } else if (warCard2.isHigherRank(warCard1)) {
                System.out.println(player2.getName() + " wins the war.");
                player2.collectCards(warPile.toArray(new WarCard[0]));
                player2.collectCards(warCard1, warCard2);
                return;
            } else {
                System.out.println("The war is a tie! Continuing war...");
                warPile.add(warCard1);
                warPile.add(warCard2);
            }
        }
    }

    public boolean isTie(WarCard card1, WarCard card2) {
        return card1.getRank().ordinal() == card2.getRank().ordinal();
    }

    @Override
    public void declareWinner() {
        if (player1.getHand().isEmpty()) {
            System.out.println(player2.getName() + " wins the game!");
        } else {
            System.out.println(player1.getName() + " wins the game!");
        }
    }
}