import java.util.ArrayList;

public class ArrayListTester {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayListAssignment thing = new ArrayListAssignment();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(0);
        list.add(5);
        System.out.println(list);
        thing.removeZeros(list);
        System.out.println(list);


    }
}
