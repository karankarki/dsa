package RECURSION;

import java.util.Arrays;

public class j4_search_for_num {

    public static boolean checkNumber(int input[], int x) {

        if(input.length==0){
            return false;
        }
        int ele = input[input.length-1];
        int new_arr[] = Arrays.copyOf(input,input.length-1);


        if(ele == x){
            return true;

        }
        return checkNumber(new_arr,x);


    }

    public static void main(String[] args) {
        System.out.println(checkNumber(new int[]{11,2,3,98,4,54,6},11));
    }
}
