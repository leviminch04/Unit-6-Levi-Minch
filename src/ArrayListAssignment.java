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
        String tempString = "";
        char charStore = 'a';
        for (int i = 0; i < list.size(); i++)
        {
            for (int j = 0; j < list.get(i).length(); j++)
            {
                tempString = list.get(i);
                charStore = tempString.charAt(j);
                value += (int) charStore;

            }

        }
        return value;
    }
    public int findPosition(ArrayList<Integer> list, int keyValue)
    {
        for (int i = 0; i < list.size(); i++)
        {
            if(list.get(i) == keyValue)
            {
                return i;
            }
        }
        return -1;
    }

    public ArrayList<Character> parseIntoArrayList(String  input)
    {
        ArrayList<Character> returnList = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            returnList.add(input.charAt(i));
        }
        return returnList;
    }

    public String findMin(ArrayList<Person> list)
    {
        int lowAge = 0;
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if(lowAge > list.get(i).getMyAge())
            {
                lowAge = list.get(i).getMyAge();
                index = i;
            }
        }
        return list.get(index).getMyName();
    }
}
