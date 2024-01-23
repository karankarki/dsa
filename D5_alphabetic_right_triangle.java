public class D5_alphabetic_right_triangle {

    public static void main(String[] args) {


        int n = 5;

        for(int i = 0;i<n;i++){
            for(int j = 65;j<=65+i;j++ ){
                System.out.print((char)j);
            }
            System.out.println();
        }


    }


}
