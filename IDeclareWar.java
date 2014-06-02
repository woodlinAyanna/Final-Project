import java.util.Scanner;
public class IDeclareWar {
   public static void main(String[] args)  {
   Scanner input =new Scanner(System.in);
   System.out.println("I DECLARE WAR & WANT TO RISK IT ALL");
   System.out.println("********************************");
   System.out.print("Player 1, Enter your name: ");
   String playerOne = input.next();
   System.out.print("Player 2, Enter your name: ");
   String playerTwo = input.next();
   
   //Creates players
   Player01 player01 = new Player01(playerOne);
   Player02 player02 = new Player02(playerTwo);
   //gets the players coins
   int player01Coins = player01.getCoins();
   int player02Coins = player02.getCoins();
   
   while((player01Coins > 0 && player02Coins > 0)) {
   System.out.println("Name \t Coins");
   System.out.println(player01.getName() + "\t " + player01.getCoins());
   System.out.println(player02.getName() + "\t " + player02.getCoins());
   
   //Amount of coins risked
   System.out.print(player01.getName() + ", Enter amount of coins to risk: " );
   int risked01 = input.nextInt();
   System.out.print(player02.getName() + ", Enter amount of coins to risk: " );
   int risked02 = input.nextInt();
   
   //Randomly Selects Card from deck
   System.out.println(player01.getName() + "'s Card");
   System.out.println(player01.playerDeck.dealCard());
   System.out.println(player02.getName() + "'s Card");
   System.out.println(player02.playerDeck.dealCard());
   }  
   }
}