import java.util.ArrayList;

public class Coin {

  private double myValue;
  private String myName;

  public Coin(double value, String name) {
    myValue = value;
    myName = name;
  }

  public double getValue() {
    return myValue;
  }

  public String getName() {
    return myName;
  }

  // returns true if this coin is equal to aCoin,
  // which means the name and the value are both equal
  public boolean equals(Coin aCoin) {
    return (aCoin.getName().equals(this.getName())) && (aCoin.getValue() == this.myValue);
  }
  }

  // A Purse holds a collection of Coins
  class Purse {
  private ArrayList<Coin> coins;

    public Purse() {}

    // adds aCoin to the purse
    public void add(Coin aCoin) {
    coins.add(aCoin);
    }

    // returns total value of all coins in purse
    public double getTotal() {
      double total = 0;
      for (int i = 0; i < coins.size(); i++) {
        total+= coins.get(i).getValue();
      }
      return total;
    }

    // returns the number of coins in the Purse that matches aCoin
    // (both myName & myValue)
    public int count(Coin aCoin) {
      int count = 0;
      for (int i = 0; i < coins.size(); i++) {
        if(coins.get(i).equals(aCoin))
          count++;
      }
      return count;
     }

    // returns the name of the Coin in the Purse that has the smallest value
  
}
  
