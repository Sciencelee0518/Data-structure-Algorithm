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
     /*    public static Integer [] insertSort(Integer [] arr, int l,int r){
        for(int i=l;i<r-1;i++){
            for(int j=i+1;j>l;j--){
                if(arr[j]<arr[j-1])
                    swap(arr,j,j-1);
            }
        }
        return arr;
    }*/
    public static void sort(Comparable[] arr, int l, int r){

        for( int i = l + 1 ; i <= r ; i ++ ){
            Comparable e = arr[i];
            int j = i;
            for( ; j > l && arr[j-1].compareTo(e) > 0 ; j--)
                arr[j] = arr[j-1];
            arr[j] = e;
        }
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
    private static  void mSort(Integer [] arr,int l ,int r){
        if(r-l<=1){
            sort(arr,l,r);
            return ;
        }
        int m=l+(r-l)/2;
        mSort(arr,l,m);
        mSort(arr,m+1,r);
        return ;
    }
    public static Integer [] mergeSort(Integer [] arr){
        mSort(arr,0,arr.length-1);
        return arr;
    }
}