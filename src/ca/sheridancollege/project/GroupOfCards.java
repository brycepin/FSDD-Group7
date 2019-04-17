/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game.
 * HINT, you might want to subclass this more than once.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 * @author dancye
 * @modifier Jingwei Sun, 2019
 */
public class GroupOfCards 
{
   
    //The group of cards, stored in an ArrayList
    private ArrayList <Card> cards;
    private int size = 52;//the size of the grouping
    private Card[] card = new Card[size];
    
    private ArrayList<Card> deal1;
    private ArrayList<Card> deal2;
    
    public GroupOfCards()
    {
       
    }
    
    /**
     * A method that will get the group of cards as an ArrayList
     * @return the group of cards.
     */
    public ArrayList<Card> showCards()
    {
        return cards;
    }
    
    public void shuffle()
    {
       Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param givenSize the max size for the group of cards
     */
    public void setSize(int givenSize) {
        size = givenSize;
    }
    
    public void generateHand() {
    
        cards = new ArrayList<>();

        int count = 0;

        for (Card.Suits s : Card.Suits.values()) {
            for (Card.Ranks r : Card.Ranks.values()) {

                cards.add(new Card(s, r));
                
                count++;
                
            }
        }
        
    }
    
    
    public ArrayList<Card> dealHandOne() {
        ArrayList<Card> deal1 = new ArrayList<>();
        
        for (int i = 0; i < cards.size(); i+=2) {
            deal1.add(cards.get(i));
        }
        
      return deal1;
    }
    
     public ArrayList<Card> dealHandTwo() {
        ArrayList<Card> deal2 = new ArrayList<>();
        
        for (int i = 1; i < cards.size(); i+=2) {
            deal2.add(cards.get(i));
        }
        
      return deal2;
    }
   
	
}//end class
