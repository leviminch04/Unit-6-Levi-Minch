// package CardGame;

import java.util.ArrayList;

public class Tester
{
    public static void main(String[] args) 
    {
        War war = new War();
        while(war.p1DeckSize() > -1 && war.p2DeckSize() > -1)
        {
            String check = war.battle();
            System.out.println(check);
            if(check.equals("player 2 wins!") || check.equals("player 1 wins!"))
                break;
        }
    }


}