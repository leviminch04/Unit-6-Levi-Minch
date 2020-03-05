// package CardGame;

import java.util.ArrayList;

public class War {
    private ArrayList<Card> p1Deck = new ArrayList<Card>();
    private ArrayList<Card> p2Deck = new ArrayList<Card>();
    private Deck deck = new Deck();
    private boolean splitDeck = true;

    public War() {
        this.splitDeck();
    }

    public void splitDeck() {
        if(splitDeck)
        {
            deck.shuffle();
            for (int i = 0; i < 26; i++) {
                p1Deck.add(deck.getIndex(i));

            }

            for (int i = 26; i < 52; i++) {
                p2Deck.add(deck.getIndex(i));
            }
            splitDeck = false;
        }

    }

    public String getP1Deck() {
        String stringReturn = "";
        for (int i = 0; i < p1Deck.size(); i++) {
            stringReturn += p1Deck.get(i).getCardName() + " of " + p1Deck.get(i).getSuit() + "\n";
        }
        return stringReturn;
    }

    public int p1DeckSize(){return p1Deck.size();}
    public int p2DeckSize(){return p2Deck.size();}

    public String battle() {
        if((p1Deck.size()) <= 0)
            return "------------\nplayer 2 wins!";
        else if(p2Deck.size() <= 0)
            return "------------\nplayer 1 wins!";
        System.out.println("p1 deck: " + p1Deck.size());
        Card temp1 = p1Deck.get(0);
        p1Deck.remove(0);
        System.out.println("p2 deck: " + p2Deck.size());
        Card temp2 = p2Deck.get(0);
        p2Deck.remove(0);
        
        int winner = -1;
        //player one wins
        if (temp1.getCardValue() > temp2.getCardValue()) {
            winner = 1;
            p1Deck.add(temp1);
            p1Deck.add(temp2);
        }
        //player 2 wins
        if (temp1.getCardValue() < temp2.getCardValue())
        {
            winner = 2;
            p2Deck.add(temp2);
            p2Deck.add(temp1);
        }
        //tie
        if (temp1.getCardValue() == temp2.getCardValue()) {
            this.tieWinner(0);
        }
        return "Battling... " + temp1.getCardName() + " vs " + temp2.getCardName() + "\nWinner: Player " + winner;
    }

    //used for tie in battle
    private int tieWinner(int winner)
    {
        if(!(this.p1DeckSize() > 3 && this.p2DeckSize() > 3))
        {
            return -100;
        }

        else
        {
        //temp 1-4 are for player 1
        Card temp1 = p1Deck.get(0);
        p1Deck.remove(0);
        Card temp2 = p1Deck.get(0);
        p1Deck.remove(0);
        Card temp3 = p1Deck.get(0);
        p1Deck.remove(0);
        Card temp4 = p1Deck.get(0);
        p1Deck.remove(0);
        //temp 5-8 are for player 2
        Card temp5 = p2Deck.get(0);
        p2Deck.remove(0);
        Card temp6 = p2Deck.get(0);
        p2Deck.remove(0);
        Card temp7 = p2Deck.get(0);
        p2Deck.remove(0);
        Card temp8 = p2Deck.get(0);
        p2Deck.remove(0);
        //sum for player 1
        int sum1 = temp1.getCardValue() + temp2.getCardValue() + temp3.getCardValue() + temp4.getCardValue();
        int sum2 = temp5.getCardValue() + temp6.getCardValue() + temp7.getCardValue() + temp8.getCardValue();
        System.out.println(sum1);
        System.out.println(sum2);
        if(sum1 > sum2)
        {
            winner = 1;
            p1Deck.add(temp1);
            p1Deck.add(temp2);
            p1Deck.add(temp3);
            p1Deck.add(temp4);
            p1Deck.add(temp5);
            p1Deck.add(temp6);
            p1Deck.add(temp7);
            p1Deck.add(temp8);
        }

        if(sum1 < sum2)
        {
            winner = 2;
            p2Deck.add(temp1);
            p2Deck.add(temp2);
            p2Deck.add(temp3);
            p2Deck.add(temp4);
            p2Deck.add(temp5);
            p2Deck.add(temp6);
            p2Deck.add(temp7);
            p2Deck.add(temp8);
        }

        else if(sum1 == sum2)
        {
            winner = -1; 
            p1Deck.add(temp1);
            p1Deck.add(temp2);
            p1Deck.add(temp3);
            p1Deck.add(temp4);
            p2Deck.add(temp5);
            p2Deck.add(temp6);
            p2Deck.add(temp7);
            p2Deck.add(temp8);
        }


        return winner;
        }
    }
}
