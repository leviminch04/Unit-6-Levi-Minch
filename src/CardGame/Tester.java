// package CardGame;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester
{
    public static void main(String[] args) 
    {
        War war = new War();
        Scanner scan = new Scanner(System.in);
        while(war.p1DeckSize() > -1 && war.p2DeckSize() > -1)
        {
            String check = war.battle();
            System.out.println(check);
            if(check.equals("------------\nplayer 2 wins!") || check.equals("------------\nplayer 1 wins!"))
                break;
            else{
                System.out.println("enter for next turn");
                scan.nextLine();
            }
        }

        while(war.p1DeckSize() > -1 && war.p2DeckSize() > -1)
        {

        }
    }


}