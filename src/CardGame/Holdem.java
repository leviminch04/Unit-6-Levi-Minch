// package CardGame;

import java.util.ArrayList;

public class Holdem
{
    private Deck deck = new Deck();
    private ArrayList<Card> dealerHand = new ArrayList<Card>();
    private ArrayList<Card> p1Hand = new ArrayList<Card>();
    private ArrayList<Card> p2Hand = new ArrayList<Card>();
    // private Player p1 = new Player(100, "p1");
    // private Player p2 = new Player(100, "p2");
    public Holdem()
    {
        deck.shuffle();
        p1Hand.add(deck.getAndDelete(0));
        p2Hand.add(deck.getAndDelete(0));
        p1Hand.add(deck.getAndDelete(0));
        p2Hand.add(deck.getAndDelete(0));
        

    }
    public ArrayList<Card> dealDealerCard()
    {
        dealerHand.add(deck.getAndDelete(0));
        return dealerHand;
    }

    public String dealerHandString()
    {
        String tempString="";
        for (int i = 0; i < dealerHand.size(); i++) {
            tempString += dealerHand.get(i).getCardName() + " of " + dealerHand.get(i).getSuit() + "\n";   
        }
        return tempString;

    }
    private String p1HandIndex(int index)
    {
        return p1Hand.get(index).getCardName();
    }

    private String p2HandIndex(int index)
    {
        return p2Hand.get(index).getCardName();
    }

    public String getP2Hand()
    {
        String stringReturn = "";
        for (int i = 0; i < p2Hand.size(); i++) 
        {
            stringReturn += p2Hand.get(i).getCardName() + " of " + p2Hand.get(i).getSuit() + ", ";
        }
        return stringReturn;
    }

    public String getP1Hand()
    {
        String stringReturn = "";
        for (int i = 0; i < p1Hand.size(); i++) 
        {
            stringReturn += p1Hand.get(i).getCardName() + " of " + p1Hand.get(i).getSuit() + ", ";
        }
        return stringReturn;
    }

    public int compareHands()
    {
        int greater = -1;
        
        return greater;

    }


}