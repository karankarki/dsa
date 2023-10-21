package RECURSION;

public class j4_sum_of_array {

    public static int sum_of_arr(int arr[]){
        if(arr.length ==0 ){
            return 0;
        }
        int temp = arr[0];
        int []new_arr = new int[arr.length-1];
        for(int i = 0;i<arr.length-1;i++){
            new_arr[i] = arr[i+1];
        }

        return temp + sum_of_arr(new_arr) ;

    }

    public static void main(String[] args) {
        System.out.println(sum_of_arr(new int[]{1,2,3,4,5,6,7,8,9,10}));
    }
}
