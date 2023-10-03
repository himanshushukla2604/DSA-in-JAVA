import java.util.*;
public class Merge{

    public static void merge(int[] arr, int start, int mid, int end){
        int[] temp = new int[end - start +1];
        int i = start;
        int j = mid+1;
        int k = 0;
        while(i <= mid && j <= end){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i <= mid){
            temp[k] = arr[i];
            i++;
            k++;
        }

        while(j <= end){
            temp[k] = arr[j];
            k++;
            j++;
        }

        for(int f = start; f <= end; f++){
            arr[f] = temp[f-start];
        }

    }

    public static void mergeSort(int[] arr, int start, int end){
        if(start >= end){
            return;
        }
        int mid = start + (end - start)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        merge(arr, start, mid, end);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        mergeSort(arr, 0, arr.length-1);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}