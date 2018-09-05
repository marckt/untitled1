public class ex2_12 {
    public static void main(String[] args) {
        System.out.println(countCharsInOrder("xzczxcabab",'a','b'));
    }
    public static int countCharsInOrder(String str, char ch1, char ch2){
        String concat = Character.toString(ch1)+Character.toString(ch2);
        String newString = str.replaceAll(concat,"");

        return (str.length() - newString.length())/2;
    }

}
