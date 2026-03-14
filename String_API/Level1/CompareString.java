package String_API.Level1;

public class CompareString {
    public static  boolean CompareSting(String[] args){
        return  false;
    }
        public static boolean compareUsingCharAt(String s1,String s2) {

        for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    return false;
                }
            }

            return true;
        }
    public static void main(String args[]) {
String s1="abc";
String s2="abc";
        boolean resultCharAt = compareUsingCharAt(s1, s2);
        boolean resultEquals = s1.equals(s2);


        System.out.println(resultCharAt);
        System.out.println( resultEquals);


        if (resultCharAt == resultEquals) {
            System.out.println("methods give the same result.");
        } else {
            System.out.println("methods give different results.");
        }
    }
}



