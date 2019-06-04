package bobo.algo;

public class selectSort {
    public static void swap(Integer [] arr,Integer a, Integer b){
        Integer temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static Integer [] testsort(Integer [] arr) {
        for(int i=0;i<arr.length;i++) {
          for(int j=i+1;j<arr.length && arr[j]<arr[i] ;j++){
                 swap(arr,i,j);
          }
        }
      return arr;
    }
}