package SimpleTask;


/*
Given two int values, return their sum. Unless the two values are the same, then return double their sum.
*/

public class Task4 {
    public static void main(String[] args) {
        int test1 = sumDouble(10, 10);
        int test2 = sumDouble(10, 5);
        System.out.println(test1);
        System.out.println(test2);
    }

    public static int sumDouble(int a, int b) {
        if (a != b) {
            return a + b;
        }
        else {
            return (a + b) * 2;
        }
    }

}

