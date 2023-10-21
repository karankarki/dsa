package RECURSION;

public class j8_splitsUm {

    public static boolean check(int[] arr,int ind,int g1_sum,int g2_sum){

        if(ind==arr.length){
            return g1_sum==g2_sum;
        }


        else if(arr[ind]%5==0){
         g1_sum+=arr[ind];
        }

        else if(arr[ind]%3==0){
            g2_sum+=arr[ind];
        }

        else{
//            System.out.println("i am for g1 " + ind+"   "+g1_sum+"    "+g2_sum);
          boolean g1 = check(arr, ind+1, g1_sum, g2_sum+arr[ind]);
//            System.out.println("i am for g2  "  + ind+"   "+g1_sum+"   "+g2_sum);
          boolean g2 = check(arr,ind+1,g1_sum+arr[ind],g2_sum);
            return g1||g2;
        }

        return check(arr, ind+1, g1_sum, g2_sum);
    }


    public static boolean splitArray(int input[]) {

        return check(input, 0,0,0);

    }

    public static void main(String[] args) {
        System.out.println(splitArray(new int[]{1,2,3,4}));
    }
}
