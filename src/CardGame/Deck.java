// package CardGame;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;



public class Deck extends ArrayList<Card>
{
    ArrayList<Card> deckList = new ArrayList<Card>();
    Card twoClubs = new Card(2, "two", "Clubs");
    Card threeClubs = new Card(3, "three", "Clubs");
    Card fourClubs = new Card(4, "four", "Clubs");
    Card fiveClubs = new Card(5, "five", "Clubs");
    Card sixClubs = new Card(6, "six", "Clubs");
    Card sevenClubs = new Card(7, "seven", "Clubs");
    Card eightClubs = new Card(8, "eight", "Clubs");
    Card nineClubs = new Card(9, "nine", "Clubs");
    Card tenClubs = new Card(10, "ten", "Clubs");
    Card jackClubs = new Card(11, "jack", "Clubs");
    Card queenClubs = new Card(12, "queen", "Clubs");
    Card kingClubs = new Card(13, "king", "Clubs");
    Card aceClubs = new Card(14, "ace", "Clubs");
    Card twoHearts = new Card(2, "two", "Hearts");
    Card threeHearts = new Card(3, "three", "Hearts");
    Card fourHearts = new Card(4, "four", "Hearts");
    Card fiveHearts = new Card(5, "five", "Hearts");
    Card sixHearts = new Card(6, "six", "Hearts");
    Card sevenHearts = new Card(7, "seven", "Hearts");
    Card eightHearts = new Card(8, "eight", "Hearts");
    Card nineHearts = new Card(9, "nine", "Hearts");
    Card tenHearts = new Card(10, "ten", "Hearts");
    Card jackHearts = new Card(11, "jack", "Hearts");
    Card queenHearts = new Card(12, "queen", "Hearts");
    Card kingHearts = new Card(13, "king", "Hearts");
    Card aceHearts = new Card(14, "ace", "Hearts");
    Card twoSpades = new Card(2, "two", "Spades");
    Card threeSpades = new Card(3, "three", "Spades");
    Card fourSpades = new Card(4, "four", "Spades");
    Card fiveSpades = new Card(5, "five", "Spades");
    Card sixSpades = new Card(6, "six", "Spades");
    Card sevenSpades = new Card(7, "seven", "Spades");
    Card eightSpades = new Card(8, "eight", "Spades");
    Card nineSpades = new Card(9, "nine", "Spades");
    Card tenSpades = new Card(10, "ten", "Spades");
    Card jackSpades = new Card(11, "jack", "Spades");
    Card queenSpades = new Card(12, "queen", "Spades");
    Card kingSpades = new Card(13, "king", "Spades");
    Card aceSpades = new Card(14, "ace", "Spades");
    Card twoDiamonds = new Card(2, "two", "Diamonds");
    Card threeDiamonds = new Card(3, "three", "Diamonds");
    Card fourDiamonds = new Card(4, "four", "Diamonds");
    Card fiveDiamonds = new Card(5, "five", "Diamonds");
    Card sixDiamonds = new Card(6, "six", "Diamonds");
    Card sevenDiamonds = new Card(7, "seven", "Diamonds");
    Card eightDiamonds = new Card(8, "eight", "Diamonds");
    Card nineDiamonds = new Card(9, "nine", "Diamonds");
    Card tenDiamonds = new Card(10, "ten", "Diamonds");
    Card jackDiamonds = new Card(11, "jack", "Diamonds");
    Card queenDiamonds = new Card(12, "queen", "Diamonds");
    Card kingDiamonds = new Card(13, "king", "Diamonds");
    Card aceDiamonds = new Card(14, "ace", "Diamonds");



    public Deck()
    {
        deckList.add(twoClubs);
        deckList.add(threeClubs);
        deckList.add(fourClubs);
        deckList.add(fiveClubs);
        deckList.add(sixClubs);
        deckList.add(sevenClubs);
        deckList.add(eightClubs);
        deckList.add(nineClubs);
        deckList.add(tenClubs);
        deckList.add(jackClubs);
        deckList.add(queenClubs);
        deckList.add(kingClubs);
        deckList.add(aceClubs);
        deckList.add(twoHearts);
        deckList.add(threeHearts);
        deckList.add(fourHearts);
        deckList.add(fiveHearts);
        deckList.add(sixHearts);
        deckList.add(sevenHearts);
        deckList.add(eightHearts);
        deckList.add(nineHearts);
        deckList.add(tenHearts);
        deckList.add(jackHearts);
        deckList.add(queenHearts);
        deckList.add(kingHearts);
        deckList.add(aceHearts);
        deckList.add(twoSpades);
        deckList.add(threeSpades);
        deckList.add(fourSpades);
        deckList.add(fiveSpades);
        deckList.add(sixSpades);
        deckList.add(sevenSpades);
        deckList.add(eightSpades);
        deckList.add(nineSpades);
        deckList.add(tenSpades);
        deckList.add(jackSpades);
        deckList.add(queenSpades);
        deckList.add(kingSpades);
        deckList.add(aceSpades);
        deckList.add(twoDiamonds);
        deckList.add(threeDiamonds);
        deckList.add(fourDiamonds);
        deckList.add(fiveDiamonds);
        deckList.add(sixDiamonds);
        deckList.add(sevenDiamonds);
        deckList.add(eightDiamonds);
        deckList.add(nineDiamonds);
        deckList.add(tenDiamonds);
        deckList.add(jackDiamonds);
        deckList.add(queenDiamonds);
        deckList.add(kingDiamonds);
        deckList.add(aceDiamonds);

    }

    public void shuffle()
    {
        Card tempCard;
        int tempnum1 = 0;
        int tempnum2 = 0;
        for(int i = 0; i <= 1000; i++)
        {
            tempnum1 = this.intMinMax();
            tempnum2 = this.intMinMax();
            tempCard = deckList.get(tempnum1);
            deckList.set(tempnum1, deckList.get(tempnum2));
            deckList.set(tempnum2, tempCard);

        }
        tempCard = deckList.get(0);
        tempnum1 = this.intMinMax();
        deckList.set(0, deckList.get(tempnum1));
        deckList.set(tempnum1, tempCard);
    }
    
    public String toString()
    {
        String result = "";
        for(int i = 0; i < deckList.size(); i++)
        {
            result += "Card Name: "+ deckList.get(i).getCardName() + " Suit: " + deckList.get(i).getSuit() + "\n";
        }
        return result;
    }

    public int intMinMax()
    {
        return ThreadLocalRandom.current().nextInt(1, deckList.size());
    }

    public Card getAndDelete(int index)
    {
        Card temp = deckList.get(index);
        deckList.remove(index);
        return temp;
    }

    public Card getIndex(int index)
    {
        return deckList.get(index);
    }
}