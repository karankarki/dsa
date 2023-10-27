package RECURSION;

public class j8_splitsUm {


        public static boolean backspaceCompare(String s, String t) {
            String s1 = "";
            String t1 = "";
            for(int i = 0;i<s.length();i++){
                if(s.charAt(i)!='#'){
                    s1 +=s.charAt(i)+"";
                }

                if(s.charAt(i)=='#'){
                    s1 = s1.substring(0,s1.length()-1);
                }

            }

            for(int i = 0;i<t.length();i++){
                if(s.charAt(i)!='#'){
                    t1 +=t.charAt(i)+"";
                }

                if(t.charAt(i)=='#'){
                    t1 = t1.substring(0,t1.length()-1);
                }

            }

            System.out.println(s1);
            System.out.println(t1);
            return s1.equals(t1);
        }



    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab#c","ad#c"));
    }
}
