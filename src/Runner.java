import java.lang.Math;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class Runner {

    public static void main(String[] args) {

        System.out.println(java.util.Arrays.toString(sortAndStack()));
    }


    public static int[][] createRandom2DArray(int rows, int columns, int max) {
        int[][] arr = new int[rows][columns];
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                double newNumber = Math.round(Math.random() * max + 1);
                arr[i][j] = (int)newNumber;
            }
        }

        return arr;
    }

    public static int[] createRandom1DArray(int values, int max) {
        int[] arr = new int[values];
        for (int i = 0; i < values; i++){
            double newNumber = Math.round(Math.random() * max + 1);
            arr[i] = (int)newNumber;
        }
        return arr;
    }


    public static int crossSum(int[][] arr){
        int maxSum = 0;
        int row = 0;
        int column = 0;
        for (int i = 1; i < 4; i++){
            for (int j = 1; j < 4; j++) {
                int currentSum = 0;
                currentSum += arr[i-1][j] + arr[i][j-1] + arr[i][j] + arr[i][j+1] + arr[i+1][j];
                if (currentSum > maxSum){
                    maxSum = currentSum;
                    row = i + 1;
                    column = j + 1;
                }
            }

        }
        System.out.println("Row: " + row + " Column: " + column);
        return maxSum;
    }


    public static int[] sortAndStack() {
        int[] randomArray = createRandom1DArray(20, 100);
        System.out.println(java.util.Arrays.toString(randomArray));
        Arrays.sort(randomArray);
        System.out.println(java.util.Arrays.toString(randomArray));
        Stack returnStack = new Stack();
        for (int i = 0; i < randomArray.length; i++) {
            returnStack.push(randomArray[i]);
        }

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int)returnStack.pop();
        }
        return randomArray;


    }


}
