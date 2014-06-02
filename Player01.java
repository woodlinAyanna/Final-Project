import java.util.ArrayList;
public class Player01 {
  private String name;
  private int coins;
  static Deck playerDeck;
  int value;
  public Player01 (String aName) {
    name = aName;
    coins = 5000;
    playerDeck = new Deck();
  }
  
  public String getName() {
   return name; 
  }
  public int getCoins() {
    return coins;
  }
  

  
  
}