package RECURSION;
import java.util.*;
public class j10_reverse_a_string {

    //Method 1
    public static String rev(String str){
        if(str.length()==0){
            return "";
        }

        return str.substring(str.length()-1) + rev(str.substring(0,str.length()-1));

    }


    //Method2

    public static String swap(String str,int i,int j){

        char s = str.charAt(i);
        char e = str.charAt(j);


        String ans = str.substring(0,i)+e+str.substring(i+1,j) + s + str.substring(j+1);
        System.out.println(ans);

        return ans;
    }

    public static String rev2(String str,int s,int end){
        if(s==end){

            return str;
        }

   //know we have to swap s with end
        str = swap(str,s,end);

        return rev2(str,s+1,end-1);
    }

    public static void main(String[] args) {
//        System.out.println(rev("khana kha liya?"));
        System.out.println(rev2("karansh",0,6));



    }
}
