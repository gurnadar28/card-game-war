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
 * The main class to start the War game.
 */
public class Main {

    public static void main(String[] args) {

        WarPlayer player1 = new WarPlayer("User");
        WarPlayer player2 = new WarPlayer("Computer");
        WarGame game = new WarGame("War", player1, player2);
        game.play();
    }

}
