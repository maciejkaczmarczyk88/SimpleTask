package SimpleTask;
//Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.
public class Task8 {
    public static void main(String[] args) {
        boolean test1 = nearHundred(8);
        boolean test2 = nearHundred(90);
        boolean test3 = nearHundred(89);
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);

    }

    public static boolean nearHundred(int n) {
        return ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10));
    }
}
