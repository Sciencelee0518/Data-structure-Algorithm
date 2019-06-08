package bobo.algo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Generate raw array
        int N = 20;
        System.out.println("Test for random array, size = " + N + " , random range [0, " + N + "]");
        Integer[] arr1 = SortTestHelper.generateRandomArray(N, 0, N);
        Integer[] arr2 = Arrays.copyOf(arr1, arr1.length);
        Integer[] arr3 = Arrays.copyOf(arr1, arr1.length);
        Integer[] arr4 = Arrays.copyOf(arr1, arr1.length);

       System.out.println("Raw arr: ");
        SortTestHelper.printArray(arr1);
 //select sort
        Integer [] arrIndex1=selectSort.testsort(arr1);
        System.out.println("After select sort: ");
        SortTestHelper.printArray(arrIndex1);
/*//insert sort
        Integer [] arrIndex2=selectSort.sort(arr2,0,arr2.length);
        System.out.println("After insert sort: ");
        SortTestHelper.printArray(arrIndex2);*/
//bubble sort
        Integer [] arrIndex3=selectSort.bubbleSort(arr3);
        System.out.println("After bubble sort: ");
        SortTestHelper.printArray(arrIndex3);
//merge sort
        Integer [] arrIndex4=selectSort.mergeSort(arr4);
        System.out.println("After merge sort: ");
        SortTestHelper.printArray(arrIndex4);
    }
}