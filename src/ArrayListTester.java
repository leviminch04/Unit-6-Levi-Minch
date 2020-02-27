import java.util.ArrayList;

public class ArrayListTester {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<String> stringList = new ArrayList<String>();
        ArrayListAssignment thing = new ArrayListAssignment();
        ArrayList<Person> personArrayList = new ArrayList<Person>();
        Person bigMan = new Person(1, "bigMan");
        Person bigBoi = new Person(2, "bigBoi");
        personArrayList.add(bigMan);
        personArrayList.add(bigBoi);
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(0);
        list.add(5);
        
        /*
        stringList.add("AB");
        System.out.println(stringList);
        System.out.println(thing.countLetters(stringList));

         */
        System.out.println(thing.findMin(personArrayList));
        /*
        System.out.println(list);
        thing.removeZeros(list);
        System.out.println(list);
         */


    }
}
