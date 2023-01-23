package SimpleTask;

/*
Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative"
        is true, then return true only if both are negative.
*/

public class Task9 {
    public static void main(String[] args) {
        boolean test1 = posNeg(10, -1, false);
        boolean test2 = posNeg(10, 2, true);
        boolean test3 = posNeg(-10, 4, false);
        boolean test4 = posNeg(10, 0, true);
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(test4);
    }

    public static boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        }
        else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }

}
