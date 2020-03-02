// package CardGame;

public class Player
{
    int chips = 0;
    String name ="";
    public Player(int chips, String name)
    {
        this.chips = chips;
        this.name = name;
    }

    public int getChips(){return chips;}
    public String getName(){return name;}
    public void minusChips(int minus){chips -= minus;}
    public void addChips(int add){chips+= add;}
    public void setChips(int amount){chips = amount;}

}