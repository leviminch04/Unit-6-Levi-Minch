public class Tester2
{
    public static void main(String[] args) 
    {
        War war = new War();
        while(war.p1DeckSize() > -1 && war.p2DeckSize() > -1)
        {
            String check = war.battle();
            System.out.println(check);
        }
    }
}