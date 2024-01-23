import  java.util.*;
public class d8_worst_pattern   {


    public static int min(int a,int b, int c ,int d){
        int a1 = Math.min(a,b);
        int a2 = Math.min(c,d);
        return Math.min(a1,a2);
    }

    public static void main(String[] args) {
        int n = 4;

        for(int i = 0;i <2*n-1;i++){
            for(int j = 0;j<2*n-1;j++){

                int top = i;
                int left = j;
                int right = 2*n-2 - left;
                int bottom =2*n-2 - top;


                System.out.print(4-min(top,left,right,bottom));



            }
            System.out.println();
        }



    }
}
