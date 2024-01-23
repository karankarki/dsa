public class D4_right_triagnle_connected {


    public static void main(String[] args) {

        int n = 6;
        for(int i = 1;i<=n;i++){

//            number
            for(int j = 1;j<=i;j++){
                System.out.print(j);
            }

//            spaces

            for(int s = 0;s<2*n-2*i;s++){
                System.out.print(" ");
            }

//            number

            for(int k = i;k>=1;k--){
                System.out.print(k);
            }
            System.out.println();






        }




    }


}
