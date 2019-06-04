package bobo.algo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Generate raw array
        int N = 100;
        System.out.println("Test for random array, size = " + N + " , random range [0, " + N + "]");
        Integer[] arr1 = SortTestHelper.generateRandomArray(N, 0, N);
        System.out.println("Raw arr: ");
        SortTestHelper.printArray(arr1);
//select sort
        Integer [] arrIndex1=selectSort.testsort(arr1);
        System.out.println("After select sort: ");
        SortTestHelper.printArray(arrIndex1);
//insert sort
        Integer [] arrIndex2=selectSort.insertSort(arr1);
        System.out.println("After insert sort: ");
        SortTestHelper.printArray(arrIndex2);
//bubble sort
        Integer [] arrIndex3=selectSort.insertSort(arr1);
        System.out.println("After bubble sort: ");
        SortTestHelper.printArray(arrIndex3);
    }
}