package RECURSION;

public class j2_length_of_integer {

    public static int count(int n){
        //Write your code here
        if(n==0){
            return 0;
        }

        return 1+count(n/10);
    }

    public static void main(String[] args) {

        System.out.println(count(1234567890));
    }
}
