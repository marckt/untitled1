public class ex2_10 {
    public static void main(String[] args) {
        System.out.println(exactlyOnePositive(1,0,0));
        System.out.println(exactlyOnePositive(1,1,1));

    }
    public static boolean exactlyOnePositive(int a, int b, int c)
    {

        return (a<=0&&b<=0&&c>0)||(a<=0&&c<=0&&b>0)||(a>0&&c<=0&&b<=0);
    }
}
