package SimpleTask;

public class Task7 {
    //Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.

    public static void main(String[] args) {
        boolean test1 = makes10(10, 5);
        boolean test2 = makes10(5, 5);
        boolean test3 = makes10(2, 5);
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
    }

    public static boolean makes10(int a, int b) {
        int sum = a + b;
        boolean b1 = sum == 10;
        if (a == 10 || b == 10 || b1){
            return true;
        }
        return false;
    }
}
