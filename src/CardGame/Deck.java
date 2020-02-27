package CardGame;

import java.util.ArrayList;

import sun.launcher.resources.launcher;

public class Deck
{
    ArrayList<Card> deck = new ArrayList<Card>();
    Card twoClubs = new Card(2, "two", "Clubs");
    Card threeClubs = new Card(3, "three", "Clubs");
    Card fourClubs = new Card(4, "four", "Clubs");
    Card fiveClubs = new Card(5, "five", "Clubs");
    Card sixclubs = new Card(6, "six", "Clubs");
    Card sevenClubs = new Card(7, "seven", "Clubs");
    Card eightClubs = new Card(8, "eight", "Clubs");
    Card nineClubs = new Card(9, "nine", "Clubs");
    Card tenClubs = new Card(10, "ten", "Clubs");
    Card jackClubs = new Card(11, "jack", "Clubs");
    Card queenClubs = new Card(12, "queen", "Clubs");
    Card kingClubs = new Card(13, "king", "Clubs");
    Card aceClubs = new Card(14, "ace", "Clubs");



    public Deck(){}

    public void shuffle(){}
}