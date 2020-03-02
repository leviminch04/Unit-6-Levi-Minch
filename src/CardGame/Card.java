// package CardGame;

public class Card
{
        private int cardValue = -1;
        private String cardName = "";
        private String suit = "";


        public Card(int cardValue, String cardName, String suit)
        {
                this.cardValue = cardValue;
                this.cardName = cardName;
                this.suit = suit;
        }

        public int getCardValue()
        {
                return cardValue;
        }

        public String getCardName()
        {
                return cardName;
        }

        public String getSuit()
        {
                return suit;
        }
}