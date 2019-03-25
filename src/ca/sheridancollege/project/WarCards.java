package ca.sheridancollege.project;

import ca.sheridancollege.project.*;

public class WarCards extends Card {
    private Suit s;
    private Rank r;
    
    public WarCards(Suit s, Rank r) {
        this.s = s;
        this.r = r;
    }

    public Suit getS() {
        return s;
    }

    public Rank getR() {
        return r;
    }
    
    @Override
    public String toString() {
    return "Card Rank: " + r + " | " + "Suit: " + s;
    }
}