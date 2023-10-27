package RECURSION;

public class j5_Remove_all_charX {

    public static String removeX(String input){

    if(input.length()==0){
        return "";
    }

    String n1 = "";

    if(input.charAt(0)!='x'){
        n1 = input.charAt(0)+"";
    }

        return n1 + removeX(input.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(removeX("karxansx"));
    }
}
