public class Array2DTester {
    public static void main(String[] args) {
        MyArray2DExplorer arrayThing = new MyArray2DExplorer();
        int[][] intArray = {{1, 2, -120}, {4, 3, -100}};
        int[][] intTwo = {{1, 2, 120}, {4, 3, 100}};
//        System.out.println(MyArray2DExplorer.evenRow(intArray, 0));
        for(int n : MyArray2DExplorer.smallEven(intTwo))
        {
            System.out.println(n);
        }
    }
}
