package RECURSION;

public class j11palindrome_using_recursion {

    public static boolean ispalindrome(String str){
        if(str.length()==0 || str.length() ==1){
            return true;
        }
        if(str.charAt(0) != str.charAt(str.length()-1)){
            return false;
        }

        return ispalindrome(str.substring(1,str.length()-1));
    }

    public static void main(String[] args) {

        System.out.println(ispalindrome("abacaba"));

    }
}
