public class MyArray2DExplorer {
    public MyArray2DExplorer(){}
    public static boolean evenRow(int[][] mat, int row)
    {
        int total = 0;
        for (int i = 0; i < mat[row].length; i++) {
            total+= mat[row][i];
        }
        return total % 2 == 0;
    }

    public int minRow(int[][] nums, int row)
    {
        int min = nums[row][0];
        for (int i = 0; i < nums[row].length; i++) {
            if(nums[row][i] < min)
            {
                min = nums[row][i];
            }
        }
        return min;
    }

    public int[] colMaxs(int[][] matrix)
    {
        int[] arrayReturn = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            arrayReturn[i] = matrix[i][0];
            for (int j = 0; j < matrix[i].length; j++) {
                if(arrayReturn[i] > matrix[i][j])
                {
                    arrayReturn[i] = matrix[i][j];
                }

            }

        }
        return arrayReturn;
    }

    public int[] allRowSums(int[][] data)
    {
        int[] arrayReturn = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            arrayReturn[i] = 0;
            for (int j = 0; j < data[i].length; j++) {
                arrayReturn[i] += data[i][j];
            }

        }
        return arrayReturn;
    }

    public double[] averageCol(int[][] nums)
    {
        double[] arrayReturn = new double[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arrayReturn[i] = 0;
            for (int j = 0; j < nums[i].length; j++) {
                arrayReturn[i] += nums[i][j];
            }
            arrayReturn[i] = arrayReturn[i] / nums[i].length;

        }
        return arrayReturn;
    }

    public int smallEven(int[][] matrix)
    {
        int arrayReturn = 2147483647;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                /*
                compare thi
                 */
//                System.out.println(matrix[i][j] + " " + matrix[i][j] % 2);
                if(arrayReturn > matrix[i][j] && ((matrix[i][j] % 2) == 0))
//                    System.out.println("setting arrayReturn");
                    arrayReturn = matrix[i][j];
            }
        }
        return arrayReturn;
    }

    public int biggestRow(int[][] nums)
    {
        int intReturn = 0;
        int check = 0;
        int row = 0;
        for (int i = 0; i < nums.length; i++) {
            if(i == 0)
            {
                for (int j = 0; j < nums[i].length; j++) {
                    intReturn += nums[i][j];
                }
            }

            else
            {
                for (int j = 0; j < nums[i].length; j++) {
                    check += nums[i][j];
                }
            }

            if(intReturn < check) {
                intReturn = check;
                row = i;
            }
            check = 0;
        }
        return row;
    }

    public boolean oddColSum(int[][] nums, int col)
    {
        int total = 0;
        for (int i = 0; i < nums[col].length; i++) {
            total += nums[col][i];
        }
        return total % 2 == 1;
    }

    public int[] minRow2(int[][] nums)
    {
        int small = Integer.MAX_VALUE;
        int[] intReturn = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if(small > nums[i][j])
                    small = nums[i][j];
            }
            intReturn[i] = small;
            small = Integer.MAX_VALUE;

        }

        return intReturn;
    }



}
