 public class Card {
    static String rank;
    static String suit;
    
    static String[] suits = {"Hearts", "Spades", "Diamonds", "Clubs"};
    static String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    
    Card (String aSuit, String aRank) {
      rank = aRank;
      suit = aSuit;
    }
    
    public @Override String toString(){
    return rank + " of " + suit;
 }
    
  }