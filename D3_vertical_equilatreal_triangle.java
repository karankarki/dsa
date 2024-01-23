public class D3_vertical_equilatreal_triangle {


    public static void main(String[] args) {


        int n = 5;
        int star = 1;
        int add = 0;


        for(int i = 0;i<n;i++){
//            stars
            for(int s = 0;s<star;s++){
                System.out.print("*");
            }

            if(star==(n/2)+1){
                add=1;
            }
            if(add==1){
                star--;
            }
            else{
                star++;
            }

            System.out.println();







        }






    }




}
