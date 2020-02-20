import java.util.ArrayList;

public class ArrayListAssignment {
    public ArrayListAssignment(){}
    public void removeZeros(ArrayList<Integer> list)
    {
        for (int i = 0; i < list.size() - 1; i++)
        {
            if(list.get(i) == 0)
            {
                list.remove(i);
            }
        }
    }
    public int countLetters(ArrayList<String> list)
    {
        int value = 0;
        for (int i = 0; i < list.size(); i++)
        {

        }
        return value;
    }
}
