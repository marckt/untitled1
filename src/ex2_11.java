public class ex2_11 {
    public static void main(String[] args) {
        System.out.println(countAB("ababababdfdgdfgddfggab"));
    }
    public static int countAB(String str)
    {
        String newSt = str.replaceAll("ab","");

        return  (str.length() - newSt.length())/2;
    }
}
