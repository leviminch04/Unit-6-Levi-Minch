import java.util.Scanner;

public class FrequencyChart {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many different frequencies do you want? ");
        int amount = scan.nextInt();
        int[] data = new int[amount];
        String nineD = "|90 - 100|";
        String eightD = "|80 - 89|";
        String seventD = "|70 - 79|";
        String sixD = "|60 - 69|";
        String fiftD = "|50 - 59|";
        String fourD = "|40 - 49|";
        String therD = "|30 - 39|";
        String twentyD = "|20 - 29|";
        String tens = "|10 - 19|";
        String single = "|0 - 9|";
        for(int n = 0; n < amount; n++)
        {
            System.out.println("Frequency for: " + n);
            int value = scan.nextInt();
            data[n] = value;
        }
        for(int i : data)
        {
            if(i >= 90)
            {
                nineD += "*";
            }
            else if(i >= 80)
            {
                eightD+= "*";
            }
            else if(i >= 70)
            {
                seventD+= "*";
            }
            else if(i >= 60)
            {
                sixD+= "*";
            }
            else if(i >= 50)
            {
                fiftD+= "*";
            }
            else if(i >= 40)
            {
                fourD+= "*";
            }
            else if(i >= 30)
            {
                therD+= "*";
            }
            else if(i >= 20)
            {
                twentyD+= "*";
            }
            else if(i >= 10)
            {
                tens+= "*";
            }
            else
            {
                single+= "*";
            }
        }
        System.out.println(nineD);
        System.out.println(eightD);
        System.out.println(seventD);
        System.out.println(sixD);
        System.out.println(fiftD);
        System.out.println(fourD);
        System.out.println(therD);
        System.out.println(twentyD);
        System.out.println(tens);
        System.out.println(single);
    }
}
