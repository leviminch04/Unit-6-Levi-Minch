public class Array2DTester {
    public static void main(String[] args) {
        MyArray2DExplorer arrayThing = new MyArray2DExplorer();
        int[][] intArray = {{1, 2, -120}, {4, 3, -100}};
        int[][] intTwo = {{5, 5, 120}, {10, 2, 1}};
//        System.out.println(MyArray2DExplorer.evenRow(intArray, 0));
//        for(int n : arrayThing.smallEven(intArray))
//        {
//            System.out.println(n);
//        }
        System.out.println(arrayThing.biggestRow(intTwo));
    }
}
