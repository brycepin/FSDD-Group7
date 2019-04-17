/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author CS
 */
public class War extends Game {
    public War() {
        super("War");
        
    }


public static void main(String[] args) {

    Game game = new Game("War");
    GroupOfCards cards = new GroupOfCards();
    
    ArrayList<Player> playerList = new ArrayList<>();
    
    Scanner input = new Scanner(System.in);
    
    //input player names
    System.out.println("Enter first player's name: ");
    String player1 = input.nextLine();
    Player p1 = new Player(player1);
    System.out.println("Enter second player's name: ");
    String player2 = input.nextLine();
    Player p2 = new Player(player2);
    
    //add players to arraylist
    playerList.add(p1);
    playerList.add(p2);
    System.out.println("Total players: " + playerList.size());
    
    game.setPlayers(playerList);
    
    //shuffle and deal the cards
    System.out.println("Dealing cards...");
    cards.generateHand();
    cards.shuffle();
    
    
    System.out.println("Player " + p1.getPlayerID() + " dealt: \n" + cards.dealHandOne());
    System.out.println("Player " + p2.getPlayerID() + " dealt: \n" + cards.dealHandTwo());
    
    
    //System.out.println(cards.showCards());
    
    
    
    
    
    /*
    
    
    // initialize deck
        String[] deck = new String[n];
        for (int i = 0; i < RANKS.length; i++) {
            for (int j = 0; j < SUITS.length; j++) {
                deck[SUITS.length*i + j] = RANKS[i] + " of " + SUITS[j];
            }
        }

        // shuffle
        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n-i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }

        // print shuffled deck
        for (int i = 0; i < PLAYERS * CARDS_PER_PLAYER; i++) {
            System.out.println(deck[i]);
            if (i % CARDS_PER_PLAYER == CARDS_PER_PLAYER - 1)
                System.out.println();
        }
        
        */
    
}
}