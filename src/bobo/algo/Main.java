package bobo.algo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Generate raw array
        int N = 30;
        System.out.println("Test for random array, size = " + N + " , random range [0, " + N + "]");
        Integer[] arr1 = SortTestHelper.generateRandomArray(N, 0, N);
        System.out.println("Raw arr: ");
        SortTestHelper.printArray(arr1);
//select sort
        Integer [] arrIndex=selectSort.testsort(arr1);
        System.out.println("After sort: ");
        SortTestHelper.printArray(arrIndex);
        System.out.println();
        return;
    }
}