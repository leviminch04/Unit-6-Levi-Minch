public class CoinTester
{
    public static void main(String[] args) 
    {
        Coin myCoin = new Coin(.20, "The Big Man");
        Coin yourCoin = new Coin(.20, "The Big Man");
        Purse purse = new Purse();
        purse.add(myCoin);
        System.out.println("Total Value: " + purse.getTotal());
        purse.add(yourCoin);
        System.out.println("Total Value: " + purse.getTotal());
        System.out.println("Amount of cimialir coins: " + purse.count(myCoin));   
    }
}