package RECURSION;

public class j6_remove_duplicate_elements_recursively {

    public static String rem_dup(String str){

        if(str.length()<=1){
            return str;
        }
        String n1 = "";
        if(str.charAt(0)!=str.charAt(1)){
            n1 = str.charAt(0) +"";
        }

        return n1 + rem_dup(str.substring(1));

    }

    public static void main(String[] args) {
        System.out.println(rem_dup("kaaarrrraaann"));
    }
}
