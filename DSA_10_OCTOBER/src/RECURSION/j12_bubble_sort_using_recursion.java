package RECURSION;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

public class j12_bubble_sort_using_recursion {

    public static void bubblesort(int[] arr,int len){

        if(len==0){
            return;
        }

        else{

            for(int i =0;i<len-1;i++){
                if(arr[i]>arr[i+1]){
                   int temp = arr[i];
                   arr[i] = arr[i+1];
                   arr[i+1] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));

    bubblesort(arr,len-1);
    }

    public static void main(String[] args) {
int []arr = {5,4,3,2,1};
bubblesort(arr,arr.length);
        System.out.println(Arrays.toString(arr));



    }
}
