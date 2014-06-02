import java.util.ArrayList;
public class Deck {
  ArrayList<Card> deck;
  
  
  public Deck() {
    deck = new ArrayList<Card>(52);
    for( String s: Card.suits) {
      for(String r: Card.ranks) {
       deck.add(new Card(s,r));
      }
    }
  }
  
  public Card dealCard() {
    int randomCard = (int)(Math.random() * deck.size());
    return deck.get(randomCard);
  }
}