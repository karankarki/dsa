public class d6_hollow_rhombus {


    public static void main(String[] args) {

        int n = 5;
        for(int i = 0;i<n;i++){

//            star

            for(int j = i;j<n;j++){
                System.out.print("*");
            }

//            space

            for(int s = 0;s<2*i;s++){
                System.out.print(" ");
            }


//            star
            for(int k = i;k<n;k++){
                System.out.print("*");
            }

        if(i!=n-1){
            System.out.println();
        }




        }


        for(int i = n;i>=0;i--){

//            star

            for(int j = i;j<n;j++){
                System.out.print("*");
            }

//            space

            for(int s = 0;s<2*i;s++){
                System.out.print(" ");
            }


//            star
            for(int k = i;k<n;k++){
                System.out.print("*");
            }


            System.out.println();

        }



    }
}
