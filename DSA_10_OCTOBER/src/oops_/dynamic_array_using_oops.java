package oops_;
import java.util.*;


class Dynamic_array{
    int ind = 0;
    int[] arr1= new int[5];
    Dynamic_array(){
        System.out.println("array is created");


    }

    private int[] increase(int[] arr1){
        int new_arr[] = new int[arr1.length + 5];
        for(int i = 0;i<arr1.length;i++) {
            new_arr[i] = arr1[i];
        }

        return new_arr;
    }

    public void add(int val){

        if(ind >= arr1.length){
            arr1 = increase(arr1);

        }

        arr1[ind] = val;
        ind++;


    }

    public String toString() {

        return Arrays.toString(arr1);
    }



}

public class dynamic_array_using_oops extends Dynamic_array {





    public static void main(String[] args) {
        Dynamic_array arr2 = new Dynamic_array();
        arr2.add(10);
        arr2.add(11);
        arr2.add(12);
        arr2.add(10);
        arr2.add(13);
        arr2.add(143);
        arr2.add(143);
        arr2.add(1423);
        arr2.add(14334);
        arr2.add(1432);
        arr2.add(433);
        arr2.add(653);
        arr2.add(653);
        arr2.add(653);
        arr2.add(653);
        System.out.println(arr2.toString());
    }
}
