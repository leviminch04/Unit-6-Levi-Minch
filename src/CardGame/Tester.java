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
            if(war.battle().equals("-100"))
            {
                break;
            }
            System.out.println(check);

        }
        System.out.println("test");
    }


}