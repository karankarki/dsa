public class D2_Triangle {


    public static void main(String[] args) {

//        int n = 5;
//        int star = 1;
//        for(int i = 0;i<n;i++){
//
//            //spaces
//
//            for(int s = 0;s<n-i;s++){
//                System.out.print(" ");
//            }
//            for(int j = 0;j<star;j++){
//                System.out.print("*");
//            }
//            star+=2;
//            for(int k = 0;k<n-i;k++){
//                System.out.print(" ");
//            }
//            System.out.println();
//
//        }



//        Printing reverse triangle
        int n = 5;
        int star = 2*n - 1;

        for(int i = 0;i<n;i++){

            for(int s = 0;s<i+1;s++){
                System.out.print(" ");
            }

            for(int k = 0;k<star;k++){
                System.out.print("*");
            }
            star-=2;

            for(int s2 = 0;s2<i;s2++){
                System.out.print(" ");
            }


            System.out.println();


        }



    }

}

