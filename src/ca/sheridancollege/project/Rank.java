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
public class Rank {
    
    public enum Ranks {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE,
        TEN, JACK, QUEEN, KING
    }
    
    private final Ranks rank;
    
    public Rank (Ranks r) {
        rank  = r;
        
    }
    
    
}
