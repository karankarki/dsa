package RECURSION;

public class j3_first_N_natural_numbers {

    public static int print(int n){
        //Write your code here
        if(n==0){
            return 0;
        }
        return n+print(n-1);




    }

    public static void main(String[] args) {
        System.out.println(print(10));
    }


}
