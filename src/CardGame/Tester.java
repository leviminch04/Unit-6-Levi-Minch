package CardGame;

public class Tester
{
    public static void main(String[] args) 
    {
        Deck myDeck = new Deck();
        System.out.println(myDeck.toString());
        
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Shuffling ;)");
        System.out.println();
        System.out.println();
        System.out.println();

        myDeck.shuffle();
        System.out.println(myDeck.toString());
    }
}