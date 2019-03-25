/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 *
 * @author CS
 */
public class Suit {
    public enum Suits {
        SPADES, HEART, CLUBS, DIAMOND
    }
    
    private final Suits suit;
    
    public Suit (Suits s) {
        suit = s;
    }

    public Suits getSuit() {
        return suit;
    }
    
    
}
