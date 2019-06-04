package bobo.algo;

public class selectSort {
    public static void swap(Integer [] arr,Integer a, Integer b){
        Integer temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static Integer [] testsort(Integer [] arr) {
        for(int i=0;i<arr.length;i++) {
            int minIndex=i;
          for(int j=i+1;j<arr.length ;j++){
              if(arr[j]<arr[minIndex]){
                  minIndex=j;
              }
          }
            swap(arr,i,minIndex);
        }
      return arr;
    }
    public static Integer [] insertSort(Integer [] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1])
                    swap(arr,j,j-1);
            }
        }
        return arr;
    }
    public static Integer [] bubbleSort(Integer [] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1])
                    swap(arr,j,j+1);
            }
        }
        return arr;
    }
}