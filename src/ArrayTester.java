public class ArrayTester {
    public static void main(String[] args) {
        MyArray2DExplorer thing = new MyArray2DExplorer();
        int[][] list = {{1, 2, 3, 4}, {0, 2, -5}, {0, 2, 20}};
        for(int n : thing.minRow2(list))
        {
            System.out.println(n);
        }
    }
}
